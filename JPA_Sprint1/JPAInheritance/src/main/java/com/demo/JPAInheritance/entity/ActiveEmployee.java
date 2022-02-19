package com.demo.JPAInheritance.entity;

import javax.persistence.Entity;

@Entity
public class ActiveEmployee extends Employee {
	private int e_salary;
	private int e_experience;


	public ActiveEmployee() {
		super();
		
	}
	public ActiveEmployee(int e_id, String e_name, int e_salary, int e_experience) {
		super(e_id, e_name);
		this.e_salary = e_salary;
		this.e_experience = e_experience;
		
	}
	public int getE_salary() {
		return e_salary;
	}
	public void setE_salary(int e_salary) {
		this.e_salary = e_salary;
	}
	public int getE_experience() {
		return e_experience;
	}
	public void setE_experience(int e_experience) {
		this.e_experience = e_experience;
	}
	}

