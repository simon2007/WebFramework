package org.blue.webframework.sys.account.service.impl;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.blue.webframework.exception.BusinessException;
import org.blue.webframework.exception.SystemException;
import org.blue.webframework.sys.account.dao.AccountMapper;
import org.blue.webframework.sys.account.model.Account;
import org.blue.webframework.sys.account.service.AccountService;
import org.blue.webframework.sys.account.utils.Argon2Utils;
import org.blue.webframework.sys.account.utils.TokenUtils;
import org.blue.webframework.sys.account.vo.AccountLoginVo;
import org.blue.webframework.sys.account.vo.AccountPasswordResetVo;
import org.blue.webframework.sys.account.vo.AccountVo;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service("AccountService")
class AccountServiceImpl implements AccountService {

	Logger logger = LogManager.getLogger(getClass());
	@Resource
	private AccountMapper accountMapper;

	@Override
	public String getOpenIdById(int userId) {
		return accountMapper.getOpenIdById(userId);
	}

	/**
	 * 模型(Model)到视图(view)
	 * 
	 * @param account
	 * @return
	 */
	private AccountVo model2Vo(Account account) {
		AccountVo accountVo = new AccountVo();
		accountVo.setEnable(account.getEnable());
		accountVo.setGroupId(account.getGroupId());
		accountVo.setId(account.getId());
		accountVo.setName(account.getName());
		accountVo.setOpenId(account.getOpenId());
		accountVo.setRoleId(account.getRoleId());
		accountVo.setAvatar(account.getAvatar());
		accountVo.setCreatedTime(account.getCreatedTime());
		return accountVo;
	}

	private Account vo2Model(AccountVo accountVo) {
		Account account = new Account();
		account.setEnable(accountVo.getEnable());
		account.setGroupId(accountVo.getGroupId());
		account.setId(accountVo.getId());
		account.setName(accountVo.getName());
		account.setOpenId(accountVo.getOpenId());
		account.setRoleId(accountVo.getRoleId());
		account.setAvatar(accountVo.getAvatar());
		return account;
	}

	@Override
	public AccountVo getAccountById(int userId) {
		Account account = accountMapper.selectByPrimaryKey(userId);
		if (account == null)
			return null;
		return model2Vo(account);
	}

	@Override
	public int add(AccountVo accountVo, String password) {
		Account account = vo2Model(accountVo);
		account.setPassword(Argon2Utils.encode(password));
		int ret = accountMapper.insert(account);
		accountVo.setId(account.getId());

		return ret;
	}

	@Override
	public int update(AccountVo accountVo) {
		Account account = vo2Model(accountVo);
		return accountMapper.updateByPrimaryKeySelective(account);
	}

	@Override
	public int delete(int userId) {
		return accountMapper.deleteByPrimaryKey(userId);
	}

	@Override
	public void setEnable(int userId, boolean enable) {
		accountMapper.setEnable(userId, enable);

	}

	private Page<AccountVo> model2Vo(Page<Account> accountPage) {

		Page<AccountVo> accountVoPage = new Page<AccountVo>(accountPage.getPageNum(), accountPage.getPageSize());
		accountVoPage.setTotal(accountPage.getTotal());

		for (int i = 0; i < accountPage.size(); i++)
			accountVoPage.add(model2Vo(accountPage.get(i)));

		return accountVoPage;
	}

	@Override
	public Page<AccountVo> getList(int pageIndex, int pageSize) {
		PageHelper.startPage(pageIndex, pageSize);

		Account account = new Account();
		account.setEnable(true);
		Page<Account> accountPage = accountMapper.selectAll(account);

		return model2Vo(accountPage);
	}

	@Override
	public Page<AccountVo> getList(AccountVo accountVo, int pageIndex, int pageSize) {
		if (accountVo == null)
			return getList(pageIndex, pageSize);
		Account account = vo2Model(accountVo);
		PageHelper.startPage(pageIndex, pageSize);
		Page<Account> accountPage = accountMapper.selectAll(account);

		return model2Vo(accountPage);
	}

	@Override
	public AccountVo login(AccountLoginVo accountLoginVo) {
		if (StringUtils.isBlank(accountLoginVo.getName()))
			throw new BusinessException("usernameIsEmpty");

		if (StringUtils.isBlank(accountLoginVo.getPassword()))
			throw new BusinessException("passwordIsEmpty");

		Account account = accountMapper.getByName(accountLoginVo.getName());
		if (account == null)
			throw new BusinessException("userIsNull");

		if (Argon2Utils.verify(accountLoginVo.getPassword(), account.getPassword()))
			return model2Vo(account);
		throw new BusinessException("passwordError");
	}

	@Override
	public void resetPassword(AccountPasswordResetVo accountPasswordResetVo) {
		if (StringUtils.isBlank(accountPasswordResetVo.getName()))
			throw new BusinessException("usernameIsEmpty");

		if (StringUtils.isBlank(accountPasswordResetVo.getNewPassword()))
			throw new BusinessException("passwordIsEmpty");

		if (StringUtils.isBlank(accountPasswordResetVo.getOldPassword()))
			throw new BusinessException("passwordIsEmpty");

		// 根据用户名和密码查询用户数据
		Account account = accountMapper.getByName(accountPasswordResetVo.getName());
		if (account == null)
			// 为null：抛出异常
			throw new BusinessException("userIsNull");

		if (Argon2Utils.verify(accountPasswordResetVo.getOldPassword(), account.getPassword())) {
			// 新密码
			account.setPassword(Argon2Utils.encode(accountPasswordResetVo.getNewPassword()));
			// 更新密码
			accountMapper.updateByPrimaryKey(account);
		} else
			throw new BusinessException("passwordError");
	}

	@Override
	public void recreateTable() {
		logger.info("recreateTable");
		accountMapper.dropTable();
		accountMapper.createTable();
	}

	public int getRoleIdFromToken(String token) {
		if (StringUtils.isBlank(token))
			throw new SystemException("tokenIsNull");

		Integer roleId = TokenUtils.getRoleIdFromToken(token);
		if (roleId == null)
			throw new SystemException("tokenError");
		return roleId;
	}

	public int getGroupIdFromToken(String token) {
		if (StringUtils.isBlank(token))
			throw new SystemException("tokenIsNull");
		Integer groupId = TokenUtils.getGroupIdFromToken(token);
		if (groupId == null)
			throw new SystemException("tokenError");
		return groupId;
	}

	public String getNameFromToken(String token) {
		if (StringUtils.isBlank(token))
			throw new SystemException("tokenIsNull");
		return TokenUtils.getNameFromToken(token);
	}

	public int getAccountIdFromToken(String token) {
		if (StringUtils.isBlank(token))
			throw new SystemException("tokenIsNull");
		Integer accountId = TokenUtils.getAccountIdFromToken(token);
		if (accountId == null)
			throw new SystemException("tokenError");
		return accountId;
	}

	public String getUserToken(AccountVo account) {
		return TokenUtils.getToken(account);
	}

	@Override
	public AccountVo getAccountFromToken(String token) {
		if (StringUtils.isBlank(token))
			throw new SystemException("tokenIsNull");
		Integer accountId = TokenUtils.getAccountIdFromToken(token);
		if (accountId == null)
			throw new SystemException("tokenError");
		return getAccountById(accountId);
	}

}
