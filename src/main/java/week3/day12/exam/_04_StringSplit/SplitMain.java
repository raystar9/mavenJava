package week3.day12.exam._04_StringSplit;

class SplitMain {

	public static void main(String[] args) {
		String str = "123-456-789";
		String[] strAry = str.split("-");
		
		for(String str1 : strAry) {
			System.out.println(str1);
		}
	}

}
