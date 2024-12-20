package com.BikkadIT.BankApp.model;

public class Account {

	private int accountNum;
	private String accountName;
	private String panNum;
	private double intialBal;
    private String addredd;
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getPanNum() {
		return panNum;
	}
	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}
	public double getIntialBal() {
		return intialBal;
	}
	public void setIntialBal(double intialBal) {
		this.intialBal = intialBal;
	}
	public String getAddredd() {
		return addredd;
	}
	public void setAddredd(String addredd) {
		this.addredd = addredd;
	}
	public Account(int accountNum, String accountName, String panNum, double intialBal, String addredd) {
		super();
		this.accountNum = accountNum;
		this.accountName = accountName;
		this.panNum = panNum;
		this.intialBal = intialBal;
		this.addredd = addredd;
	}
    
    
	public Account() {};
}
