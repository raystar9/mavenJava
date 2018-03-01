package week2.day7.exam.physicalInfo;

public class Main {

	public static void main(String[] args) {
		
		PhysicalInfo koo = new PhysicalInfo("koo", 29 , 184, 72);
		InfoPrinter printer = new InfoPrinter();
		koo.update(30);
		printer.printPhysicalInfo(koo);
		
		koo.update(31, 183);
		printer.printPhysicalInfo(koo);
		
		koo.update(32, 184, 75);
		printer.printPhysicalInfo(koo);
		
		Main main = new Main();
		main.printPhysicalInfo(koo);
	}
	void printPhysicalInfo(PhysicalInfo physicalInfo) {
		System.out.println("name = " + physicalInfo.getName());
		System.out.println("age = " + physicalInfo.getAge());
		System.out.println("height = " + physicalInfo.getHeight());
		System.out.println("weight = " + physicalInfo.getWeight());
		System.out.println();
	}
}
