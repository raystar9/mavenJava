package week2.day8.exam.abstractClass;

public abstract class MessageSender {
	String _title;
	String _senderName;
	
	public MessageSender(String title, String senderName) {
		_title = title;
		_senderName = senderName;
	}
	abstract void send(String recipient);
	
}
