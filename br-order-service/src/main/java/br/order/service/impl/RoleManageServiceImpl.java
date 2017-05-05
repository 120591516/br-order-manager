package br.order.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.order.common.utils.MyPredicate;
import br.order.mapper.BrOperationMapper;
import br.order.mapper.BrPermissionOperationMapper;
import br.order.mapper.BrRoleMapper;
import br.order.mapper.BrRolePermissionMapper;
import br.order.mapper.BrUserRoleMapper;
import br.order.mapper.self.BrPermissionOperationSelfMapper;
import br.order.mapper.self.BrRolePermissionSelfMapper;
import br.order.pojo.BrOperation;
import br.order.pojo.BrOperationExample;
import br.order.pojo.BrPermissionOperation;
import br.order.pojo.BrPermissionOperationExample;
import br.order.pojo.BrRole;
import br.order.pojo.BrRoleExample;
import br.order.pojo.BrRolePermission;
import br.order.pojo.BrRolePermissionExample;
import br.order.pojo.BrUser;
import br.order.pojo.BrUserRole;
import br.order.pojo.BrUserRoleExample;
import br.order.pojo.permission.PermissionResult;
import br.order.pojo.permission.RoleResult;
import br.order.service.RoleManageService;
import br.order.vo.BrRoleVo;
import br.order.vo.OperationVo;
import br.order.vo.PermissionVo;
/**
 * 角色ServiceImpl
 * @ClassName: RoleManageServiceImpl
 * @Description: TODO(角色ServiceImpl)
 * @author adminis
 * @date 2016年9月12日 下午4:33:03
 *
 */
@Service
public class RoleManageServiceImpl implements RoleManageService {
	
	/**
	 * 角色-DAO
	 */
	@Autowired
	private BrRoleMapper brRoleMapper;
	
	/**
	 * 自定义角色权限-DAO
	 */
	@Autowired
	private BrRolePermissionSelfMapper brRolePermissionSelfMapper;
	
	/**
	 * 角色权限-DAO
	 */
	@Autowired
	private BrRolePermissionMapper brRolePermissionMapper;

	/**
	 * 操作-DAO
	 */
	@Autowired
	private BrOperationMapper brOperationMapper;
	
	/**
	 * 自定义权限操作-DAO
	 */
	@Autowired
	private BrPermissionOperationSelfMapper permissionOperationSelfMapper;
	
	/**
	 * 权限操作-DAO
	 */
	@Autowired
	private BrPermissionOperationMapper brPermissionOperationMapper;

	/**
	 * 用户角色-DAO
	 */
	@Autowired
	private BrUserRoleMapper brUserRoleMapper;

	/**
	 * (查询所有角色) 
	 * <p>Title: getListBrRole</p> 
	 * <p>Description:查询所有角色 </p> 
	 * @param page 当前页码
	 * @param rows 每页显示的条数
	 * @return 
	 * @see br.order.service.RoleManageService#getListBrRole(java.lang.Integer, java.lang.Integer)
	 */
	public RoleResult getListBrRole(Integer page, Integer rows) {
		// 分页处理
		PageHelper.startPage(page, rows);
		// 执行查询
		BrRoleExample example = new BrRoleExample();
		example.setOrderByClause("role_status");
		List<BrRole> list = brRoleMapper.selectByExample(example);
		if (null != list && list.size() > 0) {
			// 取总记录数
			PageInfo<BrRole> pageInfo = new PageInfo<BrRole>(list);
			// 返回的结果
			RoleResult result = new RoleResult();
			result.setList(list);
			result.setTotal(pageInfo.getTotal());
			result.setStatus(200);
			result.setData(null);
			result.setMsg("查询成功");
			return result;
		}
		return null;
	}

	/**
	 *  (根据角色id查询角色) 
	 * <p>Title: getBrRoleByRoleId</p> 
	 * <p>Description: 根据角色id查询角色 </p> 
	 * @param id 角色ID
	 * @return 
	 * @see br.order.service.RoleManageService#getBrRoleByRoleId(java.lang.Long)
	 */
	public BrRole getBrRoleByRoleId(Long id) {

		BrRole brRole = brRoleMapper.selectByPrimaryKey(id);

		return brRole;
	}

	/**
	 * (添加角色) 
	 * <p>Title: addBrRole</p> 
	 * <p>Description:添加角色 </p> 
	 * @param brRole 角色对象
	 * @return 
	 * @see br.order.service.RoleManageService#addBrRole(br.order.pojo.BrRole)
	 */
	public int addBrRole(BrRole brRole) {

		return brRoleMapper.insert(brRole);
	}

	/**
	 * (修改角色) 
	 * <p>Title: updateBrRoleByRoleId</p> 
	 * <p>Description: 修改角色</p> 
	 * @param brRole 角色对象
	 * @return 
	 * @see br.order.service.RoleManageService#updateBrRoleByRoleId(br.order.pojo.BrRole)
	 */
	public int updateBrRoleByRoleId(BrRole brRole) {

		return brRoleMapper.updateByPrimaryKeySelective(brRole);
	}
	
