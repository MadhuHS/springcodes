package com.jspiders.pkg1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Transient;

@Entity(name = "User_Details")
public class User {

	@Id
	@Column(name = "UserID")
	private int id;

	@Column(name = "UseName")
	private String name;

	@Transient
	private String country = "India";

	@Lob
	private String bio;

	public int getId() {
		return id;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
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
