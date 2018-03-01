package week3.day11.test.test1;

class SeparateVolume implements Lendable {

	String _requestNo;
	String _bookTitle;
	String _writer;
	String _borrower;
	String _checkOutDate;
	BookState _state;
	
	public SeparateVolume(String requestNo, String bookTitle, String writer) {
		_requestNo = requestNo;
		_bookTitle = bookTitle;
		_writer = writer;
	}
	
	@Override
	public void checkOut(String borrower, String date) throws Exception {
		if(_state != BookState.STATE_NORMAL) {
//			System.out.println("* CD \"" + _bookTitle + "\" is  Already lended.\n");
			throw new Exception("* CD \"" + _bookTitle + "\" is  Already lended.\n");
		}
		_borrower = borrower;
		_checkOutDate = date;
		_state = BookState.STATE_BORROWED;
		System.out.println("* \"" + _bookTitle + "\" is lended.");
		System.out.println("Lender : " + _borrower);
		System.out.println("Lend date : " + date + "\n");
	}

	@Override
	public void checkIn() {
		_borrower = null;
		_checkOutDate = null;
		_state = BookState.STATE_NORMAL;
		System.out.println("* \"" + _bookTitle + "\" is returned.\n");
	}

	@Override
	public BookState getState() {
		return _state;
	}

}