	/**
	 * (添加用户角色) 
	 * <p>Title: insertUserRole</p> 
	 * <p>Description: 添加用户角色 </p> 
	 * @param brRolePermission 角色权限对象
	 * @return 
	 * @see br.order.service.RoleManageService#insertUserRole(java.util.List)
	 */
	public int insertUserRole(List<BrRolePermission> brRolePermission) {

		return brRolePermissionSelfMapper.insertRolePermission(brRolePermission);
	}
	
	/**
	 * (根据角色ID获取权限列表) 
	 * <p>Title: getRolePermissionById</p> 
	 * <p>Description:根据角色ID获取权限列表 </p> 
	 * @param roleId 角色ID
	 * @return 
	 * @see br.order.service.RoleManageService#getRolePermissionById(java.lang.Long)
	 */
	public List<PermissionResult> getRolePermissionById(Long roleId) {
		// 1.查询所有的权限
		List<PermissionResult> list = brRolePermissionSelfMapper.selectAllPermission();
		// 2.查询出该角色所拥有的权限
		List<PermissionResult> RoleList = brRolePermissionSelfMapper.selectPermissionByRoleId(roleId);

		List<PermissionResult> listResult = new ArrayList<PermissionResult>();

		for (PermissionResult p : list) {
			for (PermissionResult permissionResult : RoleList) {
				if (p.getId().longValue() == permissionResult.getId().longValue()) {
					p.setChecked(true);
					break;
				}
			}
		}
		for (PermissionResult p : list) {

			if (p.getpId() == 0) {

				PermissionResult per = new PermissionResult();

				per.setId(p.getId());

				per.setName(p.getName());

				per.setChecked(p.isChecked());

				per.setpId(p.getpId());
				for (PermissionResult p3 : list) {
					if (p3.getpId().longValue() == p.getId().longValue()) {
						per.getChildren().add(p3);
					}
				}
				listResult.add(per);
			}

		}

		return listResult;
	}
	
	/**
	 * (更新角色权限) 
	 * <p>Title: updategetRolePermission</p> 
	 * <p>Description:更新角色权限 </p> 
	 * @param rolePermissonList 角色权限列表对象
	 * @return 
	 * @see br.order.service.RoleManageService#updategetRolePermission(java.util.List)
	 */
	public int updategetRolePermission(List<BrRolePermission> rolePermissonList) {

		Long id = rolePermissonList.get(0).getRolePermissionId();
		// 先删除。在插入
		brRolePermissionMapper.deleteByPrimaryKey(id);

		return brRolePermissionSelfMapper.insertRolePermission(rolePermissonList);

	}
	
	/**
	 * (根据角色ID获取可用的权限和操作) 
	 * <p>Title: getPermissionAndOperationByIdAndOpen</p> 
	 * <p>Description:根据角色ID获取可用的权限和操作 </p> 
	 * @param roleId 角色ID
	 * @return 
	 * @see br.order.service.RoleManageService#getPermissionAndOperationByIdAndOpen(java.lang.Long)
	 */
	public List<PermissionVo> getPermissionAndOperationByIdAndOpen(Long roleId) {

		List<PermissionVo> result = new ArrayList<PermissionVo>();
		// 查询所有可用权限
		List<PermissionVo> permissionList = brRolePermissionSelfMapper.getPermissionListAndOpen();
		// 查询中间表(角色与权限)标记为true的
		List<PermissionVo> permission_select_list = brRolePermissionSelfMapper.getPermissionListByRoleId(roleId);

		for (PermissionVo brPermission : permissionList) {
			if (brPermission.getPermissionLevel().intValue() == 1) {
				// 初始化权限的子节点
				Predicate pre_child_permission = new MyPredicate("permissionParentId", brPermission.getPermissionId());
				List<PermissionVo> permissionChildList = (List<PermissionVo>) CollectionUtils.select(permissionList, pre_child_permission);
				brPermission.setChildrens(permissionChildList);
				result.add(brPermission);
			}

			// 初始化选中的权限
			Predicate pre_permission = new MyPredicate("permissionId", brPermission.getPermissionId());
			List<PermissionVo> permissionSelectList = (List<PermissionVo>) CollectionUtils.select(permission_select_list, pre_permission);
			if (CollectionUtils.isNotEmpty(permissionSelectList)) {
				brPermission.setPermissionFlag(true);
			}

			// 查询权限下所有操作功能
			List<OperationVo> operation_list = brRolePermissionSelfMapper.getBrOperationListByPermissionId(brPermission.getPermissionId());
			// 查询角色权限中间表
			BrRolePermissionExample example =new BrRolePermissionExample();
			example.createCriteria().andRoleIdEqualTo(roleId).andPermissionIdEqualTo(brPermission.getPermissionId());
			List<BrRolePermission> rolePermissionList = brRolePermissionMapper.selectByExample(example);
			for (BrRolePermission brRolePermission : rolePermissionList) {
				// 查询权限操作中间表
				List<BrPermissionOperation> per_operation_list = permissionOperationSelfMapper.getBrPer_OpeListByPerId(brRolePermission.getRolePermissionId());
				for (BrPermissionOperation brPermissionOperation : per_operation_list) {
					for (OperationVo operationVo : operation_list) {
						if (operationVo.getOperationId().equals(brPermissionOperation.getOperationId())) {
							operationVo.setOperationFlag(true);
						}
					}
				}
			}
			brPermission.setList(operation_list);
		}
		return result;
	}

