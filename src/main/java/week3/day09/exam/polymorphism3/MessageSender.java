package week3.day09.exam.polymorphism3;

public abstract class MessageSender {
	String _title;
	String _senderName;
	
	public MessageSender(String title, String senderName) {
		_title = title;
		_senderName = senderName;
	}
	abstract void send(String recipient);
	
}
