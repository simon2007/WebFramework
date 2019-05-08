package org.blue.webframework.sys.attach.service;

import org.blue.webframework.sys.attach.vo.AttachVo;
import org.springframework.web.multipart.MultipartFile;

public interface AttachService {
	public AttachVo uploadFile(long accountId,  MultipartFile multipartFile) throws Exception;

	public void recreateTable();
}
