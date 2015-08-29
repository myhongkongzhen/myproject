/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.dao.impl.BaseDaoImpl.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2014-10-13 下午08:11:52 
 *   LastChange: 2014-10-13 下午08:11:52 
 *      History:
 * </pre>
 **************************************************************************/
package z.z.w.test.dao.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import z.z.w.test.dao.IBaseDao;

/**
 * z.z.w.test.dao.impl.BaseDaoImpl.java
 */

public class BaseDaoImpl<T> implements IBaseDao<T> {

	/**
	 * <br>
	 * Created on: 2014-10-13 下午08:12:25
	 */
	private static final long serialVersionUID = 8117749077540447951L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see z.z.w.test.dao.IBaseDao#save(java.lang.Object)
	 */
	public Serializable save(T t) {
		return this.getCurrentSession().save(t);
	}

	private SessionFactory sessionFactory = null;

	/**
	 * <br>
	 * Created on: 2014-10-13 下午03:02:11
	 * 
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * <br>
	 * Created on: 2014-10-13 下午03:02:11
	 * 
	 * @param sessionFactory
	 *            the sessionFactory to set
	 */
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * 
	 * <br>
	 * Created on: 2014-10-13 下午03:02:38
	 * 
	 * @return
	 */
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
}
