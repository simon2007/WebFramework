package org.blue.webframework.sys.attach.service.impl;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

import javax.annotation.Resource;

import org.blue.webframework.exception.BusinessException;
import org.blue.webframework.sys.attach.dao.AttachMapper;
import org.blue.webframework.sys.attach.model.Attach;
import org.blue.webframework.sys.attach.service.AttachService;
import org.blue.webframework.sys.attach.vo.AttachVo;
import org.blue.webframework.sys.siteparameter.service.SiteParameterService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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
	public AttachVo uploadFile(int accountId,  MultipartFile multipartFile) throws Exception {
		String filePath =  String.valueOf(accountId);
		String contentType=multipartFile.getContentType().toLowerCase(Locale.getDefault());
		
		if(contentType.contains("image"))
			filePath+="/images/";
		else if(contentType.contains("audio"))
			filePath+="/audio/";
		else if(contentType.contains("video"))
				filePath+= "/video/";
		else if(contentType.contains("text"))
			filePath+="/text/";
		else
			filePath+="/files/";
		
		if (multipartFile.getSize() == 0)
			throw new BusinessException("002");
		


		File file = new File(uploadDir, filePath);
		if (!file.exists())
			file.mkdirs();

		String fileName = multipartFile.getOriginalFilename();
		String fileExtName = fileName.substring(fileName.lastIndexOf('.'));
		String fileFullPath = filePath + Calendar.getInstance().getTimeInMillis() + new Random().nextInt(100000) + fileExtName;
		multipartFile.transferTo(new File(uploadDir,fileFullPath));


		Attach attach=new Attach();
		attach.setFilePath(uploadUri+fileFullPath);
		attach.setFileType(contentType);
		attach.setName(fileName);
		attach.setRemoveTag(false);
		attach.setAccountId(accountId);
		attachMapper.insert(attach);
		
		AttachVo vo=new AttachVo();
		vo.setFilePath(uploadUri+fileFullPath);
		vo.setId(attach.getId());
		vo.setAddDate(new Date());
		vo.setAttachType(contentType);
		vo.setName(fileName);
		vo.setAccountId(accountId);
		vo.setId(attach.getId());
		return vo;
	}

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

}
