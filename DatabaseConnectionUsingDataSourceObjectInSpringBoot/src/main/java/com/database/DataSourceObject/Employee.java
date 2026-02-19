package com.database.DataSourceObject;

public class Employee {
	int id;
	String name;
	String Salary;
	String DEPT;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + ", DEPT=" + DEPT + "]";
	}

	public Employee(int id, String name, String salary, String dEPT) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		DEPT = dEPT;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}

	public String getDEPT() {
		return DEPT;
	}

	public void setDEPT(String dEPT) {
		DEPT = dEPT;
	}

}
