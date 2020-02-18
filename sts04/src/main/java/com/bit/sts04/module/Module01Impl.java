package com.bit.sts04.module;

public class Module01Impl implements Module01 {
	Module02 module;
	
	public void setModul(Module02 module) {
		this.module = module;
	}
	
	public void func01() {
		String msg=module.getMsg();
		System.out.println(msg);
	}

	public void func02() {
		System.out.println("func02 run...");
	}

	public void func03() {
		System.out.println("에러 발생");
		int su=0/0;
	}
	
	public void function04() {
		System.out.println("function04 run...");
	}

	public void print01() {
		System.out.println("print01 run...");
	}
}
