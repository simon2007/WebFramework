package org.blue.webframework.sys.identifyingcode.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Random;

import javax.annotation.Resource;

import org.blue.webframework.exception.BusinessException;
import org.blue.webframework.sys.email.service.EmailService;
import org.blue.webframework.sys.identifyingcode.dao.IdentifyingCodeMapper;
import org.blue.webframework.sys.identifyingcode.model.IdentifyingCode;
import org.blue.webframework.sys.identifyingcode.service.IdentifyingCodeService;
import org.blue.webframework.sys.siteparameter.service.SiteParameterService;
import org.blue.webframework.utils.StringHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opensymphony.oscache.util.StringUtil;

@Service("IdentifyingCodeService")
class IdentifyingCodeServiceImpl implements IdentifyingCodeService {

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

		Integer sendNumber = siteParameterService.getParamValue("indentifying_code_send_number", 15);
		int aliveTime = siteParameterService.getParamValue("indentifying_code_alive_time", 90);
		int codeLength = siteParameterService.getParamValue("indentifying_code_length", 4);

		// 61秒内不能连续发送
		if (identifyingCodeMapper.getTimeSpanFromNow(phone, null, null) < 61)
			throw new BusinessException("2002");

		int sendNumToday = identifyingCodeMapper.selectTodaySendNum(phone, null);
		if (sendNumToday >= sendNumber)// 今天发送数量已经达到上限
			throw new BusinessException("2001");

		String checkCode = randomNumeric(codeLength);

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
		int codeLength = siteParameterService.getParamValue("indentifying_code_length", 4);
		int aliveTime = siteParameterService.getParamValue("indentifying_code_alive_time", 900);
		String emailTemplateName=siteParameterService.getParamValue("indentifying_email_template","/pcview/email");
		String emailSubject=siteParameterService.getParamValue("indentifying_email_template","验证码");

		String checkCode = randomNumeric(codeLength);

		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("code", checkCode);
		emailService.sendEmailWithModelAndView(new String[] { email }, emailSubject, emailTemplateName, map);
		IdentifyingCode codeVo = new IdentifyingCode();
		codeVo.setIdentifyingCode(checkCode);
		codeVo.setPhone(email);
		codeVo.setContent(checkCode);
		codeVo.setAliveTime(Integer.valueOf(aliveTime));
		codeVo.setAliveFlag("1");
		codeVo.setAddTime(new Date());
		identifyingCodeMapper.insert(codeVo);

	}

	private Random random = new Random(System.currentTimeMillis());

	private String randomNumeric(int codeLength) {
		StringBuffer sb = new StringBuffer(codeLength);
		while (codeLength-- > 0)
			sb.append(random.nextInt(10));
		return sb.toString();
	}

	@Override
	public int recreateTable() {
		identifyingCodeMapper.dropTable();
		return identifyingCodeMapper.createTable();
	}

}
