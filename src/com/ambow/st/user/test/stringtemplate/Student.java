package com.ambow.st.user.test.stringtemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
	
	private String name;
	
	private String $optional;
	
	private List<String> classes = new ArrayList<String>();
	
	private Map<String, String> teachers = new HashMap<String, String>();
	
	/**
	 * @return the teachers
	 */
	public Map<String, String> getTeachers() {
		return teachers;
	}

	/**
	 * @param teachers the teachers to set
	 */
	public void setTeachers(Map<String, String> teachers) {
		this.teachers = teachers;
	}

	/**
	 * @return the $optional
	 */
	public String get$optional() {
		return $optional;
	}

	/**
	 * @param $optional the $optional to set
	 */
	public void set$optional(String $optional) {
		this.$optional = $optional;
	}

	/**
	 * @return the classes
	 */
	public List<String> getClasses() {
		return classes;
	}

	/**
	 * @param classes the classes to set
	 */
	public void setClasses(List<String> classes) {
		this.classes = classes;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
