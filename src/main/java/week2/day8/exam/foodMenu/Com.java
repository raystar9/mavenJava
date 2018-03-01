package week2.day8.exam.foodMenu;

public class Com extends Menu {
	private final int _kimchi = 6000;
	private final int _budae = 7000;
	private final int _bibimbap = 7000;
	private final int _sundae = 6000;
	private final int _rice = 1000;
	
	
	@Override
	void orderKimchiStew() {
		System.out.println("Kimchi stew is " + _kimchi + "Won.");

	}

	@Override
	void orderBudaeStew() {
		System.out.println("Budae stew is " + _budae + "Won.");

	}

	@Override
	void orderBibimbap() {
		System.out.println("Bibimbap is " + _bibimbap + "Won.");

	}

	@Override
	void orderSundaeStew() {
		System.out.println("Sundae stew is " + _sundae + "Won.");

	}

	@Override
	void orderBowlOfRice() {
		System.out.println("Bowl of rice is " + _rice + "Won.");

	}

}
