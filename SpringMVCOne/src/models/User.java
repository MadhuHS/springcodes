package models;

public class User {

	String name;
	String email;
	Long phn;
	Address userAddress;

	public Address getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(Address userAddress) {
		this.userAddress = userAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhn() {
		return phn;
	}

	public void setPhn(Long phn) {
		this.phn = phn;
	}
}
