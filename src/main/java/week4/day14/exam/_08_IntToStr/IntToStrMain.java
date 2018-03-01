package week4.day14.exam._08_IntToStr;

class IntToStrMain {

	public static void main(String[] args) {
		int n1 = 10;
		
		String age = Integer.toString(10);
		Integer n2 = new Integer(n1);
		String age2 = n2.toString();
		String age3 = "" + n1;
		
		System.out.println(age);
		System.out.println(age2);
		System.out.println(age3);
	}

}
