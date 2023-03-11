package oopsday3.atm.menu;

import oopsday3.atm.exception.NegativeAmountException;
import oopsday3.atm.exceptions.InsufficientFundsException;

public interface BankingIface2 {
	
	public abstract double withdraw(double amount, int actno) throws InsufficientFundsException;
	public abstract double deposit (double amount, int actno); //  throws NegativeAmountException;
	public abstract double balanceEnquiry(int acno);

}
