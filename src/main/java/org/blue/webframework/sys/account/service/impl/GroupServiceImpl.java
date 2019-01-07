package org.blue.webframework.sys.account.service.impl;

import javax.annotation.Resource;

import org.blue.webframework.sys.account.dao.GroupMapper;
import org.blue.webframework.sys.account.model.Group;
import org.blue.webframework.sys.account.service.GroupService;
import org.blue.webframework.sys.account.vo.GroupVo;
import org.springframework.stereotype.Service;

@Service("GroupService")
class GroupServiceImpl implements GroupService {
	@Resource
	private GroupMapper groupMapper;

	private GroupVo model2Vo(Group group) {
		GroupVo groupVo = new GroupVo();
		groupVo.setId(group.getId());
		groupVo.setName(group.getName());
		groupVo.setEnable(group.getEnable());
		return groupVo;
	}

	private Group vo2Model(GroupVo groupVo) {
		Group group = new Group();
		group.setId(groupVo.getId());
		group.setName(groupVo.getName());
		group.setEnable(groupVo.getEnable());
		return group;
	}

	@Override
	public GroupVo getById(long id) {
		Group group = groupMapper.selectByPrimaryKey(id);
		if(group==null)
			return null;
		return model2Vo(group);
	}

	@Override
	public int add(GroupVo groupVo) {
		Group group = vo2Model(groupVo);
		int ret= groupMapper.insert(group);
		groupVo.setId(group.getId());
		return ret;
	}

	@Override
	public int update(GroupVo groupVo) {
		Group group = vo2Model(groupVo);
		return groupMapper.updateByPrimaryKey(group);

	}

	@Override
	public void recreateTable() {
		groupMapper.dropTable();
		 groupMapper.createTable();

		 
	}

}
