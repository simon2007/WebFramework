package org.blue.webframework.sys.log.service;

import org.blue.webframework.sys.log.model.Log;

/**
 * 日志业务层接口
 */
public interface LogService {

	/**
	 * 添加日志
	 * @param log 日志
	 */
	void addLog(Log log);

	/**
	 * 根据用户id与内容添加日志
	 * @param userId 用户id
	 * @param content 内容
	 */
	void addLog(long userId,String content);


	void recreateTable();

}
