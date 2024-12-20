package com.bikkadit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity  

@Table(name="address220")  
public class Address {    
      
    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
private int addressId;    
private String addressLine1,city,state,country;    
private int pincode;       
	  
	@OneToOne(targetEntity=Employee.class)  
	private Employee employee;  
	public int getAddressId() {  
	    return addressId;  
	}  
	public void setAddressId(int addressId) {  
	    this.addressId = addressId;  
	}  
	public String getAddressLine1() {  
	    return addressLine1;  
	}  
	public void setAddressLine1(String addressLine1) {  
	    this.addressLine1 = addressLine1;  
	}  
	public String getCity() {  
	    return city;  
	}  
	public void setCity(String city) {  
	    this.city = city;  
	}  
	public String getState() {  
	    return state;  
	}  
	public void setState(String state) {  
	    this.state = state;  
	}  
	public String getCountry() {  
	    return country;  
	}  
	public void setCountry(String country) {  
	    this.country = country;  
	}  
	public int getPincode() {  
	    return pincode;  
	}  
	public void setPincode(int pincode) {  
	    this.pincode = pincode;  
	}  
	public Employee getEmployee() {  
	    return employee;  
	}  
	public void setEmployee(Employee employee) {  
	    this.employee = employee;  
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressLine1=" + addressLine1 + ", city=" + city + ", state="
				+ state + ", country=" + country + ", pincode=" + pincode + ", employee=" + employee + "]";
	}
	public void setAddress0() {
		// TODO Auto-generated method stub
		
	}
	public void setAddress(int i) {
		// TODO Auto-generated method stub
		
	}    
	
	}  

