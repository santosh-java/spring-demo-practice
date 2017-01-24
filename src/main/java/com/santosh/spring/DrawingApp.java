package com.santosh.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args) {
		// Triangle t = new Triangle();
		// BeanFactory bean = new XmlBeanFactory(new
		// FileSystemResource("beans.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Triangle t = (Triangle) context.getBean("triangle");
		t.draw();
		
		Triangle2 t2 = (Triangle2) context.getBean("triangle-new");
		t2.draw();
		
		System.out.println("Triangle 3 injection");
		Triangle3 t3 = (Triangle3) context.getBean("triangle3");
		t3.draw();
	}
}
