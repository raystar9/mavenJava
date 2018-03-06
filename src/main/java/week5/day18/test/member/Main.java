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
            if (!CRUD.isNumber(select)) {
                Print.SystemMessage.notANumber();
            } else {
                selector = Integer.parseInt(select);
                switch (selector) {
                    case 1:
                        CRUD.inputInfo(memberList, sc);
                        break;
                    case 2:
                        searchMenu(memberList, sc);
                        break;
                    case 3:
                        updateMenu(memberList, sc);
                        break;
                    case 5:
                        Print.Info.printAll(memberList);
                        break;
                    case 6:
                        Print.SystemMessage.quit();
                        mainMenuRunning = false;
                        break;
                    default:
                        Print.General.wrongNumber();
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
            if (!CRUD.isNumber(select)) {
                Print.SystemMessage.notANumber();
            } else {
                selector = Integer.parseInt(select);
                switch (selector) {
                    case 1:
                        CRUD.updateByName(memberList, sc);
                        break;
                    case 2:
                        CRUD.updateByAge(memberList, sc);
                        break;
                    case 3:
                        CRUD.updateByEMail(memberList, sc);
                        break;
                    case 4:
                        CRUD.updateByAddress(memberList, sc);
                        break;
                    case 5:
                        Print.SystemMessage.returnToMain();
                        updateMenuRunning = false;
                        break;
                    default:
                        Print.General.wrongNumber();
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
            if (!CRUD.isNumber(select)) {
                Print.SystemMessage.notANumber();
            } else {
                selector = Integer.parseInt(select);
                switch (selector) {
                    case 1:
                        CRUD.searchByName(memberList, sc);
                        break;
                    case 2:
                        CRUD.searchByAge(memberList, sc);
                        break;
                    case 3:
                        CRUD.searchByEMail(memberList, sc);
                        break;
                    case 4:
                        CRUD.searchByAddress(memberList, sc);
                        break;
                    case 5:
                        Print.SystemMessage.returnToMain();
                        searchMenuRunning = false;
                        break;
                    default:
                        Print.General.wrongNumber();
                }
            }
        }
    }
    
}