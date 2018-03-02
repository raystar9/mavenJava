package week4.day15.exam._03_arrayListMethods;

import java.util.ArrayList;

class CompareListMain {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();

		list1.add("Spring");
		list1.add("Summer");
		
		list2.add("Spring");
		list2.add("Fall");
		list2.add("Winter");

		/*list2.removeAll(list1);
		System.out.println(list1);
		System.out.println(list2);*/
		
		list2.addAll(list1);
		System.out.println(list1);
		System.out.println(list2);
		
		if(list1.contains("Spring")) {
			System.out.println("list1 has spring");
		} else {
			System.out.println("list1 doesn't have spring");
		}
		
	}

}
