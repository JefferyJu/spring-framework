package com.jujianfei.spring;

/**
 * TODO
 *
 * @author Jeffery_Ju
 * @date 2019/8/13 11:00
 */
public class MyTestBean {

	private String testStr = "testStr";


	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	public void test(){
		System.out.println("test");
	}
}
