package frame_model;

/**
 * user实体类 ，测试用
 * 
 * @author cgl
 *
 *
 */
public class User {
	private String name;
	private Long id;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

	public User(String name, Long id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public User() {
		super();
	}

}
