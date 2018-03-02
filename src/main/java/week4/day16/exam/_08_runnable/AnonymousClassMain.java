package week4.day16.exam._08_runnable;

class AnonymousClassMain {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for(char ch = 'a'; ch <= 'z'; ch++) {
					System.out.print(ch);
				}
			}
		});
		thread.start();
		char arr[] = { '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		for(char ch : arr) {
			System.out.print(ch);
		}
	}
}
