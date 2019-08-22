package org.blue.webframework.sys.attach.utils;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

import org.blue.webframework.exception.BusinessException;
import org.blue.webframework.sys.attach.service.AttachService;
import org.blue.webframework.sys.attach.vo.AttachVo;
import org.springframework.web.multipart.MultipartFile;

public class AttachHelper {

	public static AttachVo uploadFile(AttachService attachService, int accountId,  MultipartFile multipartFile) throws Exception {
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
		
		String uploadDir=attachService.getUploadDir();
		String uploadUri=attachService.getUploadUri();


		File file = new File(uploadDir, filePath);
		if (!file.exists())
			file.mkdirs();

		String fileName = multipartFile.getOriginalFilename();
		String fileExtName = fileName.substring(fileName.lastIndexOf('.'));
		String fileFullPath = filePath + Calendar.getInstance().getTimeInMillis() + new Random().nextInt(100000) + fileExtName;
		multipartFile.transferTo(new File(uploadDir,fileFullPath));
		
		AttachVo vo=new AttachVo();
		vo.setFilePath(uploadUri+fileFullPath);
		vo.setAddDate(new Date());
		vo.setAttachType(contentType);
		vo.setName(fileName);
		vo.setAccountId(accountId);
		
		attachService.insert(vo);

		return vo;
	}
}
