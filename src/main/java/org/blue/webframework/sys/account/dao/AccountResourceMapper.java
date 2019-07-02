package org.blue.webframework.sys.account.dao;

import org.apache.ibatis.annotations.Param;
import org.blue.webframework.sys.account.model.AccountResource;
import org.springframework.stereotype.Repository;

/**
 * 处理账户资源的持久层
 */
@Repository
public interface AccountResourceMapper {

	/**
	 * 根据id查询账户资源
	 * @param id id
	 * @return 账户资源数据
	 */
	AccountResource selectByPrimaryKey(int id);

	/**
	 * 根据id删除账户资源数据
	 * @param id id
	 * @return 受影响的行数
	 */
	int deleteByPrimaryKey(int id);

	/**
	 * 插入账户资源数据
	 * @param accountResource 账户资源数据
	 * @return 受影响的行数
	 */
	int insert(AccountResource accountResource);

	/**
	 * 根据id修改账户资源数据
	 * @param roleResource 角色资源数据
	 * @return 受影响的行数
	 */
	int updateByPrimaryKeySelective(AccountResource roleResource);

	/**
	 * 根据账户id查询该账户资源总数
	 * @param accountId 账户id
	 * @param operate 操作
	 * @param resourceId 资源id
	 * @return 账户资源总数
	 */
	int getCount(@Param("accountId") int accountId,@Param("operate")String operate,@Param("resourceId")int resourceId);

	/**
	 * 根据资源编码、操作、账户id查询该账户资源总数
	 * @param accountId 账户id
	 * @param operate 操作
	 * @param resourceCode 资源编码
	 * @return 账户资源总数
	 */
	int getCountWidthCode(@Param("accountId") int accountId,@Param("operate")String operate,@Param("resourceCode")String resourceCode);

	/**
	 * 根据账户id、操作、资源名查询该账户资源总数
	 * @param accountId 账户id
	 * @param operate 操作
	 * @param resourceName 资源名
	 * @return 账户资源总数
	 */
	int getCountWidthName(@Param("accountId")int accountId,@Param("operate") String operate,@Param("resourceName") String resourceName);

	/**
	 * 根据资源id、操作、账户id删除账户资源数据
	 * @param accountId 账户id
	 * @param operate 操作
	 * @param resourceId 资源id
	 * @return 受影响的行数
	 */
	int delete(@Param("accountId") int accountId,@Param("operate")String operate,@Param("resourceId")int resourceId);

	/**
	 * 如果存在account表，
	 * 先drop掉，然后create表，
	 * 然后再进行数据插入。
	 * @return 受影响的行数
	 */
	int dropTable();

	/**
	 * 清空表
	 * @return 受影响的行数
	 */
	int truncateTable();

	/**
	 * 创建表
	 * @return 受影响的行数
	 */
	int createTable();

}
