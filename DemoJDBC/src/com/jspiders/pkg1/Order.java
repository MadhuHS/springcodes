package com.jspiders.pkg1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order
{
	@Id
	@GeneratedValue
	private int ordId;
	private String qty;

	public int getOrdId() {
		return ordId;
	}

	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}
}
