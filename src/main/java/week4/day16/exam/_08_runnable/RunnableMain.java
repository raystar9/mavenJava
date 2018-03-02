package week4.day16.exam._08_runnable;

class RunnableMain {

	public static void main(String[] args) {
		Thread thread = new Thread(new SmallLetters());
		thread.start();
		char arr[] = { '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		for(char ch : arr) {
			System.out.print(ch);
		}
	}
}
