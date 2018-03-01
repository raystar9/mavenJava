package week2.day8.exam.inheritance;

public class AccountMain {

	public static void main(String[] args) {
		
		CheckingAccount account1 = new CheckingAccount("Hong","111-22-33333333", "5555-6666-7777-8888", 30000);
		MinusAccount account2 = new MinusAccount("Lee", "222-11-55555555", 30000, 50000);
		PointAccount account3 = new PointAccount("kang", "323-11-54556555", 0, 0);
		
		/*try {
			System.out.println("balance : " + account1.getBalance());
			int paidAmount = account1.pay("5555-6666-7777-8888", 47000);
			System.out.println("paid " + paidAmount);
			System.out.println("balance : " + account1.getBalance());
			account1.deposit(50);
			System.out.println("balance : " + account1.getBalance());
			paidAmount = account1.pay("5555-6666-7777-8888", 3000);
			System.out.println("paid " + paidAmount);
			System.out.println("balance : " + account1.getBalance());
		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}*/
		/*try {
			System.out.println("balance : " + account2.getBalance());
			account2.withdraw(70000);
			System.out.println("balance : " + account2.getBalance());
			account2.withdraw(70000);
			System.out.println("balance : " + account2.getBalance());
		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}*/
		try {
			System.out.println("point : " + account3.getBonusPoint());
			account3.deposit(100000);
			System.out.println("point : " + account3.getBonusPoint());
			
		} catch(Exception e) {
			
		}
	}

}
