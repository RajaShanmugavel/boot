package com.abc.raja.bean;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = -801324878251005109L;

	private String name;
	private Integer empId;
	private Float salary;

	public Employee() {
		super();
	}

	public Employee(String name, Integer empId, Float salary) {
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", salary=" + salary + "]";
	}

}
