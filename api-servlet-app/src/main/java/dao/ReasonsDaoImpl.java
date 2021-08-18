package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import common.model.Reasons;
import common.util.DBUtil;

public class ReasonsDaoImpl implements ReasonsDao{
	
	@Override
	public void create(Reasons reason) {

		Session session = DBUtil.getInstance().getSession();

		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(reason);
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
	public List<Reasons> findAll() {

		Session session = DBUtil.getInstance().getSession();

		Query query = session.createQuery("FROM common.model.Reasons");

		List<Reasons> reason = query.list();

		session.close();

		return reason;
	}

	@Override
	public Reasons findById(int id) {
		Session session = DBUtil.getInstance().getSession();

		Query query = session.createQuery("FROM common.model.Reasons where id = :id");
		query.setInteger("id", id);
		
		Reasons reason = (Reasons) query.uniqueResult();

		session.close();

		return reason;
	}

	@Override
	public void delete(int id) {
		Session session = DBUtil.getInstance().getSession();

		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.delete(session.get(Reasons.class, new Integer(id)));
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
