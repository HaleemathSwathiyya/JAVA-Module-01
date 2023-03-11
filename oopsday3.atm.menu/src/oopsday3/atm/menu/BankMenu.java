package oopsday3.atm.menu;

//import oopsday3.atm.menu.Account;
//import oopsday3.atm.menu.BankofAmerica2;
import java.util.Scanner;

import oopsday3.atm.exception.NegativeAmountException;
import oopsday3.atm.exceptions.InsufficientFundsException;

public class BankMenu {
	
	
	BankofAmerica2 boa = new BankofAmerica2();
		public BankMenu() {
			
			Account a1 = new Account(101,"John Doe","savings",500);
			Account a2 = new Account(102,"Jone Doe","savings",700);
			Account a3 = new Account(103,"Jason Doe","salary",800);
			Account a4 = new Account(104,"Jane Doe","salary",2500);
			Account a5 = new Account(105,"Jonas Doe","pension",650);
			
			boa.addAccount(a1);
			boa.addAccount(a2);
			boa.addAccount(a3);
			boa.addAccount(a4);
			boa.addAccount(a5);
			
		}
//		int n=5;
//		System.out.println("1. create account");
//		System.out.println("2. deposit");
//		System.out.println("3. withdraw");
//		System.out.println("4. balanceenquiry");
//		System.out.println("5. exit");
		
		public void menu() {
			
			Scanner scanner = new Scanner(System.in);
			int choice = 0;
			loop: do {
				
				System.out.println("Enter your choice 1..5");
				System.out.println("1. display account");
				System.out.println("2. deposit");
				System.out.println("3. withdraw");
				System.out.println("4. balanceenquiry");
				System.out.println("5. exit MENU");
				
				System.out.println("Enter your choice 1..5");
				
				choice = scanner.nextInt();
				
				switch(choice) {
				
				case 1: {
					
					System.out.println("Enter actno");
					int actno = scanner.nextInt();
					boa.displayAccount(actno);
					
					break;
					}
				case 2: {
					
					System.out.println("Enter actno");
					int actno = scanner.nextInt();
					
				    System.out.println("Enter amount to deposit");
				    int amount = scanner.nextInt();
					double balance = 0;
//					try {
//						balance = boa.deposit(amount, actno);
//					} catch (NegativeAmountException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
					System.out.println(balance);
					break;
					
				}
				case 3: {
					
					System.out.println("Enter actno");
					int actno = scanner.nextInt();
					System.out.println("Enter amount to withdraw");
				    int amount = scanner.nextInt();
					double balance = 0;
					try {
						balance = boa.withdraw(amount, actno);
					} catch (InsufficientFundsException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(balance);
					break;
					
		
				}
				case 4: {
					
					System.out.println("Enter actno whose balance to be known");
					int actno = scanner.nextInt();
					double balance = boa.balanceEnquiry(actno);
					System.out.println(balance);
					
				
					break;
				}
				case 5: {
					
					System.out.println("exiting");
				
					break loop;
				}
				
				}
				
			}
			
		while(choice != 5);
				
}
}
