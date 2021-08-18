package dao;

import java.util.List;

import common.model.ManagerInfo;

public interface ManagerInfoDao {

public  void create(ManagerInfo managerinfo);
	
	public List<ManagerInfo> findAll();

	public ManagerInfo findById(int id);

	public void delete(int id);
}
