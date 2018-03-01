package week3.day09.exam.interfacePolymorphism;

interface Lendable {
	static final byte STATE_BORROWED = 1;
	static final byte STATE_NORMAL = 0;
	public abstract void checkOut(String borrower, String date)
		throws Exception;

	public abstract void checkIn();
	
	public abstract byte getState();
}
