package week4.day16.exam._13_synProblem;

public class RefTypeExample {
	public static void main(String[] args) {
		Account obj1 = new Account("111-11-111111", "Lee", 5000);
		Account obj2 = new Account("222-22-222222", "Yoo", 7000);
		Account obj3 = new CheckingAccount("111-22-333333", "Hong", "4444-5555-6666-7777", 10);
		Account obj4 = new Account("333-33-333333", "Choi", 6000);
		
		printAccountInfo(obj1);
		printAccountInfo(obj2);
		printAccountInfo(obj3);
		printAccountInfo(obj4);
	}
	static void printAccountInfo(Account obj) {
		System.out.println("Account number : " + obj.getAccountNo());
		System.out.println("Owner name : " + obj.getOwnerName());
		System.out.println("Balance : " + obj.getBalance());
		
		if(obj instanceof CheckingAccount) {
			CheckingAccount objCheck = (CheckingAccount) obj;
			System.out.println("Card number : " + objCheck.getCardNo());
		}
		
		System.out.println();
	}
}
