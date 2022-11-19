package org.tnsindia.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
//class
public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//data members
	@Id
	private int cust_ID;
	private String Name;
	private double product_price;
	
	//setters and getters method

	public int getCust_ID() {
		return cust_ID;
	}
	public void setCust_ID(int cust_ID) {
		this.cust_ID = cust_ID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	
	
	

}