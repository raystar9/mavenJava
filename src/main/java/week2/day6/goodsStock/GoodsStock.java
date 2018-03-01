package week2.day6.goodsStock;

public class GoodsStock {

	private String _goodsCode;
	private int _stockCount;
	
	public GoodsStock() {
		
	}

	public GoodsStock(String goodsCode, int stockCount) {
		_goodsCode = goodsCode;
		_stockCount = stockCount;
	}
	
	public void addStock(int number){
		_stockCount += number;
	}
	
	public void substractStock(int number) {
		_stockCount -= number;
	}
	
	public void printStockCount() {
		System.out.println(_stockCount);
	}
	
	public void printGoodsCode() {
		System.out.println(_goodsCode);
	}
}
