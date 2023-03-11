package oopsday2.atm;

public class BankofAmerica implements BankingIface {
	
	private Account account = new Account(1001,"John Doe","salary",500);

	@Override
	public double withdraw(double amount) {
		
		account.setBalance(account.getBalance()-amount);
		return account.getBalance();
		// TODO Auto-generated method stub
		//return 0;
	}

	@Override
	public double deposit(double amount) {
		
		account.setBalance(account.getBalance()+amount);
		return account.getBalance();
		// TODO Auto-generated method stub
		//return 0;
	}

	@Override
	public double balanceEnquiry(int acno) {
		
		return account.getBalance();
		// TODO Auto-generated method stub
		//return 0;
	}

}
