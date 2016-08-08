package fram_daoImpl;

import java.util.List;

import frame_dao.BaseDao;
import frame_util.Page;
import frame_util.SessionFactory;

public class BaseDaoImpl<T> extends SessionFactory implements BaseDao<T> {

	public void save(T t) {
		
	}

	public boolean delete(T t) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteById(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	public void update(T t) {
		// TODO Auto-generated method stub
		
	}

	public T findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public T findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> findAll(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	public long getTotal(T t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<T> findByPage(Page page, T t) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteByIds(List<Long> ids) {
		// TODO Auto-generated method stub
		return false;
	}

}
