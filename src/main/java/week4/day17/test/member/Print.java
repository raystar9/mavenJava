package week4.day17.test.member;

import java.util.ArrayList;

class Print {
	
	static class Menu {
		
		static void printAll(ArrayList<MemberInfo> memberList) {
			for (int i = 0; i < memberList.size(); i++) {
				System.out.printf("=================person at \'%d\'==================\n", i);
				Print.Menu.printInfo(memberList.get(i));
			}
		}
		
		static void printInfo(MemberInfo memberInfo) {
			System.out.println("Name : " + memberInfo.getName());
			System.out.println("Age : " + memberInfo.getAge());
			System.out.println("E-Mail : " + memberInfo.getEMail());
			System.out.println("Address : " + memberInfo.getAddress());
			System.out.println("================================================");
		}

		static void mainMenu() {
			System.out.println("Select menu");
			System.out.println("1. Input data");
			System.out.println("2. Search data");
			System.out.println("5. Output data");
			System.out.println("6. Quit");
		}
		
		static void searchMenu() {
			System.out.println("Select the menu you want to search for");
			System.out.println("1. Name");
			System.out.println("2. Age");
			System.out.println("3. E-Mail");
			System.out.println("4. Address");
			System.out.println("5. Return to main menu");
		}
		
	}
	
	static class SystemMessage {
		private static String _system = "SYSTEM > ";
		private static void systemPrint(String str) {
			System.out.println(_system + str);
		}
		public static void notANumber(String str) {
			systemPrint("\'" + str + "\' is not a menu number.");
		}
		
		public static void quit() {
			systemPrint("Program quit.");
		}
		
		public static void returnMain() {
			systemPrint("Return to main menu.");
		}
		
		public static void wrongNumber() {
			systemPrint("You input wrong number.");
		}
	
	}

	static class General {
		static void searchByName() {
			System.out.print("Input a name : ");
		}
		static void searchByAge() {
			System.out.print("Input an age : ");
		}
		static void searchByEMail() {
			System.out.print("Input an E-Mail : ");
		}
		static void searchByAddress() {
			System.out.print("Input an address : ");
		}
		static void noResult() {
			System.out.println("No result.");
		}
	}
}
