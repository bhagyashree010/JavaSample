package org.spring.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		
//		Triangle t = new Triangle();
		
//		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("Beans.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Triangle t = (Triangle)context.getBean("triangle");
		
		t.drawTriangle();
	}
}
