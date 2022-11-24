package org.tnsindia.onetooneunidirectional;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student implements Serializable{
private static final long serialVersionUID = 1L;
	
	//data members
	@Id
	private int ID;
	private String NAME;
	
	//unidirectional-onetoone 
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;
	@JoinColumn(name="area")
	//getters and setters method
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
