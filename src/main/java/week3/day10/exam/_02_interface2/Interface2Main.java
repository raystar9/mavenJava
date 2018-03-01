package week3.day10.exam._02_interface2;

public class Interface2Main {
	public static void main(String[] args) {
		SmartPhone[] smartPhones = new SmartPhone[3];
		smartPhones[0] = new APhone("aPhone");
		smartPhones[1] = new BPhone("bPhone");
		smartPhones[2] = new CPhone("cPhone");
		
		for(SmartPhone smartPhone : smartPhones) {
			printPhoneInfo(smartPhone);
		}
		
	}
	static void printPhoneInfo(SmartPhone smartPhone) {
		smartPhone.communicatable();
		smartPhone.communicateType();
		smartPhone.remoteControlable();
		System.out.println();
	}
}
