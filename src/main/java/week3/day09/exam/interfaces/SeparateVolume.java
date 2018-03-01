package week3.day09.exam.interfaces;

class SeparateVolume implements Lendable {

	String _requestNo;
	String _bookTitle;
	String _writer;
	String _borrower;
	String _checkOutDate;
	byte _state;
	
	public SeparateVolume(String requestNo, String bookTitle, String writer) {
		_requestNo = requestNo;
		_bookTitle = bookTitle;
		_writer = writer;
	}
	
	@Override
	public void checkOut(String borrower, String date) {
		if(_state != 0) {
			System.out.println("* CD \"" + _bookTitle + "\" is  Already lended.");
			return;
		}
		_borrower = borrower;
		_checkOutDate = date;
		_state = 1;
		System.out.println("* \"" + _bookTitle + "\" is lended.");
		System.out.println("Lender : " + _borrower);
		System.out.println("Lend date : " + date + "\n");
	}

	@Override
	public void checkIn() {
		_borrower = null;
		_checkOutDate = null;
		_state = 0;
		System.out.println("* \"" + _bookTitle + "\" is returned.\n");
	}

}
