package com.jujianfei.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 配置扫描
 *
 * @author Jeffery_Ju
 * @date 2019/8/13 9:23
 */
@Configuration
@ComponentScan("com.jujianfei.spring.*")
//默认false:
//   - 实现了接口: 使用JDK代理
//   - 没有实现接口: 使用cglib动态代理
//true: 强制使用cglib动态代理
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class AppConfig {
}
