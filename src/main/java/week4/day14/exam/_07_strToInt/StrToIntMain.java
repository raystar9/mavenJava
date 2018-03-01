package week4.day14.exam._07_strToInt;

class StrToIntMain {

	public static void main(String[] args) {
		int total = 0;
		for (int i = 0; i < args.length; i++) {
			total += Integer.parseInt(args[i]);
		}
		System.out.println(total);
	}

}
