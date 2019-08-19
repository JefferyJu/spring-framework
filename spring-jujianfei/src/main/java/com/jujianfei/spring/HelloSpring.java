package com.jujianfei.spring;

import com.jujianfei.spring.compoent.Example1Interface;
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
		// 1.
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		// 目标对象实现了接口, 并且不指定@EnableAspectJAutoProxy(proxyTargetClass = true)时才会使用JDK动态代理
		Example1Interface example1Interface = ac.getBean(Example1Interface.class);
		example1Interface.test();

		//Example1 example1 = ac.getBean(Example1.class);
		//example1.test();
	}




}
