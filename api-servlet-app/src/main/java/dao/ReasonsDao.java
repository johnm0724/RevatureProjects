package dao;

import java.util.List;

import common.model.Reasons;

public  interface ReasonsDao {

	

	public void create(Reasons reason);
	
	public List<Reasons> findAll();

	public Reasons findById(int id);

	public void delete(int id);

}
