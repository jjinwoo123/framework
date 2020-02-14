package com.bit.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter2 implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("새로운필터 before");
		System.out.println("새로운필터 작동");
		chain.doFilter(req, res);
		System.out.println("새로운필터 after");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}
	
}
