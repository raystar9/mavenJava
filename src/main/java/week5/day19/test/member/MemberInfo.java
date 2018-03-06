package week5.day19.test.member;

class MemberInfo {
    private String _name;
    private int _age;
    private String _email;
    private String _address;
   
    public MemberInfo(String name, int age, String email, String address) {
        _name = name;
        _age = age;
        _email = email;
        _address = address;
    }
   
    public String getName() {
        return _name;
    }
    public int getAge() {
        return _age;
    }
    public String getEMail() {
        return _email;
    }
    public String getAddress() {
        return _address;
    }
    public void setName(String name) {
        _name = name;
    }
    public void setAge(int age) {
        _age = age;
    }
    public void setEMail(String email) {
        _email = email;
    }
    public void setAddress(String address) {
        _address = address;
    }
   
}