package oopsday3.atm.menu;

import oopsday3.atm.exception.NegativeAmountException;
import oopsday3.atm.exceptions.InsufficientFundsException;

public class BankofAmerica2 implements BankingIface2 {

	private Account[] accounts = new Account[5];
	private int accountIndex = 0;

	public BankofAmerica2() {

	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public BankofAmerica2(Account[] accounts) {
		super();
		this.accounts = accounts;
	}

	public void addAccount(Account account) {
		if (this.accountIndex < accounts.length)
			accounts[this.accountIndex++] = account;

		else
			System.out.println("Operation not allowed");

	}
	
	public void displayAccount(int actno) 
	{
		
		for(int i=0; i < accounts.length; i++) 
		{
			
			if(accounts[i].getAcno() == actno) 
			{
				
				System.out.println(accounts[i].getAcno());
				System.out.println(accounts[i].getName());
				System.out.println(accounts[i].getActType());
				System.out.println(accounts[i].getBalance());
			}
		}
	}

	@Override
	public double withdraw(double amount, int actno) throws InsufficientFundsException {
		
		

		double tempBal = 0;
		
	

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAcno() == actno) {
				
				if(accounts[i].getBalance() < amount) {
					throw new InsufficientFundsException("Insufficient Funds");
				}

				tempBal = accounts[i].getBalance();
				tempBal -= amount;
				accounts[i].setBalance(tempBal);
				break;
			}
		}

		return tempBal;
	}
		// TODO Auto-generated method stub
		// return 0;
	

	@Override
	public double deposit(double amount, int actno) //throws NegativeAmountException 
	{
		
		double tempBal = 0;

		for (int i = 0; i < accounts.length; i++) {
			
				
				if (accounts[i].getAcno() == actno) {
					
//					if(accounts[i].getBalance() < amount) {
//						throw new NegativeAmountException("Cannot accept negative amount");
//					}

				tempBal = accounts[i].getBalance();
				tempBal += amount;
				accounts[i].setBalance(tempBal);
				break;
			}
		}

		return tempBal;
		
	}
		// TODO Auto-generated method stub
		//return 0;
	
	
	
	
	@Override
	public double balanceEnquiry(int actno) {
		
		double tempBal = 0;

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAcno() == actno) {

				tempBal = accounts[i].getBalance();
				break;
			}
		}
		// TODO Auto-generated method stub
		return tempBal;
	}
		}
	



