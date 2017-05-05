package br.order.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.order.common.utils.MyPredicate;
import br.order.mapper.BrOperationMapper;
import br.order.mapper.BrPermissionMapper;
import br.order.mapper.BrRolePermissionMapper;
import br.order.mapper.self.BrOperationMapperQu;
import br.order.mapper.self.BrRolePermissionSelfMapper;
import br.order.pojo.BrOperation;
import br.order.pojo.BrPermission;
import br.order.pojo.BrPermissionExample;
import br.order.pojo.BrRolePermission;
import br.order.pojo.BrRolePermissionExample;
import br.order.pojo.permission.PermissionResult;
import br.order.service.RolePermissionService;
import br.order.vo.PermissionVo;
import br.order.vo.UserPermissionVo;

/**
 * 角色权限ServerImpl
 * 
 * @ClassName: RolePermissionServiceImpl
 * @Description: TODO(角色权限ServerImpl)
 * @author adminis
 * @date 2016年9月12日 下午4:05:17
 *
 */
@Service
public class RolePermissionServiceImpl implements RolePermissionService {

	/**
	 * 权限-DAO
	 */
	@Autowired
	private BrPermissionMapper brPermissionMapper;

	/**
	 * 角色权限-自定义DAO
	 */
	@Autowired
	private BrRolePermissionSelfMapper brRolePermissionSelfMapper;

	/**
	 * 操作-DAO
	 */
	@Autowired
	private BrOperationMapper brOperationMapper;

	/**
	 * 自定义-操作DAO
	 */
	@Autowired
	private BrOperationMapperQu brOperationMapperQu;

	/**
	 * 角色权限-DAO
	 */
	@Autowired
	private BrRolePermissionMapper brRolePermissionMapper;

	/**
	 * (添加权限)
	 * <p>
	 * Title: insertPermission
	 * </p>
	 * <p>
	 * Description: 添加权限
	 * </p>
	 * 
	 * @param brPermission
	 *            权限对象
	 * @return
	 * @see br.order.service.RolePermissionService#insertPermission(br.order.pojo.BrPermission)
	 */
	public int insertPermission(BrPermission brPermission) {

		if (brPermission.getPermissionId() != null) {

			return brPermissionMapper.updateByPrimaryKey(brPermission);

		}

		return brPermissionMapper.insertSelective(brPermission);

	}

	/**
	 * (删除权限)
	 * <p>
	 * Title: deletePermissionById
	 * </p>
	 * <p>
	 * Description: 删除权限
	 * </p>
	 * 
	 * @param permissionId
	 *            权限ID
	 * @return
	 * @see br.order.service.RolePermissionService#deletePermissionById(java.lang.Long)
	 */
	public int deletePermissionById(Long permissionId) {

		BrPermission brPermission = brPermissionMapper.selectByPrimaryKey(permissionId);

		brPermission.setPermissionStatus(1);

		return brPermissionMapper.updateByPrimaryKey(brPermission);
	}

	/**
	 * (修改权限)
	 * <p>
	 * Title: updatePermissionById
	 * </p>
	 * <p>
	 * Description: 修改权限
	 * </p>
	 * 
	 * @param brPermission
	 *            权限对象
	 * @return
	 * @see br.order.service.RolePermissionService#updatePermissionById(br.order.pojo.BrPermission)
	 */
	public int updatePermissionById(BrPermission brPermission) {

		return brPermissionMapper.updateByPrimaryKey(brPermission);
	}

	/**
	 * (查询所有权限)
	 * <p>
	 * Title: getPermissionList
	 * </p>
	 * <p>
	 * Description: 查询所有权限
	 * </p>
	 * 
	 * @return
	 * @see br.order.service.RolePermissionService#getPermissionList()
	 */
	public List<PermissionResult> getPermissionList() {

		List<PermissionResult> list = brRolePermissionSelfMapper.selectAllPermission();

		List<PermissionResult> listResult = new ArrayList<PermissionResult>();

		for (PermissionResult p : list) {// 遍历所有的权限

			PermissionResult per = new PermissionResult();

			if (p.getpId().intValue() == 0) {

				per.setId(p.getId());

				per.setName(p.getName());

				per.setChecked(p.isChecked());

				per.setpId(p.getpId());

				for (PermissionResult p2 : list) {

					if (per.getId().longValue() == p2.getpId().longValue()) {

						per.getChildren().add(p2);
					}
				}
				listResult.add(per);
			}

		}

		return listResult;
	}

	/**
	 * (查询权限)
	 * <p>
	 * Title: getMenuList
	 * </p>
	 * <p>
	 * Description: 查询权限
	 * </p>
	 * 
	 * @return
	 * @see br.order.service.RolePermissionService#getMenuList()
	 */
	public List<BrPermission> getMenuList() {

		BrPermissionExample example = new BrPermissionExample();
		example.createCriteria().andPermissionParentIdEqualTo(0L).andPermissionStatusEqualTo(0).andPermissionLevelEqualTo(1);
		List<BrPermission> list = brPermissionMapper.selectByExample(example);

		return list;
	}

	/**
	 * (根据权限ID获取操作)
	 * <p>
	 * Title: getBrOperationList
	 * </p>
	 * <p>
	 * Description: 根据权限ID获取操作
	 * </p>
	 * 
	 * @param permissionId
	 *            权限ID
	 * @return
	 * @see br.order.service.RolePermissionService#getBrOperationList(java.lang.Long)
	 */
	public List<BrOperation> getBrOperationList(Long permissionId) {

		List<BrOperation> list = brOperationMapperQu.getBrOperationList(permissionId.intValue());

		return list;
	}

