package week4.day14.exam._11_valueOf;

class ValueOfMain {

	public static void main(String[] args) {
		Integer int1 = Integer.valueOf(10);
		Integer int2 = Integer.valueOf(10);

		String str1 = "123";
		String str2 = "123";
		
		compare(int1, int2);
		
		compare(str1, str2);
		
	}

	static void compare(Object obj1, Object obj2){
		if(obj1 == obj2) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}
	}
}
