package org.blue.webframework.sys.attach.service.impl;

import javax.annotation.Resource;

import org.blue.webframework.sys.attach.dao.AttachMapper;
import org.blue.webframework.sys.attach.model.Attach;
import org.blue.webframework.sys.attach.service.AttachService;
import org.blue.webframework.sys.attach.vo.AttachVo;
import org.blue.webframework.sys.siteparameter.service.SiteParameterService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("AttachService")
public class AttachServiceImpl implements AttachService {

	@Resource
	private AttachMapper attachMapper;
	@Resource
	private SiteParameterService siteParameterService;
	
	@Value("${file.uploadUri:upload/}")
	private String uploadUri;
	
	@Value("${file.uploadDir:upload/}")
	private String uploadDir;
	
	

	@Override
	public void recreateTable() {
		attachMapper.dropTable();
		attachMapper.createTable();
		
	}

	@Override
	public String getUploadDir() {
		return uploadDir ;
	}

	@Override
	public String getUploadDir(int accountId) {
		String filePath =  String.valueOf(accountId);
		return getUploadDir() + filePath;
	}
	
	public String getUploadUri()
	{
		return uploadUri;
	}
	
	public String getUploadUri(int accountId)
	{
		String filePath =  String.valueOf(accountId);
		return getUploadUri() + filePath;
	}

	@Override
	public String getUrl(int attachId) {
		Attach attach= attachMapper.selectByPrimaryKey(attachId);
		return attach.getFilePath();
	}

	@Override
	public void insert(AttachVo vo) {
		Attach attach=new Attach();
		attach.setFilePath(vo.getFilePath());
		attach.setFileType(vo.getFileType());
		attach.setName(vo.getName());
		attach.setRemoveTag(false);
		attach.setAccountId(vo.getAccountId());
		attachMapper.insert(attach);
	}

}
