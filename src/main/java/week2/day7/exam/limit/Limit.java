package week2.day7.exam.limit;

public class Limit {

	static final int UPPER_LIMIT = 100000;
	int _value;
	
	void setValue(int value) {
		if(value < UPPER_LIMIT) {
			_value = value;
		} else
			_value = UPPER_LIMIT;
	}
}
