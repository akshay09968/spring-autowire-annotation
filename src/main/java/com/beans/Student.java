package com.beans;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

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
	
	@Autowired(required=true)
	@Qualifier("courseObj")
	public void setCourse(Course course) {
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
