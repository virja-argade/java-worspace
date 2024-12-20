package com.BikkadIT.BankAppcontroler;

import java.util.Scanner;

import com.BIkkadIT.BankApp.service.bankserviceimpl;

public class Bankcontroler {
	public static void main(String[] args) {
		bankserviceimpl bankServiceImpl = new bankserviceimpl();
		boolean b=true;
		while(b) {
		System.out.println("press 1 for Account Creation");
		System.out.println("press 2 for Account View");
		System.out.println("press 3 for Withdraw Money");
		System.out.println("press 4 for Deposit Money");
		System.out.println("press 5 for Update Account");
		System.out.println("press 6 for EXIT ");

		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();

		switch (ch) {

		case 1:
			
			bankServiceImpl.createAcc();
			break;
		case 2:
		
			bankServiceImpl.viewAcc();
			break;
		case 3:
			
			bankServiceImpl.withdrawAcc();
			break;
		case 4:
			
			bankServiceImpl.depositeAcc();
			break;
		case 5:
			
			bankServiceImpl.updateAcc();
			break;
		case 6:
			b=false;
			break;
		default:
			System.out.println("Invalid choice");
		}
		}
		System.out.println("Thank you for using bank services");
	}
}