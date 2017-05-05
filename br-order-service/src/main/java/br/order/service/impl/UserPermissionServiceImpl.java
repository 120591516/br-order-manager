package br.order.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.order.common.utils.MyPredicate;
import br.order.mapper.self.BrUserRoleSelfMapper;
import br.order.pojo.BrPermission;
import br.order.service.UserPermissionService;
import br.order.vo.UserPermissionVo;

@Service
public class UserPermissionServiceImpl implements UserPermissionService {
	
	@Autowired
	private BrUserRoleSelfMapper brUserRoleSelfMapper;
	
	/*public List<UserPermissionVo> getUserPermission(Long userId) {
		List<UserPermissionVo> userPermissionVo = brUserRoleSelfMapper.getUserPermission(userId);
		List<UserPermissionVo> userPermissions = new ArrayList<UserPermissionVo>();
		for(UserPermissionVo up:userPermissionVo){
			if(up.getPermissionParentId().intValue() == 0){
				UserPermissionVo permission1= new UserPermissionVo();
				permission1.setPermissionId(up.getPermissionId());
				permission1.setPermissionName(up.getPermissionName());
				permission1.setPermissionLevel(up.getPermissionLevel());
				permission1.setPermissionUrl(up.getPermissionUrl());
				permission1.setPermissionDescribe(up.getPermissionDescribe());
				permission1.setPermissionStatus(up.getPermissionStatus());
				permission1.setPermissionParentId(up.getPermissionParentId());
				for(UserPermissionVo up1:userPermissionVo){
					if(up1.getPermissionParentId().intValue()==permission1.getPermissionId().intValue()){
						permission1.getChildrens().add(up1);
					}
				}
				userPermissions.add(permission1);
			}
		}
		return userPermissions;
	}*/
	
	/**
		 * <p>Title:getUserPermission</p> 
		 * <p>Description: 获取用户权限列表</p> 
		 * @param userId
		 * @return
	     * @see br.order.service.UserPermissionService#getUserPermission(java.lang.Long)
		 */
	@SuppressWarnings("unchecked")
	public List<UserPermissionVo> getUserPermission(Long userId) {
		List<UserPermissionVo> userPermissionVo = brUserRoleSelfMapper.getUserPermission(userId);
		List<UserPermissionVo> userPermissions = new ArrayList<UserPermissionVo>();
		for(UserPermissionVo up:userPermissionVo){
			if(up.getPermissionParentId().intValue() == 0){
				Predicate isProblem1 = new MyPredicate("permissionParentId", up.getPermissionId());
				up.setChildrens(((List<BrPermission>)CollectionUtils.select(userPermissionVo, isProblem1)));
				userPermissions.add(up);
			}
		}
		return userPermissions;
	}

}
