package week5.day19.test.member;

import java.util.ArrayList;
import java.util.Scanner;

class CRUD {
	// region create
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
				Print.General.notANumber();
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
	// endregion

	// region search
	private static ArrayList<Integer> searchByCategory(ArrayList<MemberInfo> memberList, Scanner sc,
			CategoryFunction function) {
		function.printCategory();
		ArrayList<Integer> resultIndexList = new ArrayList<>();
		ArrayList<MemberInfo> resultMemberList = new ArrayList<>();
		String str = sc.nextLine();

		for (int i = 0; i < memberList.size(); i++) {
			if (function.getCategory(memberList.get(i)).equals(str)) {
				resultMemberList.add(memberList.get(i));
				resultIndexList.add(i);
			}
		}
		if (resultIndexList.isEmpty()) {
			Print.General.noResult();
			return null;
		}
		Print.Info.printResult(resultMemberList);
		return resultIndexList;
	}

	static ArrayList<Integer> searchByName(ArrayList<MemberInfo> memberList, Scanner sc) {
		return searchByCategory(memberList, sc, new NameFunctions());
	}

	static ArrayList<Integer> searchByAge(ArrayList<MemberInfo> memberList, Scanner sc) {
		return searchByCategory(memberList, sc, new AgeFunctions());
	}

	static ArrayList<Integer> searchByEMail(ArrayList<MemberInfo> memberList, Scanner sc) {
		return searchByCategory(memberList, sc, new EMailFunctions());
	}

	static ArrayList<Integer> searchByAddress(ArrayList<MemberInfo> memberList, Scanner sc) {
		return searchByCategory(memberList, sc, new AddressFunctions());
	}
	// endregion

	// region update
	private static void updateByCategory(ArrayList<MemberInfo> memberList, Scanner sc,
			SearchCategoryFunction function) {
		ArrayList<Integer> targetList = function.searchByCategory(memberList, sc);
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
		
		while(true) {
			Print.General.inputTarget();
			try{
				function.setCategory(memberList.get(index - 1), sc.nextLine());
				break;
			} catch (Exception e) {
				Print.General.notANumber();
			}
		}
	}

	static void updateByName(ArrayList<MemberInfo> memberList, Scanner sc) {
		updateByCategory(memberList, sc, new SearchNameFunctions());
	}

	static void updateByAge(ArrayList<MemberInfo> memberList, Scanner sc) {
		updateByCategory(memberList, sc, new SearchAgeFunctions());
	}

	static void updateByEMail(ArrayList<MemberInfo> memberList, Scanner sc) {
		updateByCategory(memberList, sc, new SearchEMailFunctions());
	}

	static void updateByAddress(ArrayList<MemberInfo> memberList, Scanner sc) {
		updateByCategory(memberList, sc, new SearchAddressFunctions());
	}
	// endregion

	// region delete
	private static void deleteCategory(ArrayList<MemberInfo> memberList, Scanner sc, SearchCategoryFunction function) {
		ArrayList<Integer> targetList = null;
		String check;
		int index = 1;

		targetList = function.searchByCategory(memberList, sc);
		
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
		deleteCategory(memberList, sc, new SearchNameFunctions());
	}

	public static void deleteByAge(ArrayList<MemberInfo> memberList, Scanner sc) {
		deleteCategory(memberList, sc, new SearchAgeFunctions());
	}

	public static void deleteByEMail(ArrayList<MemberInfo> memberList, Scanner sc) {
		deleteCategory(memberList, sc, new SearchEMailFunctions());
	}

	public static void deleteByAddress(ArrayList<MemberInfo> memberList, Scanner sc) {
		deleteCategory(memberList, sc, new SearchAddressFunctions());
	}
	// endregion

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

// region function interface
interface CategoryFunction {
	String getCategory(MemberInfo memberInfo);

	void setCategory(MemberInfo memberInfo, String string) throws NumberFormatException;

	void printCategory();
}

class NameFunctions implements CategoryFunction {

	@Override
	public String getCategory(MemberInfo memberInfo) {
		return memberInfo.getName();
	}

	@Override
	public void setCategory(MemberInfo memberInfo, String string) {
		memberInfo.setName(string);
	}

	@Override
	public void printCategory() {
		Print.General.inputName();
	}
}

class AgeFunctions implements CategoryFunction {

	@Override
	public String getCategory(MemberInfo memberInfo) {
		return Integer.toString(memberInfo.getAge());
	}

	@Override
	public void setCategory(MemberInfo memberInfo, String string) throws NumberFormatException {
		memberInfo.setAge(Integer.parseInt(string));
	}

	@Override
	public void printCategory() {
		Print.General.inputName();
	}
}

class EMailFunctions implements CategoryFunction {

	@Override
	public String getCategory(MemberInfo memberInfo) {
		return memberInfo.getEMail();
	}

	@Override
	public void setCategory(MemberInfo memberInfo, String string) {
		memberInfo.setEMail(string);
	}

	@Override
	public void printCategory() {
		Print.General.inputEMail();
	}
}

class AddressFunctions implements CategoryFunction {

	@Override
	public String getCategory(MemberInfo memberInfo) {
		return memberInfo.getAddress();
	}

	@Override
	public void setCategory(MemberInfo memberInfo, String string) {
		memberInfo.setAddress(string);
	}

	@Override
	public void printCategory() {
		Print.General.inputAddress();
	}
}

interface SearchCategoryFunction extends CategoryFunction {
	ArrayList<Integer> searchByCategory(ArrayList<MemberInfo> memberList, Scanner sc);
}

class SearchNameFunctions extends NameFunctions implements SearchCategoryFunction {

	@Override
	public ArrayList<Integer> searchByCategory(ArrayList<MemberInfo> memberList, Scanner sc) {
		return CRUD.searchByName(memberList, sc);

	}
}

class SearchAgeFunctions extends AgeFunctions implements SearchCategoryFunction {

	@Override
	public ArrayList<Integer> searchByCategory(ArrayList<MemberInfo> memberList, Scanner sc) {
		return CRUD.searchByAge(memberList, sc);

	}
}

class SearchEMailFunctions extends EMailFunctions implements SearchCategoryFunction {

	@Override
	public ArrayList<Integer> searchByCategory(ArrayList<MemberInfo> memberList, Scanner sc) {
		return CRUD.searchByEMail(memberList, sc);

	}
}

class SearchAddressFunctions extends AddressFunctions implements SearchCategoryFunction {

	@Override
	public ArrayList<Integer> searchByCategory(ArrayList<MemberInfo> memberList, Scanner sc) {
		return CRUD.searchByAddress(memberList, sc);

	}
}

// endregion
