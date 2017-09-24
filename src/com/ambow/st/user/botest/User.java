/**
 * 
 */
package com.ambow.st.user.botest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pc
 * 
 */
public class User {

	private String userName;
	private List<Address> addresses;

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	/**
	 * 
	 */
	public User() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 ************************************************************************** 
	 * @method FIXME 2017年6月9日 下午2:11:24
	 * @Company 中智
	 * @Copyright: Copyright (c) 2017
	 * @Team 互联网事业部
	 * @author 邱豫春
	 * @param args
	 ************************************************************************** 
	 ** 
	 */
	public static void main(String[] args) {
		Address address1 = new Address("北京");
		Address address2 = new Address("上海");
		List<Address> addresses = new ArrayList<Address>();
		addresses.add(address1);
		addresses.add(address2);
		User user = new User("邱豫春", addresses);
		String name = user.getAddresses().get(1).getAddressName();
		System.out.println(name);
	}

	public User(String userName, List<Address> addresses) {
		super();
		this.userName = userName;
		this.addresses = addresses;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
