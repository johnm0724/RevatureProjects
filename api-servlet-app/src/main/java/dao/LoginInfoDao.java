package dao;

import java.util.List;

import common.model.LoginInfo;

public interface  LoginInfoDao {

	

	public void create(LoginInfo loginInfo);
	
	public List<LoginInfo> findAll();

	public LoginInfo findById(int id);
	
	public LoginInfo getUser(String username,String password);

	public void delete(int id);
}
