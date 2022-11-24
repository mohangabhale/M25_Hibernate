package org.tnsindia.joinedinheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

//child class
@Entity
@Table(name="SalesDept")
public class SalesDepartment extends Sales{
	//data members
		private int dept_id;
		private String dept_name;
		
		//setters and getters 
		public int getDept_id() {
			return dept_id;
		}
		public void setDept_id(int dept_id) {
			this.dept_id = dept_id;
		}
		public String getDept_name() {
			return dept_name;
		}
		public void setDept_name(String dept_name) {
			this.dept_name = dept_name;
		}

}
