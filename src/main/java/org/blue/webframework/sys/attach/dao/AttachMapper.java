package org.blue.webframework.sys.attach.dao;

import java.util.List;

import org.blue.webframework.sys.attach.model.Attach;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachMapper {
	Attach selectByPrimaryKey(int id);

	List<Attach> selectAttachList(Attach attach);

	int deleteByPrimaryKey(int id);

	int insert(Attach attach);

	int insertSelective(Attach attach);

	int updateByPrimaryKeySelective(Attach attach);

	int updateByPrimaryKey(Attach attach);

	int dropTable();

	int truncateTable();

	int createTable();
}
