package com.apps;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.beans.Student;

public class StdApp1 {

	public static void main(String[] args) {
		ApplicationContext  app = new ClassPathXmlApplicationContext("config.xml");
		
		Student  std = (Student)app.getBean("stdObj");
		std.PrintStdInfo();
		
	}

}
