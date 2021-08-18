package manager;

import java.util.List;

import common.model.Reasons;
import dao.ReasonsDao;
import dao.ReasonsDaoImpl;

public class ReasonsManager {

	
	private ReasonsDao dao = new ReasonsDaoImpl();
	
	public ReasonsManager() {
	}
	
	public void create(Reasons reason) {
		dao.create(reason);
	}
	
	public List<Reasons> findAll() {
		return dao.findAll();
	}

	public static void main(String[] args) {
		List<Reasons> reason = new ReasonsManager().findAll();
		System.out.println(reason);
	}

	public Reasons findById(int id) {
		return dao.findById(id);
	}

	public void delete(int id) {
		dao.delete(id);
	}
}
