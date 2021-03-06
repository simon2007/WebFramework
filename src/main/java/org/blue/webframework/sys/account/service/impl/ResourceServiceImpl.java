package org.blue.webframework.sys.account.service.impl;



import org.blue.webframework.sys.account.dao.ResourceMapper;
import org.blue.webframework.sys.account.model.Resource;
import org.blue.webframework.sys.account.service.ResourceService;
import org.blue.webframework.sys.account.vo.ResourceVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("ResourceService")
class ResourceServiceImpl implements ResourceService{

	@Autowired
	private ResourceMapper resourceMapper;
	@Override
	public void recreateTable() {
		resourceMapper.dropTable();
		resourceMapper.createTable();
		
	}
	
	private ResourceVo model2Vo(Resource resource) {
		ResourceVo resoureVo = new ResourceVo();
		resoureVo.setId(resource.getId());
		resoureVo.setName(resource.getName());
		resoureVo.setCode(resource.getCode());
		resoureVo.setComment(resource.getComment());
		resoureVo.setOperates(resource.getOperates());
		return resoureVo;
	}

	private Resource vo2Model(ResourceVo resoureVo) {
		Resource resource = new Resource();
		
		resource.setId(resoureVo.getId());
		resource.setName(resoureVo.getName());
		resource.setCode(resoureVo.getCode());
		resource.setComment(resoureVo.getComment());
		resource.setOperates(resoureVo.getOperates());
		return resource;
	}


	@Override
	public void add(ResourceVo resourceVo) {
		//转换为model
		Resource resource=vo2Model(resourceVo);
		//执行添加
		resourceMapper.insert(resource);
		//封装id
		resourceVo.setId(resource.getId());
	}

	@Override
	public ResourceVo selectById(int id) {
		//根据id查询资源信息
		Resource resource=resourceMapper.selectByPrimaryKey(id);
		//返回
		return model2Vo(resource);
	}

}
