package week2.day7.exam.subscriberInfo;

public class Main {

	public static void main(String[] args) {
		
		SubscriberInfo hong = new SubscriberInfo("Hong", "gildong", "1211");
		SubscriberInfo koo = new SubscriberInfo("Koo", "raystar", "1234","010-9195-0999", "Wolmun-ri");
		
		printSubscriberInfo(hong);
		printSubscriberInfo(koo);
		koo.changePassword("4231");
		printSubscriberInfo(koo);
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
