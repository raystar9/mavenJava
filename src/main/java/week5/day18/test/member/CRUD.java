package week5.day18.test.member;

import java.util.ArrayList;
import java.util.Scanner;

class CRUD {
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

    //region search
    static ArrayList<MemberInfo> searchByName(ArrayList<MemberInfo> memberList, Scanner sc) {
        Print.General.inputName();
        String str = sc.nextLine();
        ArrayList<MemberInfo> results = CRUD.searchLogicByName(memberList, str);
        if (results != null) {
            Print.Info.printResult(results);
        } else {
            Print.General.noResult();
        }
        return results;
    }

    static ArrayList<MemberInfo> searchByAge(ArrayList<MemberInfo> memberList, Scanner sc) {
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

        ArrayList<MemberInfo> results = CRUD.searchLogicByAge(memberList, number);
        if (results != null) {
            Print.Info.printResult(results);
        } else {
            Print.General.noResult();
        }
        return results;
    }

    static ArrayList<MemberInfo> searchByEMail(ArrayList<MemberInfo> memberList, Scanner sc) {
        Print.General.inputEMail();
        String str = sc.nextLine();
        ArrayList<MemberInfo> results = CRUD.searchLogicByEMail(memberList, str);
        if (results != null) {
            Print.Info.printResult(results);
        } else {
            Print.General.noResult();
        }
        return results;
    }

    static ArrayList<MemberInfo> searchByAddress(ArrayList<MemberInfo> memberList, Scanner sc) {
        Print.General.inputAddress();
        String str = sc.nextLine();
        ArrayList<MemberInfo> results = CRUD.searchLogicByAddress(memberList, str);
        if (results != null) {
            Print.Info.printResult(results);
        } else {
            Print.General.noResult();
        }
        return results;
    }
    //endregion
	
	//region searchLogic
    static ArrayList<MemberInfo> searchLogicByName(ArrayList<MemberInfo> memberList, String str) {
        return searchLogic(memberList, str, CategoryId.name);
    }

    static ArrayList<MemberInfo> searchLogicByAge(ArrayList<MemberInfo> memberList, int num) {
        return searchLogic(memberList, Integer.toString(num), CategoryId.age);
    }

    static ArrayList<MemberInfo> searchLogicByEMail(ArrayList<MemberInfo> memberList, String str) {
        return searchLogic(memberList, str, CategoryId.eMail);
    }

    static ArrayList<MemberInfo> searchLogicByAddress(ArrayList<MemberInfo> memberList, String str) {
        return searchLogic(memberList, str, CategoryId.address);
    }

    private static ArrayList<MemberInfo> searchLogic(ArrayList<MemberInfo> memberList, String str, CategoryId id) {
        ArrayList<MemberInfo> infoList = new ArrayList<>();
        for (MemberInfo info : memberList) {
            switch (id) {
                case name:
                    if (info.getName().equals(str)) {
                        infoList.add(info);
                    }
                    break;
                case age:
                    if (Integer.toString(info.getAge()).equals(str)) {
                        infoList.add(info);
                    }
                    break;
                case eMail:
                    if (info.getEMail().equals(str)) {
                        infoList.add(info);
                    }
                    break;
                case address:
                    if (info.getAddress().equals(str)) {
                        infoList.add(info);
                    }
                    break;
            }
        }
        if (infoList.size() == 0) {
            return null;
        }
        return infoList;
    }
    //endregion
    
    //region update
    static void updateByName(ArrayList<MemberInfo> memberList, Scanner sc) {
        ArrayList<MemberInfo> targetList = CRUD.searchByName(memberList, sc);
        String check;
        int index = 1;
        if (targetList.size() == 0) {
            Print.General.noResult();
            return;
        } else if (targetList.size() >= 2) {
            while (true) {
                Print.General.selectResultNo();
                check = sc.nextLine();
                if (CRUD.isNumber(check)) {
                    index = Integer.parseInt(check);
                    if (index <= targetList.size() && index > 0)
                        break;
                    else
                        Print.General.wrongNumber();
                }
            }
        }
        Print.General.inputTarget();
        targetList.get(index - 1).setName(sc.nextLine());
    }
    
    static void updateByAge(ArrayList<MemberInfo> memberList, Scanner sc) {
        ArrayList<MemberInfo> targetList = CRUD.searchByAge(memberList, sc);
        String check;
        String check2;
        int index = 1;
        if (targetList.size() == 0) {
            Print.General.noResult();
            return;
        } else if (targetList.size() >= 2) {
            while (true) {
                Print.General.selectResultNo();
                check = sc.nextLine();
                if (CRUD.isNumber(check)) {
                    index = Integer.parseInt(check);
                    if (index <= targetList.size() && index > 0)
                        break;
                    else
                        Print.General.wrongNumber();
                }
            }
        }
        
        while(true) {
        	Print.General.inputTarget();
        	check2 = sc.nextLine();
        	if(isNumber(check2)) {
        		break;
        	}
        }
        targetList.get(index - 1).setAge(Integer.parseInt(check2));
    }
    
    static void updateByEMail(ArrayList<MemberInfo> memberList, Scanner sc) {
        ArrayList<MemberInfo> targetList = CRUD.searchByEMail(memberList, sc);
        String check;
        int index = 1;
        if (targetList.size() == 0) {
            Print.General.noResult();
            return;
        } else if (targetList.size() >= 2) {
            while (true) {
                Print.General.selectResultNo();
                check = sc.nextLine();
                if (CRUD.isNumber(check)) {
                    index = Integer.parseInt(check);
                    if (index <= targetList.size() && index > 0)
                        break;
                    else
                        Print.General.wrongNumber();
                }
            }
        }
        Print.General.inputTarget();
        targetList.get(index - 1).setEMail(sc.nextLine());
    }
    
    static void updateByAddress(ArrayList<MemberInfo> memberList, Scanner sc) {
        ArrayList<MemberInfo> targetList = CRUD.searchByAddress(memberList, sc);
        String check;
        int index = 1;
        if (targetList.size() == 0) {
            Print.General.noResult();
            return;
        } else if (targetList.size() >= 2) {
            while (true) {
                Print.General.selectResultNo();
                check = sc.nextLine();
                if (CRUD.isNumber(check)) {
                    index = Integer.parseInt(check);
                    if (index <= targetList.size() && index > 0)
                        break;
                    else
                        Print.General.wrongNumber();
                }
            }
        }
        Print.General.inputTarget();
        targetList.get(index - 1).setAddress(sc.nextLine());
    }
    //endregion
    
    static boolean isNumber(String str) {
        if (str.equals(""))
            return false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}