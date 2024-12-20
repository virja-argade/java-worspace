package com.bikkadit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private Integer psid;
	private String name;
	private String city;
	private String age;
	private String mob;
	/**
	 * @return the psid
	 */
	public Integer getPsid() {
		return psid;
	}
	/**
	 * @param psid the psid to set
	 */
	public void setPsid(Integer psid) {
		this.psid = psid;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * @return the mob
	 */
	public String getMob() {
		return mob;
	}
	/**
	 * @param mob the mob to set
	 */
	public void setMob(String mob) {
		this.mob = mob;
	}
	public Employee(Integer psid, String name, String city, String i, String j) {
		super();
		this.psid = psid;
		this.name = name;
		this.city = city;
		this.age = i;
		this.mob = j;
	}
	@Override
	public String toString() {
		return "Employee [psid=" + psid + ", name=" + name + ", city=" + city + ", age=" + age + ", mob=" + mob + "]";
	}
	

	

}
