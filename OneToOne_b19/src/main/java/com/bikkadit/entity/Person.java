package com.bikkadit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity

public class Person {
	@Id
	private Integer pid;
	private String pname;
	@OneToOne
	private Passport passport;
	
	public Integer getPid() {
		return pid;
	}
	
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	
	public String getPname() {
		return pname;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", passport=" + passport + "]";
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public void setPassport() {
		// TODO Auto-generated method stub
	}

	public void setPassport(Passport pp7) {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
