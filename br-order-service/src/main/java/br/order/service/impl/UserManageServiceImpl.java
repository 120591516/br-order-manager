package br.order.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.order.mapper.BrUserMapper;
import br.order.mapper.BrUserRoleMapper;
import br.order.mapper.self.BrUserRoleSelfMapper;
import br.order.pojo.BrRole;
import br.order.pojo.BrUser;
import br.order.pojo.BrUserExample;
import br.order.pojo.BrUserExample.Criteria;
import br.order.pojo.BrUserRole;
import br.order.pojo.BrUserRoleExample;
import br.order.pojo.permission.RoleVo;
import br.order.service.UserManageService;
import br.order.vo.UserRoleVo;

@Service
public class UserManageServiceImpl implements UserManageService {
	@Autowired
	private BrUserMapper brUserMapper;
	@Autowired
	private BrUserRoleSelfMapper brUserRoleSelfMapper;
	@Autowired
	private BrUserRoleMapper brUserRoleMapper;
	

	/**
		 * <p>Title:getUserByPage</p> 
		 * <p>Description:分页获取用户列表 </p> 
		 * @param page
		 * @param rows
		 * @return
	     * @see br.order.service.UserManageService#getUserByPage(java.lang.Integer, java.lang.Integer)
		 */
	public PageInfo<UserRoleVo> getUserByPage(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		List<UserRoleVo> list = brUserRoleSelfMapper.getUserVoByPage();
		PageInfo<UserRoleVo> pageInfo = new PageInfo<UserRoleVo>(list);
		return pageInfo;
	}

	public BrUser getUserByUserName(String userName) {
		if (StringUtils.isBlank(userName)) {
			return null;
		}
		BrUserExample example = new BrUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserStatusEqualTo(0);
		criteria.andUserLoginNameEqualTo(userName);
		List<BrUser> list = brUserMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	public BrUser login(String userName, String password) {
		System.out.println(userName);
		BrUserExample example = new BrUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserLoginNameEqualTo(userName);
		criteria.andUserPasswordEqualTo(password);
		List<BrUser> list = brUserMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	/**
		 * <p>Title:insertBrUser</p> 
		 * <p>Description:新增用户 </p> 
		 * @param brUser
		 * @return
	     * @see br.order.service.UserManageService#insertBrUser(br.order.pojo.BrUser)
		 */
	public int insertBrUser(BrUser brUser) {
		return brUserMapper.insertSelective(brUser);
	}

	/**
		 * <p>Title:updateBrUser</p> 
		 * <p>Description:修改用户 </p> 
		 * @param brUser
		 * @return
	     * @see br.order.service.UserManageService#updateBrUser(br.order.pojo.BrUser)
		 */
	public int updateBrUser(BrUser brUser) {
		return brUserMapper.updateByPrimaryKeySelective(brUser);
	}

	/**
		 * <p>Title:insertUserRole</p> 
		 * <p>Description: 新增用户角色</p> 
		 * @param strRolesId
		 * @param userId
		 * @return
	     * @see br.order.service.UserManageService#insertUserRole(java.lang.String, java.lang.Long)
		 */
	public int insertUserRole(String strRolesId, Long userId) {
		String[] roleIds = strRolesId.split(",");
		List<BrUserRole> brUserRoles = new ArrayList<BrUserRole>();
		for (String roleId : roleIds) {
			BrUserRole brUserRole = new BrUserRole();
			brUserRole.setUserId(userId);
			brUserRole.setRoleId(Long.valueOf(roleId));
			brUserRoles.add(brUserRole);
		}
		return brUserRoleSelfMapper.insertUserRole(brUserRoles);
	}

	/**
		 * <p>Title:updateUserRole</p> 
		 * <p>Description: 修改用户角色</p> 
		 * @param strRolesId
		 * @param userId
		 * @return
	     * @see br.order.service.UserManageService#updateUserRole(java.lang.String, java.lang.Long)
		 */
	public int updateUserRole(String strRolesId, Long userId) {
		String[] roleIds = strRolesId.split(",");
		BrUserRoleExample example = new BrUserRoleExample();
		br.order.pojo.BrUserRoleExample.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		int i = brUserRoleMapper.deleteByExample(example);
		List<BrUserRole> brUserRoles = new ArrayList<BrUserRole>();
		for (String roleId : roleIds) {
			BrUserRole brUserRole = new BrUserRole();
			brUserRole.setUserId(userId);
			brUserRole.setRoleId(Long.valueOf(roleId));
			brUserRoles.add(brUserRole);
		}
		return brUserRoleSelfMapper.insertUserRole(brUserRoles);
	}

	/**
		 * <p>Title:getUserRoleById</p> 
		 * <p>Description: 根据用户id查询用户角色信息</p> 
		 * @param userId
		 * @return
	     * @see br.order.service.UserManageService#getUserRoleById(java.lang.Long)
		 */
	public UserRoleVo getUserRoleById(Long userId) {
		return brUserRoleSelfMapper.getUserRoleById(userId);
	}

	/**
		 * <p>Title:getBrUserById</p> 
		 * <p>Description: 根据用户id查询用户信息</p> 
		 * @param userId
		 * @return
	     * @see br.order.service.UserManageService#getBrUserById(java.lang.Long)
		 */
	public BrUser getBrUserById(Long userId) {
		return brUserMapper.selectByPrimaryKey(userId);
	}

	/**
		 * <p>Title:getCountByUserName</p> 
		 * <p>Description: 用户重名校验</p> 
		 * @param userName
		 * @param userId
		 * @return
	     * @see br.order.service.UserManageService#getCountByUserName(java.lang.String, java.lang.Long)
		 */
	public int getCountByUserName(String userName, Long userId) {
		int i = 0;
		BrUserExample example = new BrUserExample();
		Criteria criteria = example.createCriteria();
		if (userId != null && !userId.equals("")) {
			// 更新
			criteria.andUserStatusEqualTo(0);
			criteria.andUserLoginNameEqualTo(userName);
			criteria.andUserIdNotEqualTo(userId);
			i = brUserMapper.countByExample(example);
		} else {
			// 新增
			criteria.andUserStatusEqualTo(0);
			criteria.andUserLoginNameEqualTo(userName);
			i = brUserMapper.countByExample(example);
		}
		return i;
	}

	/**
		 * <p>Title:getRolesByUserId</p> 
		 * <p>Description: 根据用户id获取角色列表</p> 
		 * @param userId
		 * @return
	     * @see br.order.service.UserManageService#getRolesByUserId(java.lang.Long)
		 */
	public List<RoleVo> getRolesByUserId(Long userId) {
		// 查询出所有角色
		List<RoleVo> rolesList = brUserRoleSelfMapper.getAllRoles();
		// 查询出该用户id所属角色
		List<RoleVo> roles = brUserRoleSelfMapper.getRolesByUserId(userId);
		for (RoleVo roleModel1 : rolesList) {
			for (RoleVo roleModel2 : roles) {
				if (roleModel1.getId() == roleModel2.getId()) {
					roleModel1.setChecked(true);
					break;
				}
			}
		}
		return rolesList;
	}

}
