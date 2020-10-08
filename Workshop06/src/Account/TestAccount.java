package Account;

public class TestAccount {

	public static void main(String[] args) {
		Account account;
		account = new Account("441-0290-1203",1500000,0.073);
		System.out.println("계좌정보: "+ account.getAccount()+" 현재 잔액 : "+account.getBalance());
//		account.withdraw(6000000);
//		account.deposit(20000);
		System.out.println("계좌정보: "+ account.getAccount()+" 현재 잔액 : "+account.getBalance());
		System.out.println("이자: "+account.calculateInterst());
		
		try {
			account.deposit(-10);
			
		} catch (AccountException e) {
			System.out.println("예외발생 :"+e.getMessage());
		}finally {
			//System.out.println("입금금액:"+
		}
		
		try {
			
			account.withdraw(0);
			
		} catch (AccountException e) {
			System.out.println("예외발생 :"+e.getMessage());
		}finally {
			System.out.println("balance"+account.getBalance());
		}
		
		
//		if(account.getBalance()-account.withdraw(money)<0) {
//			try {
//				
//			}catch(ArithmeticException e) {
//				throw new AccountException("입금 금액이 0보다 적습니다.");
//			}
//		}
		
		
	}

}

