package week5.day18.test.member;

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

        boolean mainMenuRunning = true;
        while (mainMenuRunning) {

            Print.Menu.mainMenu();
            select = sc.nextLine();
            if (!isNumber(select)) {
                Print.SystemMessage.notANumber();
            } else {
                selector = Integer.parseInt(select);
                switch (selector) {
                    case 1:
                        inputInfo(memberList, sc);
                        break;
                    case 2:
                        searchMenu(memberList, sc);
                        break;
                    case 3:
                    	updateMenu(memberList, sc);
                    case 5:
                        Print.Info.printAll(memberList);
                        break;
                    case 6:
                        Print.SystemMessage.quit();
                        mainMenuRunning = false;
                        break;
                    default:
                        Print.SystemMessage.wrongNumber();
                }
            }
        }
    }

    private static void updateMenu(ArrayList<MemberInfo> memberList, Scanner sc) {
    	boolean updateMenuRunning = true;
    	int selector;
        while (updateMenuRunning) {
            Print.Menu.updateMenu();
            String select = sc.nextLine();
            if (!isNumber(select)) {
                Print.SystemMessage.notANumber();
            } else {
                selector = Integer.parseInt(select);
                switch (selector) {
                    case 1:
                        updateByName(memberList, sc);
                        break;
                    case 2:
                        updateByAge(memberList, sc);
                        break;
                    case 3:
                        updateByEMail(memberList, sc);
                        break;
                    case 4:
                        updateByAddress(memberList, sc);
                        break;
                    case 5:
                        Print.SystemMessage.returnToMain();
                        updateMenuRunning = false;
                        break;
                    default:
                        Print.SystemMessage.wrongNumber();
                }
            }
        }
	}

	private static void updateByName(ArrayList<MemberInfo> memberList, Scanner sc) {
		Print.General.inputName();
        String str = sc.nextLine();
        ArrayList<MemberInfo> results = SearchEngine.byName(memberList, str);
        if (results != null) {
            Print.Info.printResult(results);
        } else {
            Print.General.noResult();
        }
	}

	static void inputInfo(ArrayList<MemberInfo> memberList, Scanner sc) {

        String name, email, address, ageStr;
        int age;
        boolean yq, isRunning;
        MemberInfo member;

        isRunning = true;
        while (isRunning) {
            yq = false;
            Print.General.inputName();
            name = sc.nextLine();
            while (true) {
                Print.General.inputAge();
                ageStr = sc.nextLine();
                if (isNumber(ageStr)) {
                    age = Integer.parseInt(ageStr);
                    break;
                }
                Print.SystemMessage.notANumber();
            }
            Print.General.inputEMail();
            email = sc.nextLine();
            Print.General.inputAddress();
            address = sc.nextLine();

            member = new MemberInfo(name, age, email, address);

            memberList.add(member);

            while (!yq) {
                Print.General.yesOrQuit();
                String in = sc.nextLine();

                if (in.equals("q")) {
                    isRunning = false;
                    Print.SystemMessage.returnToMain();
                    yq = true;
                } else if (in.equals("y")) {
                    yq = true;
                }
            }
        }
    }

    static void searchMenu(ArrayList<MemberInfo> memberList, Scanner sc) {
        boolean searchMenuRunning = true;
        int selector;
        while (searchMenuRunning) {
            Print.Menu.searchMenu();
            String select = sc.nextLine();
            if (!isNumber(select)) {
                Print.SystemMessage.notANumber();
            } else {
                selector = Integer.parseInt(select);
                switch (selector) {
                    case 1:
                        searchByName(memberList, sc);
                        break;
                    case 2:
                        searchByAge(memberList, sc);
                        break;
                    case 3:
                        searchByEMail(memberList, sc);
                        break;
                    case 4:
                        searchByAddress(memberList, sc);
                        break;
                    case 5:
                        Print.SystemMessage.returnToMain();
                        searchMenuRunning = false;
                        break;
                    default:
                        Print.SystemMessage.wrongNumber();
                }
            }
        }
    }

    //region search
    static void searchByName(ArrayList<MemberInfo> memberList, Scanner sc) {
        Print.General.inputName();
        String str = sc.nextLine();
        ArrayList<MemberInfo> results = SearchEngine.byName(memberList, str);
        if (results != null) {
            Print.Info.printResult(results);
        } else {
            Print.General.noResult();
        }
    }

    static void searchByAge(ArrayList<MemberInfo> memberList, Scanner sc) {
        String numStr;
        int number;
        while (true) {
            Print.General.inputAge();
            numStr = sc.nextLine();

            if (isNumber(numStr)) {
                number = Integer.parseInt(numStr);
                break;
            }
        }

        ArrayList<MemberInfo> results = SearchEngine.byAge(memberList, number);
        if (results != null) {
            Print.Info.printResult(results);
        } else {
            Print.General.noResult();
        }
    }

    static void searchByEMail(ArrayList<MemberInfo> memberList, Scanner sc) {
        Print.General.inputEMail();
        String str = sc.nextLine();
        ArrayList<MemberInfo> results = SearchEngine.byEMail(memberList, str);
        if (results != null) {
            Print.Info.printResult(results);
        } else {
            Print.General.noResult();
        }
    }

    static void searchByAddress(ArrayList<MemberInfo> memberList, Scanner sc) {
        Print.General.inputAddress();
        String str = sc.nextLine();
        ArrayList<MemberInfo> results = SearchEngine.byAddress(memberList, str);
        if (results != null) {
            Print.Info.printResult(results);
        } else {
            Print.General.noResult();
        }
    }
    //endregion

    static boolean isNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}