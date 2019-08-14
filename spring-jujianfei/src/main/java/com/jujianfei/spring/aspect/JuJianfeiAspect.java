package com.jujianfei.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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
	public void doAccessCheck() {
		System.out.println("考前检查...");
	}
}
