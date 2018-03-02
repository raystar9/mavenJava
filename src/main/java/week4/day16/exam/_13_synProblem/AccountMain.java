package week4.day16.exam._13_synProblem;

public class AccountMain {

	public static void main(String[] args) {
		
		SharedArea area = new SharedArea();
		
		area._account1 = new Account("111-111-1111", "Lee", 20000000);
		area._account2 = new Account("222-222-2222", "Seong", 10000000);
		
		TransferThread thread1 = new TransferThread(area);
		PrintThread thread2 = new PrintThread(area);
		thread1.start();
		thread2.start();
	}
	
	static void printAccountInfo(Account account) {
		System.out.println("-------------------------------------------------------");
		System.out.println("Owner name : " + account.getOwnerName());
		System.out.println("Account number : " + account.getAccountNo());
		System.out.println("Balance : " + account.getBalance());
		System.out.println("-------------------------------------------------------");
		
	}
}
