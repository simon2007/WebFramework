package org.blue.sys.identifyingcode.service.impl;

import java.util.Date;
import java.util.HashMap;

import javax.annotation.Resource;

import org.apache.commons.lang3.RandomStringUtils;
import org.blue.exception.BusinessException;
import org.blue.sys.email.service.EmailService;
import org.blue.sys.identifyingcode.dao.IdentifyingCodeMapper;
import org.blue.sys.identifyingcode.model.IdentifyingCode;
import org.blue.sys.identifyingcode.service.IdentifyingCodeService;
import org.blue.sys.siteparameter.service.SiteParameterService;
import org.blue.utils.StringHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opensymphony.oscache.util.StringUtil;

@Service("IdentifyingCodeService")
public class IdentifyingCodeServiceImpl implements IdentifyingCodeService {


	@Resource
	private SiteParameterService siteParameterService;

	@Resource
	private IdentifyingCodeMapper identifyingCodeMapper;

	@Autowired
	private EmailService emailService;

	@Override
	public void sendSms(String phone, String templetId) {

		if (StringHelper.isBlank(phone))
			throw new BusinessException("2003");

		Integer sendNumber = siteParameterService.getParamValue("send_number", 15);
		int aliveTime = siteParameterService.getParamValue("indentifying_code_alive_time", 90);
		int codeLength = siteParameterService.getParamValue("send_number_length", 4);

		// 61秒内不能连续发送
		if (identifyingCodeMapper.getTimeSpanFromNow(phone, null, null) < 61)
			throw new BusinessException("2002");

		int sendNumToday = identifyingCodeMapper.selectTodaySendNum(phone, null);
		if (sendNumToday >= sendNumber)// 今天发送数量已经达到上限
			throw new BusinessException("2001");

		String checkCode = RandomStringUtils.randomNumeric(codeLength);

		IdentifyingCode codeVo = new IdentifyingCode();
		codeVo.setIdentifyingCode(checkCode);
		codeVo.setPhone(phone);
		codeVo.setContent(checkCode);
		codeVo.setAliveTime(Integer.valueOf(aliveTime));
		codeVo.setAliveFlag("1");
		codeVo.setAddTime(new Date());
		identifyingCodeMapper.insert(codeVo);
	}

	@Override
	public boolean vaildCode(String phone, String code) {
		if (StringUtil.isEmpty(phone) || StringUtil.isEmpty(code))
			return false;

		boolean ret = identifyingCodeMapper.getUsefulIdentifyingCodeCount(phone, code, null) > 0;
		return ret;
	}

	@Override
	public void sendEmail(String email, String templetId) {
		int codeLength = siteParameterService.getParamValue("send_number_length", 4);
		int aliveTime = siteParameterService.getParamValue("indentifying_code_alive_time", 900);

		String checkCode = RandomStringUtils.randomNumeric(codeLength);

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("code", checkCode);
		emailService.sendEmailWithModelAndView(new String[]{email}, "找鞋网验证", "/pcview/email", map);
		IdentifyingCode codeVo = new IdentifyingCode();
		codeVo.setIdentifyingCode(checkCode);
		codeVo.setPhone(email);
		codeVo.setContent(checkCode);
		codeVo.setAliveTime(Integer.valueOf(aliveTime));
		codeVo.setAliveFlag("1");
		codeVo.setAddTime(new Date());
		identifyingCodeMapper.insert(codeVo);

	}

	@Override
	public int createTable() {
		return identifyingCodeMapper.createTable();
	}

}
