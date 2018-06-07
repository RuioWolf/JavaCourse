package cn.xmg_wolfcode.mybatis.many2many;

import java.util.ArrayList;
import java.util.List;


public class Teacher {
	private Long id;
	private String name;
	
	private List<Student> students = new ArrayList<>();
	
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
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}
}
