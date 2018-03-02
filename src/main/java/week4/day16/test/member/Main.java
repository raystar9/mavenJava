package week4.day16.test.member;

import java.util.ArrayList;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<MemberInfo> memberList = new ArrayList<>();

		mainMenuLoop(sc, memberList);
		
		sc.close();
	}

	static void mainMenuLoop(Scanner sc, ArrayList<MemberInfo> memberList) {
		String select;
		int selector;

		boolean menuQuit = false;
		while (!menuQuit) {

			Print.Menu.printMenu();
			select = sc.nextLine();
			if (!isNumber(select)) {
				Print.SystemMessage.notANumber(select);
			} else {
				selector = Integer.parseInt(select);
				switch (selector) {
				case 1:
					inputInfo(memberList, sc);
					break;
				case 5:
					Print.Menu.printAll(memberList);
					break;
				case 6:
					Print.SystemMessage.quit();
					menuQuit = true;
					break;
				default:
					Print.SystemMessage.wrongNumber();
				}
			}
		}
	}

	static void inputInfo(ArrayList<MemberInfo> memberList, Scanner sc) {

		String name, email, address;
		int age;
		boolean yq, isRunning;
		MemberInfo member = null;

		isRunning = true;
		while (isRunning) {
			yq = false;
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
		}

	}

	static boolean isNumber(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
