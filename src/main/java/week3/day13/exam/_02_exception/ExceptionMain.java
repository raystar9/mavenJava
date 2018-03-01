package week3.day13.exam._02_exception;

class ExceptionMain {

	public static void main(String[] args) {
		int sum = 1 + -2;
		int num1 = 3, num2 = 0;
		/*try {
			int result = num1 / num2;
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally.");
		}
		
		try {
			if(sum < 0) 
				throw new Exception("Error occurred");
			
			System.out.println(sum);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}*/

		try {
			System.out.println(devide(3, 0));
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	static int add(int a, int b) throws Exception {
		int result = a + b;
		if(result < 0) {
			throw new Exception("Error occurred");
		}
		return result;
	}
	
	static int devide(int a, int b) {
//		if(b == 0) {
//			throw new Exception("does not devide by 0");
//		}
		return a / b;
	}
}
