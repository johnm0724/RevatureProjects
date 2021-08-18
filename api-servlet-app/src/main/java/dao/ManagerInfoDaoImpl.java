package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import common.model.ManagerInfo;
import common.util.DBUtil;

public class ManagerInfoDaoImpl implements ManagerInfoDao {

	@Override
	public void create(ManagerInfo managerinfo) {

		Session session = DBUtil.getInstance().getSession();

		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(managerinfo);
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
	public List<ManagerInfo> findAll() {

		Session session = DBUtil.getInstance().getSession();

		Query query = session.createQuery("FROM common.model.ManagerInfo");

		List<ManagerInfo> managerinfo = query.list();

		session.close();

		return managerinfo;
	}

	@Override
	public ManagerInfo findById(int id) {
		Session session = DBUtil.getInstance().getSession();

		Query query = session.createQuery("FROM common.model.ManagerInfo where id = :id");
		query.setInteger("id", id);
		
		 ManagerInfo managerinfo = (ManagerInfo) query.uniqueResult();

		session.close();

		return managerinfo;
	}

	@Override
	public void delete(int id) {
		Session session = DBUtil.getInstance().getSession();

		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.delete(session.get(ManagerInfo.class, new Integer(id)));
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
