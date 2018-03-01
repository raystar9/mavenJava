package week2.day8.exam.foodMenu;

public class Order {
	public static void main(String[] args) {
		
		Com com = new Com();
		Apart apt = new Apart();
		Univ univ = new Univ();
		
		/*apt.orderKimchiStew();
		apt.orderBudaeStew();
		apt.orderBibimbap();
		apt.orderSundaeStew();
		apt.orderBowlOfRice();
		System.out.println();
		
		univ.orderKimchiStew();
		univ.orderBudaeStew();
		univ.orderBibimbap();
		univ.orderSundaeStew();
		univ.orderBowlOfRice();
		System.out.println();
		
		com.orderKimchiStew();
		com.orderBudaeStew();
		com.orderBibimbap();
		com.orderSundaeStew();
		com.orderBowlOfRice();
		System.out.println();*/
		
		/*Menu[] menus = new Menu[3];
		menus[0] = apt;
		menus[1] = univ;
		menus[2] = com;
		
		for(Menu menu : menus) {
			menu.orderKimchiStew();
			menu.orderBudaeStew();
			menu.orderBibimbap();
			menu.orderSundaeStew();
			menu.orderBowlOfRice();
			System.out.println();
		}*/
		
		printMenu(apt);
		printMenu(univ);
		printMenu(com);
		}
	
	static void printMenu(Menu menu) {
		menu.orderKimchiStew();
		menu.orderBudaeStew();
		menu.orderBibimbap();
		menu.orderSundaeStew();
		menu.orderBowlOfRice();
		System.out.println();
	}
}
