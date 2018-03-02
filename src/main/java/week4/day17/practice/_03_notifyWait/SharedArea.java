package week4.day17.practice._03_notifyWait;

class SharedArea {
	private double _result;
	private boolean _isReady;

	public double getResult() {
		return _result;
	}

	public void setResult(double result) {
		_result = result;
	}
	
	public boolean isReady() {
		return _isReady;
	}
	
	public void ready() {
		_isReady = true;
	}
	
	public void notReady() {
		_isReady = false;
	}
}
