package com.jspiders.pkg1;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Transient;

@Entity(name = "User_Details")
public class User {
	@Id
	@Column(name = "UserID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "UseName")
	private String name;

	@Transient
	private String country = "India";

	@Lob
	private String bio;

    @ElementCollection
	private Set<Address> addrSet = new HashSet<Address>();

	public Set<Address> getAddrSet() {
		return addrSet;
	}

	public void setAddrSet(Set<Address> addrSet) {
		this.addrSet = addrSet;
	}

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
