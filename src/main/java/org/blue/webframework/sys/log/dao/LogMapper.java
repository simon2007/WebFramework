package org.blue.webframework.sys.log.dao;

import java.util.Date;
import org.apache.ibatis.annotations.Param;
import org.blue.webframework.sys.log.model.Log;
import com.github.pagehelper.Page;

/**
 * 处理日志的持久层
 */
public interface LogMapper {

	Log selectByPrimaryKey(int id);

	int deleteByPrimaryKey(int id);

	/**
	 * 插入日志内容
	 * @param log 日志内容数据
	 * @return 受影响的行数
	 */
	int insert(Log log);

	int dropTable();

	int truncateTable();

	int createTable();

	/**
	 * 获取用户的日志
	 * @param accountId
	 * @param endDate 
	 * @param startDate 
	 * @return
	 */
	Page<Log> getAccountLogList(@Param("accountId")int accountId,@Param("startDate") Date startDate,@Param("endDate") Date endDate);
}
