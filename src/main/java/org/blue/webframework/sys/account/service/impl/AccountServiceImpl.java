package org.blue.webframework.sys.account.service.impl;

import javax.annotation.Resource;

import org.blue.webframework.exception.BusinessException;
import org.blue.webframework.sys.account.dao.AccountMapper;
import org.blue.webframework.sys.account.model.Account;
import org.blue.webframework.sys.account.service.AccountService;
import org.blue.webframework.sys.account.vo.AccountVo;
import org.blue.webframework.utils.StringHelper;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;


@Service("AccountService")
class AccountServiceImpl implements AccountService{

	@Resource
	private AccountMapper accountMapper;
	
	@Override
	public String getOpenIdById(long userId) {
		return accountMapper.getOpenIdById(userId);
	}
	
	private AccountVo model2Vo(Account account)
	{
		AccountVo accountVo=new AccountVo();
		accountVo.setEnable(account.getEnable());
		accountVo.setGroupId(account.getGroupId());
		accountVo.setId(account.getId());
		accountVo.setName(account.getName());
		accountVo.setOpenId(account.getOpenId());
		accountVo.setRoleId(account.getRoleId());
		return accountVo;
	}
	
	
	private Account vo2Model(AccountVo accountVo)
	{
		Account account=new Account();
		account.setEnable(accountVo.getEnable());
		account.setGroupId(accountVo.getGroupId());
		account.setId(accountVo.getId());
		account.setName(accountVo.getName());
		account.setOpenId(accountVo.getOpenId());
		account.setRoleId(accountVo.getRoleId());
		return account;
	}

	@Override
	public AccountVo getUserById(long userId) {
		Account account=accountMapper.selectByPrimaryKey(userId);
		if(account == null)
			return null;
		return model2Vo(account);
	}

	@Override
	public int add(AccountVo accountVo,String password) {
		Account account=vo2Model(accountVo);
		account.setPassword(StringHelper.string2MD5( password));
		int ret= accountMapper.insert(account);
		accountVo.setId(account.getId());
		
		return ret;
	}

	@Override
	public int update(AccountVo accountVo) {
		Account account=vo2Model(accountVo);
		return accountMapper.updateByPrimaryKeySelective(account);
	}

	@Override
	public int delete(long userId) {
		return accountMapper.deleteByPrimaryKey(userId);
	}

	@Override
	public void setEnable(long userId, boolean enable) {
		accountMapper.setEnable(userId, enable);
		
	}
	
	
	private Page<AccountVo> model2Vo(Page<Account> accountPage)
	{

		Page<AccountVo> accountVoPage=new Page<AccountVo>(accountPage.getPageNum(),accountPage.getPageSize());
		accountVoPage.setTotal(accountPage.getTotal());
		
		for(int i=0;i<accountPage.size();i++)
			accountVoPage.add(model2Vo(accountPage.get(i)));
		
		return accountVoPage;
	}

	@Override
	public Page<AccountVo> getList(int pageIndex, int pageSize) {
		PageHelper.startPage(pageIndex, pageSize);
		
		Account account=new Account();
		account.setEnable(true);
		Page<Account> accountPage=accountMapper.selectAll(account);
		
		return model2Vo(accountPage);
	}
	

	@Override
	public Page<AccountVo> getList(AccountVo accountVo, int pageIndex, int pageSize) {
		if(accountVo == null)
			return getList(pageIndex,pageSize);
		Account account=vo2Model(accountVo);
		PageHelper.startPage(pageIndex, pageSize);
		Page<Account> accountPage=accountMapper.selectAll(account);
		
		return model2Vo(accountPage);
	}

	@Override
	public AccountVo getByNameAndPassword(String name, String password) {
		Account account=accountMapper.getByNameAndPassword(name,StringHelper.string2MD5( password));
		if(account==null)
			return null;
		return model2Vo(account);
	}

	@Override
	public int resetPassword(String name, String oldPassword, String newPassword) {
		Account account=accountMapper.getByNameAndPassword(name,StringHelper.string2MD5( oldPassword));
		if(account == null)
			throw new BusinessException("0001");
		return accountMapper.updateByPrimaryKey(account);
	}

	@Override
	public void recreateTable() {
		accountMapper.dropTable();
		 accountMapper.createTable();
	}

}
