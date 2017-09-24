package com.ambow.st.user.webapp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ambow.st.user.model.Student;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.Element;
import com.opensymphony.xwork2.util.Key;
import com.opensymphony.xwork2.util.KeyProperty;

//@Controller(value = "user2Action")
public class UserAction2 extends ActionSupport {

	private Student student;
	@Element(Student.class)
	private List<Student> stuList;
	@KeyProperty("stuId")
	// Student中的标识字段,该字段需要get方法,该配置不可少
	@Element(Student.class)
	private Set<Student> stuSet = new HashSet<Student>();
	@Key(String.class)
	@Element(Student.class)
	private Map<String, Student> stuMap = new HashMap<String, Student>();

	public String addStudent() {
		System.out.println("-------简单对象");
		System.out.println(student);
		return SUCCESS;
	}

	public String addStuList() {
		System.out.println("-------List集合");
		for (Student stu : stuList) {
			System.out.println(stu);
		}
		return SUCCESS;
	}

	public String addStuSet() {
		System.out.println("-------Set集合");
		System.out.println(stuSet);
		for (Student stu : stuSet) {
			System.out.println(stu);
		}
		return SUCCESS;
	}

	public String addStuMap() {
		System.out.println("-------Map集合");
		for (String key : stuMap.keySet()) {
			System.out.println(key + "----" + stuMap.get(key));
		}
		return SUCCESS;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Student> getStuList() {
		return stuList;
	}

	public void setStuList(List<Student> stuList) {
		this.stuList = stuList;
	}

	public Set<Student> getStuSet() {
		return stuSet;
	}

	public void setStuSet(Set<Student> stuSet) {
		this.stuSet = stuSet;
	}

	public Map<String, Student> getStuMap() {
		return stuMap;
	}

	public void setStuMap(Map<String, Student> stuMap) {
		this.stuMap = stuMap;
	}

}