package week4.day16.test.member;

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
			System.out.println("E-Mail : " + memberInfo.getEmail());
			System.out.println("Address : " + memberInfo.getAddress());
			System.out.println("================================================");
		}

		static void printMenu() {
			System.out.println("Select menu");
			System.out.println("1. Input data");
			System.out.println("5. Output data");
			System.out.println("6. Quit");
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
		
		public static void wrongNumber() {
			systemPrint("You input wrong number.");
		}
	}
}
