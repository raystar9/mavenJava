package week3.day09.test;

class Student {
	static final int SUBJECT_COUNT = 3;

	private String _name;
	private int _kor;
	private int _math;
	private int _eng;
	private int _rank;
	
	public Student(String name, int kor, int math, int eng) {
		_name = name;
		_kor = kor;
		_math = math;
		_eng = eng;
		_rank = 1;
	}

	public String getName() {
		return _name;
	}
	public int getKor() {
		return _kor;
	}
	public int getMath() {
		return _math;
	}
	public int getEng() {
		return _eng;
	}
	public int getRank() {
		return _rank;
	}
	public void addRank() {
		_rank++;
	}
	public void resetRank() {
		_rank = 1;
	}
}
