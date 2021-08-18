package manager;

import java.util.List;

import common.model.LoginInfo;
import dao.LoginInfoDao;
import dao.LoginInfoDaoImpl;

public class LoginInfoManager {

	private LoginInfoDao dao = new LoginInfoDaoImpl();
	
	public LoginInfoManager() {
	}
	
	public void create(LoginInfo loginInfo) {
		dao.create(loginInfo);
	}
	
	public boolean login(String username,String password) {
		
		if(dao.getUser(username, password)!=null) {
			return true;
		}
		
		return false;
	}
	
	public List<LoginInfo> findAll() {
		return dao.findAll();
	}

	public static void main(String[] args) {
		List<LoginInfo> loginInfo = new LoginInfoManager().findAll();
		System.out.println(loginInfo);
	}

	public LoginInfo findById(int id) {
		return dao.findById(id);
	}

	public void delete(int id) {
		dao.delete(id);
	}
	
	
}
