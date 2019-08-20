package com.jujianfei.spring.compoent;

import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author Jeffery_Ju
 * @date 2019/8/13 9:13
 */
@Component
public class Example1 /*implements Example1Interface*/ {

	public Example1() {
		System.out.println("example1");
	}

	//@Override
	public void test() {
		System.out.println("进行考试...");
	}
}
