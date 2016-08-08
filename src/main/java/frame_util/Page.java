package frame_util;

/**
 * 分页工具类
 * 
 * @author cgl
 *
 *
 */
public class Page {
	private int index;// 页码
	private int start;// 分页起始页
	private int count;// 分页时每页显示的数据条数

	// get()/set()

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
