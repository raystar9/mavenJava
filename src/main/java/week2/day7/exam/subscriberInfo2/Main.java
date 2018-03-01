package week2.day7.exam.subscriberInfo2;

public class Main {

	public static void main(String[] args) {
		
		SubscriberInfo hong = new SubscriberInfo();
		SubscriberInfo koo = new SubscriberInfo("Koo", "raystar", "1234","010-9195-0999", "Wolmun-ri");
		SubscriberInfo james = new SubscriberInfo("JamesGothling", "java", "java", "010-111-2222", "don't find me");
	
		printSubscriberInfo(james);
		james.changeAddress("kangnam");
		printSubscriberInfo(james);
		
		printSubscriberInfo(koo);
		printSubscriberInfo(hong);
	}
	
	private static void printSubscriberInfo(SubscriberInfo subscribeInfo) {
		
		System.out.println("name : " + subscribeInfo.getName());
		System.out.println("id : " + subscribeInfo.getId());
		System.out.println("password : " + subscribeInfo.getPassword());
		System.out.println("phone number : " + subscribeInfo.getPhoneNo());
		System.out.println("address : " + subscribeInfo.getAddress());
		System.out.println();
	}
}
