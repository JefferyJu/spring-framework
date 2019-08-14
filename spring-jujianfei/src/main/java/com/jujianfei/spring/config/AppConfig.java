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
@ComponentScan("com.jujianfei.spring")
@EnableAspectJAutoProxy
public class AppConfig {
}
