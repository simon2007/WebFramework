package org.blue.webframework.sys.news.service.impl;

import javax.annotation.Resource;

import org.blue.webframework.sys.news.dao.NewsMapper;
import org.blue.webframework.sys.news.service.NewsService;
import org.springframework.stereotype.Service;

@Service("NewsService")
public class NewsServiceImpl implements NewsService {

	
	@Resource
	private NewsMapper newsMappper;
	
	@Override
	public void recreateTable() {
		newsMappper.dropTable();
		newsMappper.createTable();
		
	}

}
