package org.blue.webframework.sys.log.dao;

import org.blue.webframework.sys.log.model.Log;

/**
 * 处理日志的持久层
 */
public interface LogMapper {

	Log selectByPrimaryKey(long id);

	int deleteByPrimaryKey(long id);

	/**
	 * 插入日志内容
	 * @param log 日志内容数据
	 * @return 受影响的行数
	 */
	int insert(Log log);

	int dropTable();

	int truncateTable();

	int createTable();
}