	/**
	 *  (保存修改的权限操作) 
	 * <p>Title: savePermission</p> 
	 * <p>Description:保存修改的权限操作 </p> 
	 * @param roleId 角色ID
	 * @param firstIndex 一级菜单索引
	 * @param opeIndex 操作ID
	 * @param user 用户对象
	 * @return 
	 * @see br.order.service.RoleManageService#savePermission(java.lang.Long, java.util.List, java.util.List, br.order.pojo.BrUser)
	 */
	public int savePermission(Long roleId, List<Long> firstIndex, List<Long> opeIndex, BrUser user) {
		try {
			// 1.根据角色的ID查询出该角色所有的权限ID
			List<PermissionVo> permission_select_list = brRolePermissionSelfMapper.getPermissionListByRoleId(roleId);
			
			if(CollectionUtils.isNotEmpty(permission_select_list)){
				//根据角色权限删除绑定的操作
				for (PermissionVo permission : permission_select_list) {
					// 2.根据权限的ID查询出该操作ID
					BrRolePermissionExample rolePermissionExample = new BrRolePermissionExample();
					rolePermissionExample.createCriteria().andPermissionIdEqualTo(permission.getPermissionId()).andRoleIdEqualTo(roleId);
					List<BrRolePermission> rolePermissionList = brRolePermissionMapper.selectByExample(rolePermissionExample);
						if(CollectionUtils.isNotEmpty(rolePermissionList)){
							for (BrRolePermission brRolePermission : rolePermissionList) {
								// 3.根据中间表权限的ID删除所有的操作ID
								//根据角色权限删除原先绑定操作关联
								BrPermissionOperationExample permissionOperationExample = new BrPermissionOperationExample();
								permissionOperationExample.createCriteria().andRolePermissionIdEqualTo(brRolePermission.getRolePermissionId());
								brPermissionOperationMapper.deleteByExample(permissionOperationExample);
							}
						}
					
					// 4.根据角色的ID删除中间表所有的权限ID
					//根据角色和权限id删除角色权限关联
					brRolePermissionMapper.deleteByExample(rolePermissionExample);
				}
			}
//			//声明权限对应角色权限ID
//			Map<Long, Long> permission_rolePerMap = new HashMap<Long, Long>();
			// 5.添加中间表权限与角色ID(根据角色的id添加)
			for (Long permissionId : firstIndex) {
				BrRolePermission rolePermission = new BrRolePermission();
				rolePermission.setPermissionId(permissionId);
				rolePermission.setRoleId(roleId);
				brRolePermissionMapper.insertSelective(rolePermission);
				
				BrOperationExample operationExample = new BrOperationExample();
				operationExample.createCriteria().andPermissionIdEqualTo(permissionId);
				List<BrOperation> operationList = brOperationMapper.selectByExample(operationExample);
				for (BrOperation brOperation : operationList) {
					if (opeIndex.contains(brOperation.getOperationId())) {
						BrPermissionOperation bo = new BrPermissionOperation();
						bo.setOperationId(brOperation.getOperationId().longValue());
						bo.setRolePermissionId(rolePermission.getRolePermissionId());
						bo.setCreatetime(new Date());
						bo.setStatus(0);
						bo.setEditUserId(user.getUserId());
						bo.setEdittime(bo.getCreatetime());
						bo.setEditUserName(user.getUserLoginName());
						brPermissionOperationMapper.insert(bo);
						
					}
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		return 1;
	}
	
	/**
	 * (根据用户的ID查询角色列表) 
	 * <p>Title: getRoleListByUserId</p> 
	 * <p>Description: 根据用户的ID查询角色列表</p> 
	 * @param userId 用户ID
	 * @return 
	 * @see br.order.service.RoleManageService#getRoleListByUserId(java.lang.Long)
	 */
	public List<BrRoleVo> getRoleListByUserId(Long userId) {

		List<BrRoleVo> result = new ArrayList<BrRoleVo>();
		// 根据用户的Id查询角色的id
		BrUserRoleExample example = new BrUserRoleExample();
		example.createCriteria().andUserIdEqualTo(userId);
		List<BrUserRole> list = brUserRoleMapper.selectByExample(example);
		for (BrUserRole brUserRole : list) {
			BrRoleVo roleVo = new BrRoleVo();
			try {
				BeanUtils.copyProperties(roleVo, brRoleMapper.selectByPrimaryKey(brUserRole.getRoleId()));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			result.add(roleVo);
		}
		return result;
	}

}
