package org.blue.webframework.sys.log.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.blue.webframework.sys.log.dao.LogMapper;
import org.blue.webframework.sys.log.model.Log;
import org.blue.webframework.sys.log.service.LogService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

/**
 * 处理日志业务层的实现类
 */
@Service("LogService")
public class LogServiceImpl implements LogService {

	@Resource
	LogMapper logMapper;

	@Override
	public void addLog(Log log) {
		logMapper.insert(log);

	}

	@Override
	public void recreateTable() {
		logMapper.dropTable();
		logMapper.createTable();

	}

	@Override
	public void addLog(int accountId, String content) {
		Log log = new Log();
		log.setContent(content);
		log.setAccountId(accountId);
		addLog(log);

	}

	@Override
	public Page<Log> getAccountLogList(int accountId, int pageIndex, int pageSize, Date startDate, Date endDate) {

		PageHelper.startPage(pageIndex, pageSize);
		return logMapper.getAccountLogList(accountId, startDate, endDate);
	}

	@Transactional
	@Override
	public void deleteByIds(int... ids) {
		for (int i = 0; i < ids.length; i++)
			logMapper.deleteByPrimaryKey(ids[i]);

	}

}
