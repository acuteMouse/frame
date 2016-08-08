package frame_dao;

import java.util.List;

import frame_util.Page;

/**
 * 数据库基本操作，引入泛型机制
 * 
 * @author cgl 2016-08-05
 * @version 0.1
 */
public interface BaseDao<T> {
	/**
	 * 保存
	 * 
	 * @param t
	 */
	public void save(T t);

	/**
	 * 直接删除
	 * 
	 * @param t
	 * @return 是否成功, boolean
	 */
	public boolean delete(T t);

	/**
	 * 根据id删除
	 * 
	 * @param id
	 * @return
	 */
	public boolean deleteById(long id);

	/**
	 * 修改
	 * 
	 * @param t
	 */
	public void update(T t);

	/**
	 * 根据id 查询
	 * 
	 * @param id
	 * @return
	 */
	public T findById(long id);

	/**
	 * 提供以字符串查找的功能
	 * 
	 * @param name
	 * @return
	 */
	public T findByName(String name);

	/**
	 * 根据泛型参数查找某个实体类的所有值
	 * 
	 * @param t
	 * @return List<T>
	 */
	public List<T> findAll(T t);

	/**
	 * 
	 * @param t
	 * @return long 参数对象在数据库中的总数，分页时常用
	 */
	public long getTotal(T t);

	/**
	 * 分页查询
	 * 
	 * @param page，分页需要的信息，起始页，每页显示数据
	 * @param t
	 *            实体对象
	 * @return 带有分页的list
	 */
	public List<T> findByPage(Page page, T t);

	/**
	 * 支持批量利用id删除
	 * 
	 * @param ids
	 * @return
	 */
	public boolean deleteByIds(List<Long> ids);
}
