package week2.day8.exam.abstractClass;

public class MessageMain {

	public static void main(String[] args) {
		EMailSender sender1 = new EMailSender("Happy birthday", "CS", "admin@dukeeshop.co.kr", "coupon sended");
		SMSSender sender2 = new SMSSender("Happy birthday", "CS", "02-000-0000", "coupon sended");
		
		sender1.send("hatman@ye.com");
		sender1.send("stickman@ha.com");
		sender2.send("010-000-0000");
	}
}
