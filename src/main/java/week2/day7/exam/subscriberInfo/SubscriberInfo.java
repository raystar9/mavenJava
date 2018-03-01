package week2.day7.exam.subscriberInfo;

public class SubscriberInfo {

	private String _name;
	private String _id;
	private String _password;
	private String _phoneNo;
	private String _address;
	
	public SubscriberInfo(String name, String id, String password) {
		_name = name;
		_id = id;
		_password = password;
	}
	
	public SubscriberInfo(String name, String id, String password, String phoneNo, String address) {
		_name = name;
		_id = id;
		_password = password;
		_phoneNo = phoneNo;
		_address = address;
	}
	
	//생성자 끝
	
	public String getPassword() {
		return _password;
	}
	
	public String getName() {
		return _name;
	}
	
	public String getPhoneNo() {
		return _phoneNo;
	}
	
	public String getId() {
		return _id;
	}
	
	public String getAddress() {
		return _address;
	}
	
	public void changeName(String name) {
		_name = name;
	}
	
	public void changePhoneNo(String phoneNo) {
		_phoneNo = phoneNo;
	}
	
	public void changeAddress(String address) {
		_address = address;
	}
	
	public void changePassword(String password) {
		_password = password;
	}
}
