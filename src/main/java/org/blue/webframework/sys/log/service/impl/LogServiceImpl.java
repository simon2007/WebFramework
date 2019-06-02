package org.blue.webframework.sys.log.service.impl;

import javax.annotation.Resource;

import org.blue.webframework.sys.log.dao.LogMapper;
import org.blue.webframework.sys.log.model.Log;
import org.blue.webframework.sys.log.service.LogService;
import org.springframework.stereotype.Service;

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
	public void addLog(long userId, String content) {
		Log log=new Log();
		log.setContent(content);
		log.setUserId(userId);
		addLog(log);
		
	}

}
