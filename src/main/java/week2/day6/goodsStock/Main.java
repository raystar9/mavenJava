package week2.day6.goodsStock;

public class Main {

	public static void main(String[] args) {
		
		GoodsStock gs = new GoodsStock("52135", 200);
		gs.printStockCount();
		gs.addStock(1000);
		
		gs.printStockCount();
		gs.printGoodsCode();
	}
}
