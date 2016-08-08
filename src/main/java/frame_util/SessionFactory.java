package frame_util;

import javax.annotation.Resource;

import org.hibernate.Session;

public class SessionFactory {
	@Resource
	private static SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getSession();
	}
}
