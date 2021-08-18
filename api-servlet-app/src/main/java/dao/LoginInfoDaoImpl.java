package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import common.model.LoginInfo;
import common.util.DBUtil;

public class LoginInfoDaoImpl implements LoginInfoDao {

	
	@Override
	public void create(LoginInfo loginInfo) {

		Session session = DBUtil.getInstance().getSession();

		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(loginInfo);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			throw e;// new RuntimeException(e.getCause());
		}

		session.close();

	}
	
	
	@Override
	public LoginInfo getUser(String username, String password) {
		Session session = DBUtil.getInstance().getSession();
		
		Query query = session.createQuery("FROM common.model.LoginInfo where username = :username and password = :password");
		query.setString("username", username);
		query.setString("password", password);
		
		LoginInfo loginInfo = (LoginInfo) query.uniqueResult();
		session.close();
		return loginInfo;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LoginInfo> findAll() {

		Session session = DBUtil.getInstance().getSession();

		Query query = session.createQuery("FROM common.model.LoginInfo");

		List<LoginInfo> loginInfo = query.list();

		session.close();

		return loginInfo;
	}

	@Override
	public LoginInfo findById(int id) {
		Session session = DBUtil.getInstance().getSession();

		Query query = session.createQuery("FROM common.model.LoginInfo where id = :id");
		query.setInteger("id", id);
		
		LoginInfo loginInfo = (LoginInfo) query.uniqueResult();

		session.close();

		return loginInfo;
	}

	@Override
	public void delete(int id) {
		Session session = DBUtil.getInstance().getSession();

		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.delete(session.get(LoginInfo.class, new Integer(id)));
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
