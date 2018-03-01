package week3.day10.exam._02_interface2;

public class CPhone implements SmartPhone{
	
	String _phoneName;
	
	public CPhone(String phoneName) {
		_phoneName = phoneName;
	}
	@Override
	public void communicatable() {
		System.out.println("Communicatable!");
	}

	@Override
	public void communicateType() {
		System.out.println("3G type");
	}

	@Override
	public void remoteControlable() {
		System.out.println("Is not equiped remote control function");
	}
}
