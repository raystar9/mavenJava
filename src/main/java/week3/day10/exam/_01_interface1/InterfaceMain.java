package week3.day10.exam._01_interface1;

public class InterfaceMain {
	InterfaceMain(){
		
	}
	public static void main(String[] args) {
		Label label = new Label("hi", 30, 15, "black", "red", "gothic");
		
		printLabel(label);
		label.setBackground("blue");
		label.setForeground("white");
		label.resize(40, 30);
		printLabel(label);
	}
	
	public static void printLabel(Label label) {
		System.out.println("===============================");
		System.out.println("fg color : " + label.getForeGround());
		System.out.println("bg color : " + label.getBackGround());
		System.out.println("font : " + label.getFont());
		System.out.println("width : " + label.getWidth());
		System.out.println("height : " + label.getHeight());
		System.out.println("===============================");		
	}
}
