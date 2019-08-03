package org.blue.webframework.sys.news.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Param;
import org.blue.webframework.sys.news.model.News;
import org.springframework.stereotype.Repository;

import com.github.pagehelper.Page;

@Repository
public interface NewsMapper {

	News selectByPrimaryKey(int id);
	int deleteByPrimaryKey(int id);
	int insert(News news);
	
	Page<News> getAccountNewsList(@Param("accountId")int accountId,@Param("startDate")Date startDate,@Param("endDate")Date endDate);
	
	int dropTable();

	int truncateTable();

	int createTable();
}
