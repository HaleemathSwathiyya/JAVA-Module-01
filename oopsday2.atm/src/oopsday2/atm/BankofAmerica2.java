package oopsday2.atm;

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

	@Override
	public double withdraw(double amount, int actno) {

		double tempBal = 0;

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAcno() == actno) {

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
	public double deposit(double amount, int actno) {
		
		double tempBal = 0;

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAcno() == actno) {

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
	



