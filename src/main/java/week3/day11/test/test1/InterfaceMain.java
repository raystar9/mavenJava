package week3.day11.test.test1;

class InterfaceMain {
	
	public static void main(String[] args) {
		Lendable[] arr = new Lendable[3];
		arr[0] = new SeparateVolume("882", "Automation", "J");
		arr[1] = new SeparateVolume("883", "Artistic Histories", "K");
		arr[2] = new AppCDInfo("887", "How to works JAVA in windows");
		
		printState(arr[0]);
		checkOutAll(arr, "Yoon", "2018-02-01");
		printState(arr[0]);
		checkOut(arr[0], "Koo", "2018-02-01");
		
		
	}
	static void checkOut(Lendable lend, String borrower, String date) {
		try {
			lend.checkOut(borrower, date);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void checkOutAll(Lendable[] lends, String borrower, String date) {
		for(Lendable lend : lends) {
			checkOut(lend, borrower, date);
		}
	}
	
	static void checkInAll(Lendable lend) {
		lend.checkIn();
	}
	
	static void printState(Lendable lend) {
		if(lend.getState() == Lendable.BookState.STATE_NORMAL) {
			System.out.println("--------------------------");
			System.out.println("State : Lendable");
			System.out.println("--------------------------");
		} else {
			System.out.println("--------------------------");
			System.out.println("State : Lended");
//			System.out.println("Lender : " + lend._borrower);
			System.out.println("--------------------------");
		}

	}
}
