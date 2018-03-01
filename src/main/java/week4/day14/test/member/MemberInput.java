package week4.day14.test.member;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class MemberInput {

	public static void main(String[] args) {
		ArrayList<MemberInfo> memberList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String name, email, address;
		int age;
		MemberInfo member;
		
		System.out.print("Input name : ");
		name = sc.next();
		System.out.print("Input age : ");
		age = sc.nextInt();

		sc.nextLine();

		System.out.print("Input E-Mail : ");
		email = sc.nextLine();
		System.out.print("Input address : ");
		address = sc.nextLine();
		
		member = new MemberInfo(name, age, email, address);
		
		sc.close();
		memberList.add(member);
		
		printInfo(member);
	}
	
	static void printInfo(MemberInfo memberInfo) {
		System.out.println("===============================================");
		System.out.println("Name : " + memberInfo.getName());
		System.out.println("Age : " + memberInfo.getAge());
		System.out.println("E-Mail : " + memberInfo.getEmail());
		System.out.println("Address : " + memberInfo.getAddress());
	}

}
