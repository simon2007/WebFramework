package org.blue.webframework.sys.identifyingcode.dao;

import org.blue.webframework.sys.identifyingcode.model.IdentifyingCode;

import org.apache.ibatis.annotations.Param;

public interface IdentifyingCodeMapper {

	/**
	 * 生成一条新的记录
	 * @param record 校验码记录
	 * @return 插入条数
	 */
    int insert(IdentifyingCode record);

    /**
     * 获取今天最近一条记录离现在的秒数
     * @param phone 手机
     * @param code 验证码
     * @param userId 用户的id
     * @return 秒数
     */
    int getTimeSpanFromNow(@Param(value="phone")String phone,@Param(value="identifyingCode")String code,@Param(value="userId")String userId);
    /**
     * 获取可以用的验证码的个数
     * @param phone 手机
     * @param code 验证码
     * @param userId 用户的id
     * @return 个数
     */
    int getUsefulIdentifyingCodeCount(@Param(value="phone")String phone,@Param(value="identifyingCode")String code,@Param(value="userId")String userId);
    
    /**
     * 今天发送的条数
     * @param phone 手机
     * @param userId 用户的id
     * @return 今天发送的条数
     */
    int selectTodaySendNum(@Param(value="phone")String phone,@Param(value="userId")String userId);
    
    /**
     * 多少分钟内发送的条数
     * @param phone 手机
     * @param userId 用户的id
     * @return 发送的条数
     */
    int getCountInMinutes(@Param(value="phone")String phone,@Param(value="userId")String userId,@Param(value="minute") int minute);
    
    int createTable();
}