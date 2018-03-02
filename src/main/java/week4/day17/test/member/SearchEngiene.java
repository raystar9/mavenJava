package week4.day17.test.member;

import java.util.ArrayList;

class SearchEngiene {
	static ArrayList<MemberInfo> byName(ArrayList<MemberInfo> memberList, String str) {
		ArrayList<MemberInfo> infoList= new ArrayList<>();
		for(MemberInfo info : memberList) {
			if(info.getName().equals(str)) {
				infoList.add(info);
			}
		}
		return infoList;
	}

	static ArrayList<MemberInfo> byAge(ArrayList<MemberInfo> memberList, String str) {
		ArrayList<MemberInfo> infoList= new ArrayList<>();
		for(MemberInfo info : memberList) {
			if(info.getAge() == Integer.valueOf(str)) {
				infoList.add(info);
			}
		}
		return infoList;
	}
	static ArrayList<MemberInfo> byEMail(ArrayList<MemberInfo> memberList, String str) {
		ArrayList<MemberInfo> infoList= new ArrayList<>();
		for(MemberInfo info : memberList) {
			if(info.getEMail().equals(str)) {
				infoList.add(info);
			}
		}
		return infoList;
	}
	static ArrayList<MemberInfo> byAddress(ArrayList<MemberInfo> memberList, String str) {
		ArrayList<MemberInfo> infoList= new ArrayList<>();
		for(MemberInfo info : memberList) {
			if(info.getAddress().equals(str)) {
				infoList.add(info);
			}
		}
		return infoList;
	}
}
