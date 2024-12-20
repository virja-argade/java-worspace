package com.bikkadit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "Passenger")
public class Passenger {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer psid;
	private String name;
	private String city;
	private String age;
	private String mob;
	public Integer getPsid() {
		return psid;
	}
	public void setPsid(Integer psid) {
		this.psid = psid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public Passenger(String name, String city, String age, String j) {
		super();
		
		this.name = name;
		this.city = city;
		this.age = age;
		this.mob = j;
	}
	public Passenger() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Passenger [psid=" + psid + ", name=" + name + ", city=" + city + ", age=" + age + ", mob=" + mob + "]";
	}
	
	}
	
	

