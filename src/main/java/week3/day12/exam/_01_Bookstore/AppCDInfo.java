package week3.day12.exam._01_Bookstore;

class AppCDInfo extends CDInfo implements Lendable {

	String _borrower;
	String _checkOutDate;
	BookState _state;
	
	public AppCDInfo(String registerNo, String title) {
		super(registerNo, title);
	}

	@Override
	public void checkOut(String borrower, String date) throws Exception{
		if(_state != BookState.STATE_NORMAL) {
//			System.out.println("* " + _title + " is Already lended.\n");
			throw new Exception("* " + _title + " is Already lended.\n");
		}
		_borrower = borrower;
		_checkOutDate = date;
		_state = BookState.STATE_BORROWED;
		System.out.println("* CD \"" + _title + "\" is lended.");
		System.out.println("Lender : " + _borrower);
		System.out.println("Lend date : " + date + "\n");
	}

	@Override
	public void checkIn() {
		_borrower = null;
		_checkOutDate = null;
		_state = BookState.STATE_NORMAL;
		System.out.println("* CD \"" + _title + "\" is returned\n");
	}
	
	@Override
	public BookState getState() {
		return _state;
	}

}
