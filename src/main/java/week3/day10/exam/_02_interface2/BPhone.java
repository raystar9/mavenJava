package week3.day10.exam._02_interface2;

public class BPhone implements SmartPhone{
	String _phoneName;
	
	public BPhone(String phoneName) {
		_phoneName = phoneName;
	}

	@Override
	public void communicatable() {
		System.out.println("Communicatable!");
	}

	@Override
	public void communicateType() {
		System.out.println("4G type");
	}

	@Override
	public void remoteControlable() {
		System.out.println("Is equiped remote control function");
	}
}
