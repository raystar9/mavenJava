package week5.day19.practice._05_serialization;

import java.io.Serializable;

public class GoodsStock implements Serializable{

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
	
	public int getStock() {
		return _stockCount;
	}
	
	public String getGoodsCode() {
		return _goodsCode;
	}

	@Override
	public String toString() {
		
		return "GoodsCode : " + _goodsCode + ", StockNumber : " + _stockCount;
	}
}
