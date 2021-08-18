package dao;

import java.util.List;

import common.model.Emp_info;


public interface Emp_infoDao {

	
	public  void create(Emp_info emp_info);
	
	public List<Emp_info> findAll();

	public Emp_info findById(int id);

	public void delete(int id);
}
