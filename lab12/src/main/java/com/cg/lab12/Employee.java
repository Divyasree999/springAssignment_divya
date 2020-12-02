package com.cg.lab12;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private SBU businessUnit;
	private int age;

	public Employee() {

	}

	public Employee(int employeeId, String employeeName, double salary, SBU businessUnit, int age) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.businessUnit = businessUnit;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public SBU getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}

	public void getSbuDetails() {
		System.out.println("Employee details");
		System.out.println("*****************************");
		System.out.println("Employee [empAge=" + getAge() + ", empId=" + getEmployeeId() + ", empName="
				+ getEmployeeName() + ", empSalary=" + getSalary());
		businessUnit.getBusineesUnitDetails();
	}
}
