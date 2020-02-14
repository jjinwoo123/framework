package com.bit.config;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;

//세션 add remove edit에 반응
public class MyListener2 implements HttpSessionAttributeListener{
//세션 생성과 소멸에 반응
//public calss MyListener2 implements HttpSessionActivationListener
	
	@Override
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		System.out.println("addAttr()");
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		System.out.println("removeAttr()");
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		System.out.println("editAttr()");
	}

	
}
