package week2.day7.exam.numbers;

public class Numbers {

	private int[] _num;
	
	public Numbers(int[] num) {
		_num = num;
	}
	
	public int getTotal(){
		int result = 0;
		for(int number : _num) {
			result += number;
		}
		return result;
	}
	
	public double getAverage() {
		double result = 0;
		result = (double)getTotal() / _num.length;
		return result;
	}
}
