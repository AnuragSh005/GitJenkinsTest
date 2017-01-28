package com.anurag.samplecodes;


public class Employee implements Cloneable{
	
	int id;
	String empName;
	Department dept;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
