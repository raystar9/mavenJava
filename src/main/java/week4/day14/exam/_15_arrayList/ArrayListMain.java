package week4.day14.exam._15_arrayList;

import java.util.ArrayList;
import java.util.List;

class ArrayListMain {

	public static void main(String[] args) {
		List<Object> list = new ArrayList();
		list.add("One");
		list.add(2);
		list.add(3.14);
		list.add("4");
		list.add(true);
		list.add('6');
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "'Th component : " + list.get(i));
		}
		
		for (Object eachList : list) {
			System.out.println(eachList);
		}
	}

}
