package week3.day09.exam.polymorphism3;

public class MessageMain {

	public static void main(String[] args) {
		EMailSender sender1 = new EMailSender("Happy birthday", "CS", "admin@dukeeshop.co.kr", "coupon sended");
		SMSSender sender2 = new SMSSender("Happy birthday", "CS", "02-000-0000", "coupon sended");
		
		send(sender1, "hatman@ye.com");
		send(sender1, "stickman@ha.com");
		send(sender2, "010-000-0000");
	}
	
	static void send(MessageSender messageSender, String sendTo) {
		messageSender.send(sendTo);
	}
}
