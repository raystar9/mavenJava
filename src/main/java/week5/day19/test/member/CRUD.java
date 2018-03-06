package week5.day19.test.member;

import java.util.ArrayList;
import java.util.Scanner;

class CRUD {
	//region create
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
	//endregion
	
    //region search
    static ArrayList<Integer> searchByName(ArrayList<MemberInfo> memberList, Scanner sc) {
    	Print.General.inputName();
        String str = sc.nextLine();
        ArrayList<Integer> resultIndex = searchLogicByName(memberList, str);
        if(resultIndex == null) {
        	Print.General.noResult();
        	return null;
        }
        ArrayList<MemberInfo> results = new ArrayList<>();
        
        for(Integer index : resultIndex) {
        	results.add(memberList.get(index));
        }
        Print.Info.printResult(results);
        return resultIndex;
    }

    static ArrayList<Integer> searchByAge(ArrayList<MemberInfo> memberList, Scanner sc) {
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

        ArrayList<Integer> resultIndex = searchLogicByAge(memberList, number);
        if(resultIndex == null) {
        	Print.General.noResult();
        	return null;
        }
        ArrayList<MemberInfo> results = new ArrayList<>();
        
        for(Integer index : resultIndex) {
        	results.add(memberList.get(index));
        }
        Print.Info.printResult(results);
        return resultIndex;
    }

    static ArrayList<Integer> searchByEMail(ArrayList<MemberInfo> memberList, Scanner sc) {
        Print.General.inputEMail();
        String str = sc.nextLine();
        ArrayList<Integer> resultIndex = searchLogicByEMail(memberList, str);
        if(resultIndex == null) {
        	Print.General.noResult();
        	return null;
        }
        ArrayList<MemberInfo> results = new ArrayList<>();
        
        for(Integer index : resultIndex) {
        	results.add(memberList.get(index));
        }
        Print.Info.printResult(results);
        return resultIndex;
    }

    static ArrayList<Integer> searchByAddress(ArrayList<MemberInfo> memberList, Scanner sc) {
        Print.General.inputAddress();
        String str = sc.nextLine();
        ArrayList<Integer> resultIndex = searchLogicByAddress(memberList, str);
        if(resultIndex == null) {
        	Print.General.noResult();
        	return null;
        }
        ArrayList<MemberInfo> results = new ArrayList<>();
        
        for(Integer index : resultIndex) {
        	results.add(memberList.get(index));
        }
        Print.Info.printResult(results);
        return resultIndex;
    }
    //endregion
	
	//region searchLogic
    static ArrayList<Integer> searchLogicByName(ArrayList<MemberInfo> memberList, String str) {
        return searchLogic(memberList, str, CategoryId.name);
    }

    static ArrayList<Integer> searchLogicByAge(ArrayList<MemberInfo> memberList, int num) {
        return searchLogic(memberList, Integer.toString(num), CategoryId.age);
    }

    static ArrayList<Integer> searchLogicByEMail(ArrayList<MemberInfo> memberList, String str) {
        return searchLogic(memberList, str, CategoryId.eMail);
    }

    static ArrayList<Integer> searchLogicByAddress(ArrayList<MemberInfo> memberList, String str) {
        return searchLogic(memberList, str, CategoryId.address);
    }

    private static ArrayList<Integer> searchLogic(ArrayList<MemberInfo> memberList, String str, CategoryId id) {
        ArrayList<Integer> targetIndexArray = new ArrayList<>();
        for (int i = 0; i < memberList.size(); i++) {
            switch (id) {
                case name:
                    if (memberList.get(i).getName().equals(str)) {
                    	targetIndexArray.add(i);
                    }
                    break;
                case age:
                    if (Integer.toString(memberList.get(i).getAge()).equals(str)) {
                    	targetIndexArray.add(i);
                    }
                    break;
                case eMail:
                    if (memberList.get(i).getEMail().equals(str)) {
                    	targetIndexArray.add(i);
                    }
                    break;
                case address:
                    if (memberList.get(i).getAddress().equals(str)) {
                    	targetIndexArray.add(i);
                    }
                    break;
            }
        }
        if (targetIndexArray.size() == 0) {
            return null;
        }
        return targetIndexArray;
    }
    //endregion
    
    //region update
    static void updateByName(ArrayList<MemberInfo> memberList, Scanner sc) {
        ArrayList<Integer> targetList = CRUD.searchByName(memberList, sc);
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
        memberList.get(index - 1).setName(sc.nextLine());
    }
    
    static void updateByAge(ArrayList<MemberInfo> memberList, Scanner sc) {
        ArrayList<Integer> targetList = CRUD.searchByAge(memberList, sc);
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
        memberList.get(index - 1).setAge(Integer.parseInt(check2));
    }
    
    static void updateByEMail(ArrayList<MemberInfo> memberList, Scanner sc) {
        ArrayList<Integer> targetList = CRUD.searchByEMail(memberList, sc);
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
        memberList.get(index - 1).setEMail(sc.nextLine());
    }
    
    static void updateByAddress(ArrayList<MemberInfo> memberList, Scanner sc) {
        ArrayList<Integer> targetList = CRUD.searchByAddress(memberList, sc);
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
        memberList.get(index - 1).setAddress(sc.nextLine());
    }
    //endregion
    
    //region delete
    private static void deleteCategory(ArrayList<MemberInfo> memberList, Scanner sc, CategoryId id) {
    	ArrayList<Integer> targetList = null;
    	String check;
        int index = 1;
        
    	switch(id) {
    	case name:
    		targetList = CRUD.searchByName(memberList, sc);
    		break;
    	case age:
    		targetList = CRUD.searchByAge(memberList, sc);
    		break;
    	case eMail:
    		targetList = CRUD.searchByEMail(memberList, sc);
    		break;
    	case address :
    		targetList = CRUD.searchByAddress(memberList, sc);
    		break;
    	}
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
        memberList.remove(index - 1);
    }

    public static void deleteByName(ArrayList<MemberInfo> memberList, Scanner sc) {
		deleteCategory(memberList, sc, CategoryId.name);
    }
    
	public static void deleteByAge(ArrayList<MemberInfo> memberList, Scanner sc) {
		deleteCategory(memberList, sc, CategoryId.age);
	}

	public static void deleteByEMail(ArrayList<MemberInfo> memberList, Scanner sc) {
		deleteCategory(memberList, sc, CategoryId.eMail);
	}

	public static void deleteByAddress(ArrayList<MemberInfo> memberList, Scanner sc) {
		deleteCategory(memberList, sc, CategoryId.address);
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