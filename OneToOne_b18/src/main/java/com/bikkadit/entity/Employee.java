package com.bikkadit.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.TableGenerator;

@Entity
public class Employee {
	@TableGenerator(name="address220")  
	      
	      
	    @Id  
	    @GeneratedValue(strategy=GenerationType.AUTO)  
	    @PrimaryKeyJoinColumn  
	private int employeeId;    
	private String name,email;    
	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)  
	private Address address;  
	public int getEmployeeId() {  
	    return employeeId;  
	}  
	public void setEmployeeId(int employeeId) {  
	    this.employeeId = employeeId;  
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
	public Address getAddress() {  
	    return address;  
	}  
	public void setAddress(Address address) {  
	    this.address = address;  
	}
	public void setName1(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setename() {
		// TODO Auto-generated method stub
		
	}
	public void setEmployee() {
		// TODO Auto-generated method stub
		
	}    
	  
	}    


