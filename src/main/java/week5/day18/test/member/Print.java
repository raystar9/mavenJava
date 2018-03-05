package week5.day18.test.member;

import java.util.ArrayList;

class Print {

    static class Menu {
        static void mainMenu() {
            System.out.println("Select menu");
            System.out.println("1. Input data");
            System.out.println("2. Search data");
            System.out.println("3. Update data");
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

        static void updateMenu() {
            System.out.println("Select the menu you want to update by");
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

        public static void notANumber() {
            systemPrint("You input not a number.");
        }

        public static void quit() {
            systemPrint("Program quit.");
        }

        public static void returnToMain() {
            systemPrint("Return to main menu.");
        }


    }

    static class General {
        static void inputName() {
            System.out.print("Input a name : ");
        }

        static void inputAge() {
            System.out.print("Input an age : ");
        }

        static void inputEMail() {
            System.out.print("Input an E-Mail : ");
        }

        static void inputAddress() {
            System.out.print("Input an address : ");
        }

        static void inputTarget() {
            System.out.print("Input target value : ");
        }

        static void noResult() {
            System.out.println("No result found.");
        }

        static void yesOrQuit() {
            System.out.println("Input 'y' to continue, 'q' to quit");
        }

        public static void wrongNumber() {
            System.out.println("You input wrong number.");
        }

        static void selectResultNo() {
            System.out.print("Select a result number :");
        }

        static void changeSuccessful() {
            System.out.println("Changed successfully.");
        }
    }

    static class Info {
        static void printAll(ArrayList<MemberInfo> memberList) {
            for (int i = 0; i < memberList.size(); i++) {
                System.out.printf("=================person at \'%d\'==================\n", i);
                Print.Info.printInfo(memberList.get(i));
            }
        }

        static void printResult(ArrayList<MemberInfo> memberList) {
            for (int i = 0; i < memberList.size(); i++) {
                System.out.printf("====================Result %d====================\n", i + 1);
                Print.Info.printInfo(memberList.get(i));
            }
        }

        private static void printInfo(MemberInfo memberInfo) {
            System.out.println("Name : " + memberInfo.getName());
            System.out.println("Age : " + memberInfo.getAge());
            System.out.println("E-Mail : " + memberInfo.getEMail());
            System.out.println("Address : " + memberInfo.getAddress());
            System.out.println("================================================");
        }
    }
} 