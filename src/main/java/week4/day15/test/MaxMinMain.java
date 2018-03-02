package week4.day15.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class MaxMinMain {
	static final String MAX_VALUE = "max";
	static final String MIN_VALUE = "min";
	
	public static void main(String[] args) {
		int data[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input 5 integer : ");
		for(int i = 0; i < data.length; i++) {
			data[i] = sc.nextInt();
		}
		sc.close();
		Map<String, Integer> m = max_min(data);
		System.out.println("max = " + m.get(MAX_VALUE));
		System.out.println("min = " + m.get(MIN_VALUE));
	}
	
	static Map<String, Integer> max_min(int[] data){
		Map<String, Integer> map = new HashMap<>();
		map.put("max", data[0]);
		map.put("min", data[0]);
		
		for(int i = 0; i < data.length - 1; i++) {
			if(map.get(MAX_VALUE) < data[i + 1]) {
				map.put(MAX_VALUE, data[i + 1]);
			} 
			if(map.get(MIN_VALUE) > data[i + 1]){
				map.put(MIN_VALUE, data[i + 1]);
			}
		}
		return map;
	}
}
