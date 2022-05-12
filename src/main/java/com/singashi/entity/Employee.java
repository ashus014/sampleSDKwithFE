package com.singashi.entity;

public class Employee {

	private int id;
	private String employeeName;
	private long salary;
	
	public Employee() {
		
	}
	
	public Employee(int id, String employeeName, long salary) {
		this.id = id;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}
	
	
	
}
