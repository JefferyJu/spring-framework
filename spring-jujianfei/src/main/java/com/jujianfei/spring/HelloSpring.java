package com.jujianfei.spring;

import com.jujianfei.spring.compoent.Example1;
import com.jujianfei.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * TODO
 *
 * @author Jeffery_Ju
 * @date 2019/8/13 9:05
 */
public class HelloSpring {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Object example1 = ac.getBean(Example1.class);
		System.out.println(example1);
	}




}
