package org.tnsindia.tableperclass;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

//parent class
@Entity
@Table(name="Vehicle")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Vehicle implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int vehicle_no;
	private String vehicle_name;
	private String vehicle_type;
	
	//setters and getters
	public int getVehicle_no() {
		return vehicle_no;
	}
	public void setVehicle_no(int vehicle_no) {
		this.vehicle_no = vehicle_no;
	}
	public String getVehicle_name() {
		return vehicle_name;
	}
	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}
	public String getVehicle_type() {
		return vehicle_type;
	}
	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}
	

}
