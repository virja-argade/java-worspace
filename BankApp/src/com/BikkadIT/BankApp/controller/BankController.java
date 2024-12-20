package com.BikkadIT.BankApp.controller;

import java.util.Scanner;

import com.BikkadIT.BankApp.services.BankServicesImpl;

public class BankController {

	public static void main(String[] args) {

		 boolean exit = false;
		Scanner sc = new Scanner(System.in);
		
		BankServicesImpl bank = new BankServicesImpl();
        while (!exit)
        {
    		System.out.println("press 1 for Account creation");
    		System.out.println("press 2 for Account view");
    		System.out.println("press3 for Withdraw money");
    		System.out.println("press4 for Deposite money");
    		System.out.println("press 5 for Update Account");
    		System.out.println("press 0 for exit");
    		int ch = sc.nextInt();
    		switch (ch) {
    		case 0:
    			System.out.println("Exit");
    			exit = true;
    			break;
    		case 1:
    			bank.createAcc();
    			break;
    		case 2:
    			bank.viewAcc();
    			break;
    		case 3:
    			bank.withdrawAcc();
    			break;
    		case 4:
    			bank.depositAcc();
    			break;
    		case 5:
    			bank.updateAcc();

        }

		}
	}
}