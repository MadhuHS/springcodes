package com.jspiders.pkg1;

public class Person {

	String name;
	int age;
	Car car1;
	Car car2;
	Car car3;

	public Car getCar2() {
		return car2;
	}

	public void setCar2(Car car2) {
		this.car2 = car2;
	}

	public Car getCar3() {
		return car3;
	}

	public void setCar3(Car car3) {
		this.car3 = car3;
	}

	public Car getCar1() {
		return car1;
	}

	public void setCar1(Car car1) {
		this.car1 = car1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
