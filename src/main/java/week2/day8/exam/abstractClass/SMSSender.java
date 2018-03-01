package week2.day8.exam.abstractClass;

public class SMSSender extends MessageSender {
	String _senderPhoneNo;
	String _message;
	
	public SMSSender(String title, String senderName, String senderPhoneNo, String message) {
		super(title, senderName);
		_senderPhoneNo = senderPhoneNo;
		_message = message;
	}

	@Override
	void send(String recipient) {
		System.out.println("------------------------------------------------");
		System.out.println("title : " + _title);
		System.out.println("sender : " + _senderName);
		System.out.println("recipient : " + recipient);
		System.out.println("senderPhoneNo : " + _senderPhoneNo);
		System.out.println("message : " + _message);
	}

}
