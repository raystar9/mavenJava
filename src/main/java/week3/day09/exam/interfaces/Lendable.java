package week3.day09.exam.interfaces;

interface Lendable {
	public abstract void checkOut(String borrower, String date);

	public abstract void checkIn();
}
