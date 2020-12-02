package com.cg.lab13;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
public class App 
{
    public static void main( String[] args )
    {
    	FileSystemResource resource = new FileSystemResource("beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Sbu sbu = (Sbu)beanFactory.getBean("sbu");
		System.out.println("SBU details");
		System.out.println("-----------------------");
		System.out.println(sbu);
    }
}
