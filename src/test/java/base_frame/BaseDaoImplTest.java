package base_frame;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fram_daoImpl.BaseDaoImpl;
import frame_dao.BaseDao;
import frame_model.User;

public class BaseDaoImplTest {
	private static BaseDao<User> baseDao;

	@Before
	public void initPO() {
		baseDao = new BaseDaoImpl<User>();
	}

	@Test
	public void testSave() {
		baseDao.save(new User());
	}

	
}
