package org.blue.webframework.sys.account.service.impl;

import javax.annotation.Resource;

import org.blue.webframework.sys.account.dao.RoleMapper;
import org.blue.webframework.sys.account.model.Role;
import org.blue.webframework.sys.account.service.RoleService;
import org.blue.webframework.sys.account.vo.RoleVo;
import org.springframework.stereotype.Service;

@Service("RoleService")
public class RoleServiceImpl implements RoleService {

	@Resource
	private RoleMapper roleMapper;

	private RoleVo model2Vo(Role role) {
		RoleVo roleVo = new RoleVo();
		roleVo.setEnable(role.getEnable());
		roleVo.setId(role.getId());
		roleVo.setName(role.getName());
		return roleVo;
	}

	private Role vo2Model(RoleVo roleVo) {
		Role role = new Role();
		role.setEnable(roleVo.getEnable());
		role.setId(roleVo.getId());
		role.setName(roleVo.getName());
		return role;
	}

	@Override
	public RoleVo getById(long id) {
		Role role = roleMapper.selectByPrimaryKey(id);
		if (role == null)
			return null;
		return model2Vo(role);
	}

	@Override
	public int add(RoleVo roleVo) {
		Role role = vo2Model(roleVo);
		int ret= roleMapper.insert(role);
		roleVo.setId(role.getId());
		return ret;
	}

	@Override
	public int update(RoleVo roleVo) {
		Role role = vo2Model(roleVo);
		return roleMapper.updateByPrimaryKey(role);
	}

}
