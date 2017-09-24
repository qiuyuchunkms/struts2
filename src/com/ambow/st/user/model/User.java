package com.ambow.st.user.model;

public class User {

 	private String name;
	private String name2;
	private String age;
	private String userAge;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getUserAge() {
		return userAge;
	}
	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", name2=" + name2 + ", age=" + age + ", userAge=" + userAge + "]";
	}

	 
 
	

}
