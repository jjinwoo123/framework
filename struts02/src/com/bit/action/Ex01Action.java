package com.bit.action;

import com.opensymphony.xwork2.Action;

public class Ex01Action implements Action{

	@Override
	public String execute() throws Exception {
//		return "success";
//		return "none";
//		return "error";
//		return "input";
//		return "login";
		return this.SUCCESS;
	}
	
}
