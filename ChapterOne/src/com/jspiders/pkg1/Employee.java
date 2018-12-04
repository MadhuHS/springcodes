package com.jspiders.pkg1;

import java.util.List;

public class Employee {

	private int id;
	private String name;
	private double sal;
	private Address home;
	private Address work;
	private List allAddress;

	public List getAllAddress() {
		return allAddress;
	}

	public void setAllAddress(List allAddress) {
		this.allAddress = allAddress;
	}

	public Address getWork() {
		return work;
	}

	public void setWork(Address work) {
		this.work = work;
	}

	public Employee() {
		System.out.println("EMployee object created");
	}

	public Address getHome() {
		return home;
	}

	public void setHome(Address home) {
		this.home = home;
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

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		String info = id + " " + name + " " + sal;
		return info;
	}

}
