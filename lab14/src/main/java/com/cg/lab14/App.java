package com.cg.lab14;

import org.springframework.beans.factory.BeanFactory;
import java.util.Scanner;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.cg.lab14.Employee;
import com.cg.lab14.Sbu;
public class App {
	public static void main(String[] args) {
		FileSystemResource resource = new FileSystemResource("beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Sbu sbu = (Sbu)beanFactory.getBean("sbu");
		System.out.print("Enter the employee id to search it's details: ");
		int employeeIdToSearch = (new Scanner(System.in)).nextInt();
		for(Employee emp:sbu.getEmpList()) {
			if(emp.getEmpId()==employeeIdToSearch) {
				System.out.println("\nEmployee Info:");
				System.out.println("Employee ID     :"+emp.getEmpId());
				System.out.println("Employee NAME   :"+emp.getEmpName());
				System.out.println("Employee SALARY :"+emp.getSalary());
			}
		}
	}
}
