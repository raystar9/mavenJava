package week5.day20.practice._01_arrayList;

import java.util.ArrayList;

class ArrayListMain {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		
		a.add("1");
		a.add("2");
		a.add("2");
		a.add("3");
		a.add("4");
		a.add("5");
		
		for(int i = 0; i < a.size(); i++) {
			if(a.get(i).equals("2")) {
				a.remove(i);
				i--;
			}
			System.out.println("deleted size : " + a.size());
		}
		System.out.println(a);
	}
}
