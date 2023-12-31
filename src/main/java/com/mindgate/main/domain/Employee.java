package com.mindgate.main.domain;

import java.util.Date;

public class Employee {
	
	private String employeeId;
	private String password;
	private String firstName;
	private String lastName;
	private String gender;
	private long phoneNo;
	private String email;
	private Date dateOfBirth;
	private String designation;
	private double salary;
	private String projectId;
	private Project project;
	private String managerId;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeId, String password, String firstName, String lastName, String gender, long phoneNo,
			String email, Date dateOfBirth, String designation, double salary, String projectId, Project project,
			String managerId) {
		super();
		this.employeeId = employeeId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNo = phoneNo;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.designation = designation;
		this.salary = salary;
		this.projectId = projectId;
		this.project = project;
		this.managerId = managerId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", gender=" + gender + ", phoneNo=" + phoneNo + ", email=" + email
				+ ", dateOfBirth=" + dateOfBirth + ", designation=" + designation + ", salary=" + salary
				+ ", projectId=" + projectId + ", project=" + project + ", managerId=" + managerId + "]";
	}

	
}
