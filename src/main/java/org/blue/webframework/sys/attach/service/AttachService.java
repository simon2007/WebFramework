package org.blue.webframework.sys.attach.service;

import org.blue.webframework.sys.attach.vo.AttachVo;

/**
 * 附件
 * @author Lilongwu
 *
 */
public interface AttachService {

	public String getUploadDir();
	public String getUploadDir(int accountId);
	
	public String getUploadUri();
	public String getUploadUri(int accountId);
	
	public void recreateTable();

	public String getUrl( int attachId);

	public void insert(AttachVo vo);
}
