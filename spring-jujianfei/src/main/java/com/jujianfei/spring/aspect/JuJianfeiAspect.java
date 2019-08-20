package com.jujianfei.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 切面
 *
 * @author Jeffery_Ju
 * @date 2019/8/14 9:59
 */
@Component
@Aspect
public class JuJianfeiAspect {

	@Pointcut("execution(* com.jujianfei.spring.compoent..*.*(..))")
	private void pointcut() {}

	@Before("pointcut()")
	public void enteringTheExaminationRoom() {
		System.out.println("下发试卷...");
	}


	@After("pointcut()")
	public void leavingTheExaminationRoom() {
		System.out.println("离开考场...");
	}

	@Around("pointcut()")
	public Object aroundTest(ProceedingJoinPoint pjp) {
		System.out.println("进入考场...");
		Object o = null;
		try {
			o = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("做完检查...");
		return o;
	}
}
