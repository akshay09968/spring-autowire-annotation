package com.apps;


import org.springframework.context.ApplicationContext;
 
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.beans.Student2;

public class StdApp2 {

	public static void main(String[] args) {
		ApplicationContext  app = new ClassPathXmlApplicationContext("config2.xml");
		
		Student2  std = (Student2)app.getBean("stdObj2");
		std.PrintStdInfo();
		
	}

}
