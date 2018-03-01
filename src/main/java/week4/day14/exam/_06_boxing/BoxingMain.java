package week4.day14.exam._06_boxing;

class BoxingMain {

	public static void main(String[] args) {
		
		Integer i1 = new Integer(12);
		Integer i2 = new Integer(7);
		
		int sum = i1.intValue() + i2.intValue();
		
		System.out.println(sum);
		
		Integer n1 = new Integer("20");
		
		int n2 = n1.intValue();
		System.out.println(n2);
	}

}
