package week3.day11.test.test1;

interface Lendable{
	
	enum BookState{
		STATE_NORMAL, STATE_BORROWED;
	}
	public abstract void checkOut(String borrower, String date)
		throws Exception;

	public abstract void checkIn();
	
	public abstract BookState getState();
}
