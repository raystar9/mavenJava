package week4.day14.exam._12_autoUnboxing;

class AutoUnboxing {

	public static void main(String[] args) {
		Integer obj = new Integer("10");
		
		int sum = obj + 20;
		sum = obj.intValue() + 20;
	}

}
