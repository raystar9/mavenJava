package week3.day09.exam.interfaces;

class AppCDInfo extends CDInfo implements Lendable {

	String _borrower;
	String _checkOutDate;
	byte _state;
	
	public AppCDInfo(String registerNo, String title) {
		super(registerNo, title);
	}

	@Override
	public void checkOut(String borrower, String date) {
		if(_state != 0) {
			System.out.println("* " + _title + " is Already lended.\n");
			return;
		}
		_borrower = borrower;
		_checkOutDate = date;
		_state = 1;
		System.out.println("* CD \"" + _title + "\" is lended.\n");
		System.out.println("Lender : " + _borrower);
		System.out.println("Lend date : " + date + "\n");
	}

	@Override
	public void checkIn() {
		_borrower = null;
		_checkOutDate = null;
		_state = 0;
		System.out.println("* CD \"" + _title + "\" is returned\n");
	}

}
