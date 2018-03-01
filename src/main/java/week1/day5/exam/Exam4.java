package week1.day5.exam;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		
		String[] names = {"hong", "jeon", "hong", "sejong", "kim"};
		String inputName = "";
		int[] location = {-1, -1, -1, -1, -1};
		int index = 0;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input name : ");
		inputName = sc.nextLine();
		
		for(int i = 0; i < names.length; i++) {
			if(inputName.equals(names[i])) {
				location[index++] = i;
			}
		}
		
		System.out.print(inputName + " is on index ");
		for(int locations : location) {
			if(location[0] == -1) {
				System.out.println(inputName + " cannot found. ");
			} else if(locations != -1){
			System.out.print(locations + " ");
			}
		}
		System.out.println(".");
		sc.close();
	}
}
