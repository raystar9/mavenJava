package week3.day09.exam.polymorphism2;

public class Child extends Parent{

	public String message = "Child";
	public void childPrn() {
		System.out.println("sub class : childPrn method");
	}
	@Override
	public void parentPrn() {
		System.out.println("sub class : parentPrn method");
	}
	
	
}
