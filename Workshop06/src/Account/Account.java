package Account;

public class Account {
private String account;
private int balance;
private double interestRate;

Account(){}

public Account(String account, int balance, double interestRate) {
	super();
	this.account = account;
	this.balance = balance;
	this.interestRate = interestRate;
}

public String getAccount() {
	return account;
}

public void setAccount(String account) {
	this.account = account;
}

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}

public double getInterestRate() {
	return interestRate;
}

public void setInterestRate(double interestRate) {
	this.interestRate = interestRate;
}
public double calculateInterst() {
	
	return balance*interestRate;
}
public void deposit(int money)throws AccountException {
	if(money<0) {
		throw new AccountException("입금 금액이 0보다 적습니다.");
	}
	balance = balance+money;
	
	
}
//AccountException e = new AccountException();

public void withdraw(int money) throws AccountException {
	if(balance-money<0 || money <0) {
		throw new AccountException("금액이 0보다 적거나 현재 잔액보다 많습니다.");
	}
		balance-=money;
	}
	
//	if(balance-money<0) {//(balance <money)
//		System.out.println("출금 할 수 없습니다.");
//
//	}else {
//		balance= balance-money;
//	}
}

