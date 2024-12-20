package com.bikkadit.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Custemer {
@Id
private Integer CId;

private String Cname;
@ManyToMany(mappedBy = "custemer")
private List<Bank> Bank;


public Integer getCId() {
	return CId;
}


public void setCId(Integer cId) {
	CId = cId;
}
public String getCname() {
	return Cname;
}


public void setCname(String cname) {
	Cname = cname;
}


public List<Bank> getBank() {
	return Bank;
}


public void setBank(List<Bank> bank) {
	Bank = bank;
}


@Override
public String toString() {
	return "Custemer [CId=" + CId + ", Cname=" + Cname + ", Bank=" + Bank + "]";
}


}
