package week4.day15.test.member;

import java.util.ArrayList;
import java.util.Scanner;

class MemberInput {

	public static void main(String[] args) {
		ArrayList<MemberInfo> memberList = new ArrayList<>();

		inputInfo(memberList);
		printAll(memberList);
	}

	static void inputInfo(ArrayList<MemberInfo> memberList) {
		Scanner sc = new Scanner(System.in);

		String name, email, address;
		int age;

		boolean isRunning = true;
		boolean yq = false;
		MemberInfo member = null;
		
		while (isRunning) {
			try {
				System.out.print("Input name : ");
				name = sc.nextLine();
				System.out.print("Input age : ");
				age = Integer.parseInt(sc.nextLine());
				System.out.print("Input E-Mail : ");
				email = sc.nextLine();
				System.out.print("Input address : ");
				address = sc.nextLine();

				member = new MemberInfo(name, age, email, address);

				memberList.add(member);

				while (!yq) {
					System.out.print("Input 'y' to continue, 'q' to quit : ");
					String in = sc.nextLine();

					if (in.equals("q")) {
						isRunning = false;
						yq = true;
					} else if (in.equals("y")) {
						yq = true;
					}
				}
			} catch (NumberFormatException e) {
				System.out.println("error occurred");
			}
			yq = false;
		}
		sc.close();
	}

	static void printAll(ArrayList<MemberInfo> memberList) {
		for (int i = 0; i < memberList.size(); i++) {
			System.out.printf("=================person at \'%d\'==================\n", i);
			printInfo(memberList.get(i));
		}
	}

	static void printInfo(MemberInfo memberInfo) {
		System.out.println("Name : " + memberInfo.getName());
		System.out.println("Age : " + memberInfo.getAge());
		System.out.println("E-Mail : " + memberInfo.getEmail());
		System.out.println("Address : " + memberInfo.getAddress());
		System.out.println("================================================");
	}
}
