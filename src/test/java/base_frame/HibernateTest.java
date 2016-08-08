package base_frame;

import javax.naming.InitialContext;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

public class HibernateTest {
	private static ApplicationContext context;

	@Before
	public void getCtx() {
		context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}

	@Test
	public void testDateSource() {
		BasicDataSource dataSource = (BasicDataSource) context.getBean("dataSource");
		System.out.println(dataSource);
	}
	@Test
	public void testSessionFactory() {
		SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
		System.out.println(sessionFactory);
	}

}
