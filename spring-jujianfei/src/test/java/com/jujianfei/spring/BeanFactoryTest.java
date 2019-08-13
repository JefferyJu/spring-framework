package com.jujianfei.spring;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import static org.junit.Assert.assertEquals;

/**
 * TODO
 *
 * @author Jeffery_Ju
 * @date 2019/8/13 11:13
 */
@SuppressWarnings("deprecation")
public class BeanFactoryTest {

	@Test
	public void test() {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		MyTestBean bean = (MyTestBean) beanFactory.getBean("myTestBean");
		System.out.println(bean.getTestStr());
		assertEquals("testStr", bean.getTestStr());
	}
}
