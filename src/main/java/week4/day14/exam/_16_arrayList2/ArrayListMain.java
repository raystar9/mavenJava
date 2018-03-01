package week4.day14.exam._16_arrayList2;

import java.util.ArrayList;
import java.util.List;

class ArrayListMain {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Grape");
		list.add("Strawberry");
		list.add("Peach");
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "'Th component : " + list.get(i));
		}
		
		for (Object eachList : list) {
			System.out.println(eachList);
		}
	}

}
