package org.blue.sys.identifyingcode.dao;

import org.blue.sys.identifyingcode.model.IdentifyingCode;

import org.apache.ibatis.annotations.Param;

public interface IdentifyingCodeMapper {

	/**
	 * 生成一条新的记录
	 * @param record
	 * @return
	 */
    int insert(IdentifyingCode record);

    /**
     * 获取今天最近一条记录离现在的秒数
     * @param phone
     * @param code
     * @param userId
     * @return
     */
    int getTimeSpanFromNow(@Param(value="phone")String phone,@Param(value="identifyingCode")String code,@Param(value="userId")String userId);
    /**
     * 获取可以用的验证码的个数
     * @param phone
     * @param code
     * @param userId
     * @return
     */
    int getUsefulIdentifyingCodeCount(@Param(value="phone")String phone,@Param(value="identifyingCode")String code,@Param(value="userId")String userId);
    
    /**
     * 今天发送的条数
     * @param phone
     * @param userId
     * @return
     */
    int selectTodaySendNum(@Param(value="phone")String phone,@Param(value="userId")String userId);
    
    /**
     * 多少分钟内发送的条数
     * @param phone
     * @param userId
     * @return
     */
    int getCountInMinutes(@Param(value="phone")String phone,@Param(value="userId")String userId,@Param(value="minute") int minute);
    
    int createTable();
}