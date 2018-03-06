package week5.day19.practice._06_serializationTransient;

import java.io.Serializable;

class BBSItem implements Serializable{
	static int itemNum = 0;
	String _writer;
	transient String _password;	//transient : 직렬화 대상이 되지 않는다.
	
	String _title;
	String _content;
	
	public BBSItem(String writer, String password, String title, String content) {
		_writer = writer;
		_password = password;
		_title = title;
		_content = content;
		itemNum++;
	}
	
	void modifyContent(String content, String password) {
		if(!password.equals(_password))
			return;
		_content = content;
	}
	
	void modifyTitle(String title, String password) {
		if(!password.equals(_password))
			return;
		_title = title;
	}

	public String getWriter() {
		return _writer;
	}

	public String getPassword() {
		return _password;
	}

	public String getTitle() {
		return _title;
	}

	public String getContent() {
		return _content;
	}
	
	public static int getItemNum() {
		return itemNum;
	}

	public void setWriter(String writer) {
		_writer = writer;
	}

	public void setPassword(String password) {
		_password = password;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public void setContent(String content) {
		_content = content;
	}

	public static void setItemNum(int itemNum) {
		BBSItem.itemNum = itemNum;
	}
	
}
