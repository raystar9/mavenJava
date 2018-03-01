package week3.day09.exam.polymorphism2;

public class Main {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("--------Child c = new Child();---------");
		c.parentPrn();
		c.childPrn();
		System.out.println("c.message = " + c.message);
		System.out.println();
		
		Parent p = c;
		p.parentPrn();
		System.out.println("p.message = " + p.message);
	}

}
