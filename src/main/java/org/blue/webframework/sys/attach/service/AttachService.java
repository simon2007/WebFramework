package org.blue.webframework.sys.attach.service;

import org.blue.webframework.sys.attach.vo.AttachVo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 附件
 * @author Lilongwu
 *
 */
public interface AttachService {
	public AttachVo uploadFile(int accountId,  MultipartFile multipartFile) throws Exception;

	public String getUploadPrefix();
	public String getUploadPrefix(int accountId);
	
	public void recreateTable();

	public String getUrl( int attachId);
}
