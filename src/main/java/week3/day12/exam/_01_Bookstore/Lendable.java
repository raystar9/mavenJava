package week3.day12.exam._01_Bookstore;

interface Lendable{
	
	enum BookState{
		STATE_NORMAL("Able to lend"), STATE_BORROWED("Unable to lend");
		
		
		BookState(String string){
			
		}
	}
	public abstract void checkOut(String borrower, String date)
		throws Exception;

	public abstract void checkIn();
	
	public abstract BookState getState();
}
