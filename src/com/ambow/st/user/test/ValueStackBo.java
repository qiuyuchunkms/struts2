package com.ambow.st.user.test;

public class ValueStackBo {

	private String clazz;
	private String type;
	private String value;

	public ValueStackBo(String clazz, String type, String value) {
		super();
		this.clazz = clazz;
		this.type = type;
		this.value = value;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ValueStackBo [clazz=" + clazz + ", type=" + type + ", value=" + value + "]";
	}

}