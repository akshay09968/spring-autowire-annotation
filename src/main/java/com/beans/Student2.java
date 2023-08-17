package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student2 {

	private String sname;
	private String location;
	private Course course;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Course getCourse() {
		return course;
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public Student2(String sname, 
			String location, 
			@Autowired(required=true)
			@Qualifier("courseObj1")
			Course course) {
		super();
		this.sname = sname;
		this.location = location;
		this.course = course;
	}
	public void PrintStdInfo()
	{
		System.out.println("Student Name : " + this.getSname());
		System.out.println("Student Location : " + this.getLocation());
		System.out.println("Course Name : " + this.getCourse().getCname());
		System.out.println("Duration : " + this.getCourse().getDuration());
		System.out.println("Fees : " + this.getCourse().getFees());
	}
}
