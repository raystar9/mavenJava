package week4.day14.exam._09_bitToString;

class BitToStringMain {

	public static void main(String[] args) {
		int total = 0;
		for (int i = 0; i < args.length; i++) {
			total += Integer.parseInt(args[i]);
		}
		System.out.println(total);
		System.out.println("Binary : " + Integer.toBinaryString(total));
		System.out.println("Octal : " + Integer.toOctalString(total));
		System.out.println("Hex : " + Integer.toHexString(total));
	}

}
