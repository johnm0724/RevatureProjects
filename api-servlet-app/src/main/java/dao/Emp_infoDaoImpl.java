package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import common.model.Emp_info;

import common.util.DBUtil;

public class Emp_infoDaoImpl  implements Emp_infoDao{

	@Override
	public void create(Emp_info emp_info) {

		Session session = DBUtil.getInstance().getSession();

		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(emp_info);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			throw e;// new RuntimeException(e.getCause());
		}

		session.close();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Emp_info> findAll() {

		Session session = DBUtil.getInstance().getSession();

		Query query = session.createQuery("FROM common.model.Emp_info");

		List<Emp_info> emp_info = query.list();

		session.close();

		return emp_info;
	}

	@Override
	public Emp_info findById(int id) {
		Session session = DBUtil.getInstance().getSession();

		Query query = session.createQuery("FROM common.model.Emp_info where id = :id");
		query.setInteger("id", id);
		
		Emp_info emp_info = (Emp_info) query.uniqueResult();

		session.close();

		return emp_info;
	}

	@Override
	public void delete(int id) {
		Session session = DBUtil.getInstance().getSession();

		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.delete(session.get(Emp_info.class, new Integer(id)));
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			throw e;// new RuntimeException(e.getCause());
		}

		session.close();
	}

}