	/**
	 * (根据权限的ID获取权限)
	 * <p>
	 * Title: getBrPermissionById
	 * </p>
	 * <p>
	 * Description:根据权限的ID获取权限
	 * </p>
	 * 
	 * @param id
	 *            权限ID
	 * @return
	 * @see br.order.service.RolePermissionService#getBrPermissionById(java.lang.Long)
	 */
	public BrPermission getBrPermissionById(Long id) {

		return brPermissionMapper.selectByPrimaryKey(id);
	}

	/**
	 * (添加操作)
	 * <p>
	 * Title: addBrOperationByPermissionId
	 * </p>
	 * <p>
	 * Description:添加操作
	 * </p>
	 * 
	 * @param brOperation
	 *            操作对象
	 * @return
	 * @see br.order.service.RolePermissionService#addBrOperationByPermissionId(br.order.pojo.BrOperation)
	 */
	public int addBrOperationByPermissionId(BrOperation brOperation) {

		return brOperationMapper.insertSelective(brOperation);
	}

	/**
	 * (根据操作的ID查询操作)
	 * <p>
	 * Title: selectBrOperationById
	 * </p>
	 * <p>
	 * Description:根据操作的ID查询操作
	 * </p>
	 * 
	 * @param operationId
	 *            操作ID
	 * @return
	 * @see br.order.service.RolePermissionService#selectBrOperationById(java.lang.Long)
	 */
	public BrOperation selectBrOperationById(Long operationId) {

		return brOperationMapper.selectByPrimaryKey(operationId);
	}

	/**
	 * (跟新操作)
	 * <p>
	 * Title: updateBrOperationById
	 * </p>
	 * <p>
	 * Description:跟新操作
	 * </p>
	 * 
	 * @param brOperation
	 *            操作对象
	 * @return
	 * @see br.order.service.RolePermissionService#updateBrOperationById(br.order.pojo.BrOperation)
	 */
	public int updateBrOperationById(BrOperation brOperation) {

		return brOperationMapper.updateByPrimaryKey(brOperation);
	}

	/**
	 * (根据权限的ID查询操作)
	 * <p>
	 * Title: getBrOperationListByIdAndOpen
	 * </p>
	 * <p>
	 * Description: 根据权限的ID查询操作
	 * </p>
	 * 
	 * @param permissionId
	 *            权限ID
	 * @return
	 * @see br.order.service.RolePermissionService#getBrOperationListByIdAndOpen(java.lang.Long)
	 */
	public List<BrOperation> getBrOperationListByIdAndOpen(Long permissionId) {

		List<BrOperation> list = brOperationMapperQu.getBrOperationListByIdAndOpen(permissionId.intValue());

		return list;
	}

	/**
	 * (根据角色ID获取用户权限)
	 * <p>
	 * Title: getPermissionListByRoleId
	 * </p>
	 * <p>
	 * Description:根据角色ID获取用户权限
	 * </p>
	 * 
	 * @param rolelist
	 *            角色ID集合
	 * @return
	 * @see br.order.service.RolePermissionService#getPermissionListByRoleId(java.util.List)
	 */
	public List<UserPermissionVo> getPermissionListByRoleId(List<Long> rolelist) {

		List<UserPermissionVo> result = new ArrayList<UserPermissionVo>();

		List<BrRolePermission> rolePermissionList = getRolePermissionsByRoleId(rolelist);
		
		List<BrPermission> permissionListAll = new ArrayList<BrPermission>();
		// 根据权限的id查询权限
		for (BrRolePermission brRolePermission : rolePermissionList) {
			BrPermission brPermission = brPermissionMapper.selectByPrimaryKey(brRolePermission.getPermissionId());
			if (!permissionListAll.contains(brPermission) && brPermission.getPermissionLevel().intValue() == 1) {
				permissionListAll.add(brPermission);
			}else {
				continue;
			}
			
			BrPermissionExample pExample = new BrPermissionExample();
			pExample.createCriteria().andPermissionParentIdEqualTo(brPermission.getPermissionId());
			List<BrPermission> childrenList = brPermissionMapper.selectByExample(pExample);
			
			UserPermissionVo pVo = new UserPermissionVo();
			
			try {
				BeanUtils.copyProperties(pVo, brPermission);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			/*List<UserPermissionVo> childrenVoList = new ArrayList<UserPermissionVo>();
			for (BrPermission brPermission2 : childrenList) {
				UserPermissionVo pVo2 = new UserPermissionVo();
				try {
					BeanUtils.copyProperties(pVo2, brPermission2);
				} catch (Exception e) {
					e.printStackTrace();
				}
				childrenVoList.add(pVo2);
			}*/
			pVo.setChildrens(childrenList);
			result.add(pVo);
		}

		return result;
	}

	public List<BrRolePermission> getRolePermissionsByRoleId(List<Long> rolelist) {

		List<BrRolePermission> rolePermissionList = new ArrayList<BrRolePermission>();
		// 根据角色的id查询出权限
		for (Long RoleId : rolelist) {
			BrRolePermissionExample example = new BrRolePermissionExample();
			example.createCriteria().andRoleIdEqualTo(RoleId);
			List<BrRolePermission> list = brRolePermissionMapper.selectByExample(example);
			for (BrRolePermission brRolePermission : list) {
				if (!rolePermissionList.contains(brRolePermission)) {
					rolePermissionList.add(brRolePermission);
				}
			}
		}
		return rolePermissionList;
	}

}
