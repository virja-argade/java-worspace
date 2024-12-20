package com.BikkadIT.BankApp.services;

import java.util.Scanner;

import com.BikkadIT.BankApp.model.Account;

public class BankServicesImpl implements BankServices{

	Account acc=new Account();
	Scanner sc=new Scanner(System.in);
	@Override
	public void createAcc() {
		// TODO Auto-generated method stub
        System.out.println("Please enter account number");
        acc.setAccountNum(sc.nextInt());
        System.out.println("Please enter account name");
        acc.setAccountName(sc.next());
        System.out.println("Please enter PAN number");
        acc.setPanNum(sc.next());
        System.out.println("Please enter initial balance");
        acc.setIntialBal(sc.nextDouble());
        
        System.out.println("Congratulations "+ acc.getAccountName() + " Account created successfully !!!!!!");
	}

	@Override
	public void viewAcc() {
		// TODO Auto-generated method stub
		System.out.println("View Account");
	}

	@Override
	public void withdrawAcc() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw Account");
	}

	@Override
	public void depositAcc() {
		// TODO Auto-generated method stub
		System.out.println("Deposit Account");
	}
	@Override
	public void updateAcc() {
		// TODO Auto-generated method stub
		System.out.println("Update Account");
	}

}
