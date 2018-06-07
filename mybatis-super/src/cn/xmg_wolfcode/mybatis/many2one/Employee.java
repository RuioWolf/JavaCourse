package cn.xmg_wolfcode.mybatis.many2one;

public class Employee {
	private Long id;
	private String name;
	private Department dept;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}