package org.blue.webframework.sys.attach.dao;

import java.util.List;

import org.blue.webframework.sys.attach.model.Attach;

public interface AttachMapper {
Attach selectByPrimaryKey(Long id);
List<Attach> selectAttachList(Attach attach);
int deleteByPrimaryKey(long id);
int insert(Attach attach);
int insertSelective(Attach attach);
int updateByPrimaryKeySelective(Attach attach);
int updateByPrimaryKey(Attach attach);

int dropTable();
int truncateTable();
int createTable();
}
