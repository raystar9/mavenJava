package week4.day15.exam._07_queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

class QueueMain {

	public static void main(String[] args) {
		Queue<String> list = new LinkedList<>();
		
		System.out.println("is empty? : " + list.isEmpty());
		list.offer("Rabbit");
		list.offer("Deer");
		list.offer("Tiger");
		
		System.out.println("is empty? : " + list.isEmpty());
		System.out.println("last : " + list.peek());
	
		while(!list.isEmpty()) {
			System.out.println("data : " + list.poll());
		}
		
		System.out.println("is empty? : " + list.isEmpty());
	}
	static void printList(Vector<String> list) {
		System.out.println("===============================");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
