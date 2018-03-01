package week2.day8.exam.abstractClass;

public class EMailSender extends MessageSender {
	String _senderAddr;
	String _eMailBody;
	
	public EMailSender(String title, String senderName, String senderAddr, String eMailBody) {
		super(title, senderName);
		_senderAddr = senderAddr;
		_eMailBody = eMailBody;
	}

	@Override
	void send(String recipient) {
		System.out.println("------------------------------------------------");
		System.out.println("title : " + _title);
		System.out.println("sender : " + _senderName);
		System.out.println("recipient : " + recipient);
		System.out.println("senderAddr : " + _senderAddr);
		System.out.println("eMailBody : " + _eMailBody);
	}

}
