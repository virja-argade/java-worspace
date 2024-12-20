package com.bikkadit.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Bank {
	@Id
  private Integer BId;
  
  private String BankName;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "fk_bk_c",
	joinColumns = {@JoinColumn(name="b_fk")}
	,inverseJoinColumns = {@JoinColumn(name="c_fk")})
	
  private List<Custemer>custemer;
	
	public Integer getBId() {
		return BId;
	}
	public void setBId(Integer bId) {
		BId = bId;
	}
	
	public String getBankName() {
		return BankName;
	}
	
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public List<Custemer> getCustemer() {
		return custemer;
	}
	
	public void setCustemer(List<Custemer> custemer) {
		this.custemer = custemer;
	}
	@Override
	public String toString() {
		return "Bank [BId=" + BId + ", BankName=" + BankName + ", custemer=" + custemer + "]";
	}
	public void setBname(String string) {
		// TODO Auto-generated method stub
		
	}
	public static void add(Bank b3) {
		// TODO Auto-generated method stub
		
	}
  
}
