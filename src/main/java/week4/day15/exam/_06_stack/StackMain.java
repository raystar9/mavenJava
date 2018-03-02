package week4.day15.exam._06_stack;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

class StackMain {

	public static void main(String[] args) {
		Stack<String> list = new Stack<>();
		
		System.out.println("is empty? : " + list.isEmpty());
		list.push("Grape");
		list.push("Strawberry");
		list.push("Peach");
		
		System.out.println("is empty? : " + list.isEmpty());
		System.out.println("last : " + list.peek());
	
		while(!list.isEmpty()) {
			System.out.println("data : " + list.pop());
		}
		
	}
	static void printList(Vector<String> list) {
		System.out.println("===============================");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
