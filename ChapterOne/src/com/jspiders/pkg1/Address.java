package com.jspiders.pkg1;

public class Address {

	private String state;
	private String city;
	private int pincode;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString()
	{
		String info = state+" "+city+" "+pincode;
		return info;
	}

}





