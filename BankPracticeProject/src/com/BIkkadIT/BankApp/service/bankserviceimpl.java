package com.BIkkadIT.BankApp.service;

import java.util.Scanner;

import com.BikkadIT.BankApp.Model.Account;

public class bankserviceimpl implements Bankservice {
	Account acc = new Account();
	Scanner sc = new Scanner(System.in);

	@Override
	public void createAcc() {

		System.out.println("Enter Account Number");
		int userAcc = sc.nextInt();
		acc.setAccno(userAcc);

		System.out.println("Enter Account Name");
		String userName = sc.next();
		acc.setAccName(userName);

		System.out.println("ENter Account Addr");
		String userAddr = sc.next();
		acc.setAccAdar(userAddr);

		System.out.println("Enter Pan No");
		String userpan = sc.next();
		acc.setAccPan(userpan);

		System.out.println("Enter Account Balance");
		double userBal = sc.nextDouble();
		acc.setAccbal(userBal);

		if (acc != null) {
			System.out.println("Account Created Sucessfully!!!!!");
		} else {
			System.out.println("Accounnt not created");

		}

	}

	@Override
	public void viewAcc() {

		System.out.println("Account view by toostring method");
		System.out.println(acc.toString());
		
		System.out.println("Account view by getters");
		System.out.println(acc.getAccno());
		System.out.println(acc.getAccName());
		System.out.println(acc.getAccAdar());
		System.out.println(acc.getAccPan());
		System.out.println(acc.getAccbal());

	}

	@Override
	public void withdrawAcc() {
		System.out.println("Enter Account Number to Withdraw Money");
		int userAcc = sc.nextInt();
		
		if (acc.getAccno()==userAcc) {
			System.out.println("Enter Amount that you want to withdraw");
			double useramt = sc.nextDouble();
			
			if (useramt<=acc.getAccbal()){
				
				double remBal = acc.getAccbal() - useramt;
				acc.setAccbal(remBal);
				System.out.println("Withdraw sucessful. Rem Bal is "+ acc.getAccbal() );
			} 
			else {System.out.println("Insufficient Fund");	}
		}
		else {System.out.println("Invalid Account Details");
			
			}
		}



	@Override
	public void depositeAcc() {
		System.out.println("Please enter the account number");
        
        int userAcc =sc.nextInt();
		if (acc.getAccno()==userAcc) {
			System.out.println("Enter Amount that you want to deposite");
			double useramt = sc.nextDouble();
			double crdtAmt= acc.getAccbal()+ useramt;
			acc.setAccbal(crdtAmt);
			System.out.println("Deposite sucessfully.Avl bal is="+acc.getAccbal());
		}else {
			System.out.println("Invalid account details");
			
			}
			}
	

	@Override
	public void updateAcc() {
		
		boolean flag = true;
		while (flag) {
			System.out.println("press 1 for update name");
			System.out.println("press 2 for update address");
			System.out.println("press 3 for update pan");
			System.out.println("press 4 for Exit");
			
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter name that you want to update");
				String name = sc.next();
				acc.setAccName(name);
				System.out.println("Name Update Successfully.update name is = "+ acc.getAccName());
				break;
			case 2:
				System.out.println("enter Adderes that you want to update ");
				String addr = sc.next();
				acc.setAccAdar(addr);
				System.out.println("address updated sucessfully.updated address ="+acc.getAccAdar());
	            break;
			case 3:
				System.out.println("Enter pan that you want to update");
				String pan = sc.next();
				acc.setAccPan(pan);
				break;
			case 4:
				flag = false;
				break;
				default :
					System.out.println("invalid choice");
					
			
			}
			
		}

	}

}
