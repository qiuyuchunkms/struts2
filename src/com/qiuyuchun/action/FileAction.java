package com.qiuyuchun.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/file")
@ResultPath(value="/")
public class FileAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	 
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	@Action(value="Welcome", results={
		@Result(name="success",location="/jsp/welcome_user.jsp")
	})
	public String execute() {

		return SUCCESS;

	}
	@Action(value="login", results={
			@Result(name="success",location="/jsp/login.jsp")
	})
	public String login() {
		
		return SUCCESS;
		
	}
}