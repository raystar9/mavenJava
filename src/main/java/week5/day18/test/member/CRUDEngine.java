package week5.day18.test.member;

import java.util.ArrayList;

class CRUDEngine {
    static ArrayList<MemberInfo> searchByName(ArrayList<MemberInfo> memberList, String str) {
        return searchCategory(memberList, str, CategoryId.name);
    }

    static ArrayList<MemberInfo> searchByAge(ArrayList<MemberInfo> memberList, int num) {
        return searchCategory(memberList, Integer.toString(num), CategoryId.age);
    }

    static ArrayList<MemberInfo> searchByEMail(ArrayList<MemberInfo> memberList, String str) {
        return searchCategory(memberList, str, CategoryId.eMail);
    }

    static ArrayList<MemberInfo> searchByAddress(ArrayList<MemberInfo> memberList, String str) {
        return searchCategory(memberList, str, CategoryId.address);
    }

    private static ArrayList<MemberInfo> searchCategory(ArrayList<MemberInfo> memberList, String str, CategoryId id) {
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

    static void updateByName(ArrayList<MemberInfo> memberList, String target) {
        updateCategory(memberList, target, CategoryId.name);
    }

    private static void updateCategory(ArrayList<MemberInfo> targetList, String target, CategoryId id) {
        if (targetList.size() == 0) {
            Print.General.noResult();
            return;
        } else {
            targetList.get(0).setName(target);
        }
    }
}