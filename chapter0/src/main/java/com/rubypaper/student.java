package com.rubypaper; // root pakage

public class student {
	int num;
	String name;
	String dept;
	float grade;
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(int num, String name, String dept, float grade) {
		super();
		this.num = num;
		this.name = name;
		this.dept = dept;
		this.grade = grade;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}
	
	
	
}
