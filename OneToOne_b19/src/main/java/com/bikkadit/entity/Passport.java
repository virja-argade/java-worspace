package com.bikkadit.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;



@Entity
public class Passport {
	@Id
	private Integer passid;
	private String pname;
	
	private String passname;
	@OneToOne
	private Person person;
	
	public Integer getPassid() {
		return passid;
	}
	
	public void setPassid(Integer passid) {
		this.passid = passid;
	}
	
	public String getPassname() {
		return passname;
	}

	public void setPassname(String passname) {
		this.passname = passname;
	}

	@Override
	public String toString() {
		return "Passport [passid=" + passid + ", passname=" + passname + ", person=" + person + "]";
	}
public Passport() {
	// TODO Auto-generated constructor stub
}

public void setPerson() {
	// TODO Auto-generated method stub
	
}

public void setPerson(Person p1) {
	// TODO Auto-generated method stub
	
}
	
	

}
