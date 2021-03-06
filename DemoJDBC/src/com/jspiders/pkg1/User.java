package com.jspiders.pkg1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "User_Details")
public class User {
	@Id
	@Column(name = "UserID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "UseName")
	private String name;

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
}
