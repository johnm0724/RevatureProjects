package manager;

import java.util.List;

import common.model.ManagerInfo;
import dao.ManagerInfoDao;
import dao.ManagerInfoDaoImpl;

public class ManagerInfoManager {

	
	private ManagerInfoDao dao = new ManagerInfoDaoImpl();
	
	public ManagerInfoManager() {
	}
	
	public void create(ManagerInfo managerinfo) {
		dao.create(managerinfo);
	}
	
	public List<ManagerInfo> findAll() {
		return dao.findAll();
	}

	public static void main(String[] args) {
		List<ManagerInfo> managerinfo = new ManagerInfoManager().findAll();
		System.out.println(managerinfo);
	}

	public ManagerInfo findById(int id) {
		return dao.findById(id);
	}

	public void delete(int id) {
		dao.delete(id);
	}
}
