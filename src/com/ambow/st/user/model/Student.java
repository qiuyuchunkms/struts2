package com.ambow.st.user.model;

 
public class Student {

	private int stuId;
	private String stuNo;
	private String stuName;
	private String stuAge;

	public Student(int stuId, String stuNo, String stuName, String stuAge) {
		super();
		this.stuId = stuId;
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuAge = stuAge;
	}

	public Student() {
		super();
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuAge() {
		return stuAge;
	}

	public void setStuAge(String stuAge) {
		this.stuAge = stuAge;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuNo=" + stuNo + ", stuName=" + stuName + ", stuAge=" + stuAge + "]";
	}

}