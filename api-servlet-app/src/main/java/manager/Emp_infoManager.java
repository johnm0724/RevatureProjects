package manager;

import java.util.List;

import common.model.Emp_info;
import dao.Emp_infoDao;
import dao.Emp_infoDaoImpl;

public class Emp_infoManager {

	private Emp_infoDao dao = new Emp_infoDaoImpl();
	
	public Emp_infoManager() {
	}
	
	public void create(Emp_info emp_info) {
		dao.create(emp_info);
	}
	
	public List<Emp_info> findAll() {
		return dao.findAll();
	}

	public static void main(String[] args) {
		List<Emp_info> emp_infos = new Emp_infoManager().findAll();
		System.out.println(emp_infos);
	}

	public Emp_info findById(int id) {
		return dao.findById(id);
	}

	public void delete(int id) {
		dao.delete(id);
	}
}
