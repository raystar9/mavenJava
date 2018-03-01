package week3.day13.exam._05_overrideToString;

public class Main {

	public static void main(String[] args) {
		
		GoodsStock gs = new GoodsStock("52135", 200);

		System.out.println("Stock infomation\n" + gs);		//print a object returns object.toString()
	}
}
