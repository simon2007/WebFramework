package org.blue.webframework.sys.log.service;

import java.util.Date;

import org.blue.webframework.sys.log.model.Log;

import com.github.pagehelper.Page;

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
	 * @param accountId 账户id
	 * @param content 内容
	 */
	void addLog(int accountId,String content);


	void recreateTable();

	/**
	 * 获取用户日志
	 * @param accountId 
	 * @param pageIndex 
	 * @param pageSize 
	 * @param startDate 开始时间
	 * @param endDate 结束时间
	 * @return
	 */
	Page<Log> getAccountLogList(int accountId, int pageIndex, int pageSize, Date startDate, Date endDate);

	/**
	 * 根据id删除
	 * @param ids
	 */
	void deleteByIds(int... ids);
}
