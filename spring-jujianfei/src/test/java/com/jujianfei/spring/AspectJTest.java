package com.jujianfei.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 切面
 *
 * @author Jeffery_Ju
 * @date 2019/8/20 9:51
 */
@Aspect
public class AspectJTest {

	@Pointcut("execution(* *.test(..))")
	public void test(){

	}

	@Before("test()")
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@After("test()")
	public void afterTest() {
		System.out.println("afterTest");
	}

	@Around("test()")
	public Object aroundTest(ProceedingJoinPoint pjp) {
		System.out.println("before1");
		Object o = null;
		try {
			o = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("after1");
		return o;
	}

}
