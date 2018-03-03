package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StateMain {

	public static void main(String[] args) {
		Resource res=new ClassPathResource("Spring.xml");
		BeanFactory fact=new XmlBeanFactory(res);
		State v=(State)fact.getBean("StateBean");
		
		v.display();

	}

}
