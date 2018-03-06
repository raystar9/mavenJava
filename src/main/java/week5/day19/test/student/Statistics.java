package week5.day19.test.student;

import java.util.ArrayList;

class Statistics {
	//region singleton
	private static Statistics instance = new Statistics();
	
	private Statistics() {}
	
	public static Statistics getInstance() {
		return instance;
	}
	//endregion
	
	ArrayList<Student> _students;
	
	public ArrayList<Student> getStudents() {
		return _students;
	}

	public void setStudents(ArrayList<Student> students) {
		_students = students;
	}
	
	public int getEngTotal() {
		int res = 0;
		for(Student student : _students) {
			res += student.getEng();
		}
		return res;
	}
	public int getMathTotal() {
		int res = 0;
		for(Student student : _students) {
			res += student.getMath();
		}
		return res;
	}
	public int getKorTotal() {
		int res = 0;
		for(Student student : _students) {
			res += student.getKor();
		}
		return res;
	}
	public int getStudentTotal(int index) {
		return _students.get(index).getEng() 
				+_students.get(index).getMath() 
				+ _students.get(index).getKor();
	}
	public float getStudentAverage(int index) {
		return (float) getStudentTotal(index) / Student.SUBJECT_COUNT;
	}
	
	public void rank() {
		for(int j = 0; j < _students.size(); j++) {
			_students.get(j).resetRank();
			for(int i = 0; i < _students.size(); i++) {
				if(getStudentTotal(j) < getStudentTotal(i)) {
					_students.get(j).addRank();
				}
			}
		}
	}
	//region sort
	public void sortByEnglish() {
		sort(new FunctionPointer() {
			@Override
			public int func(int i) {
				return _students.get(i).getEng();
			}
		});
	}

	public void sortByKorean() {
		sort(new FunctionPointer() {
			@Override
			public int func(int i) {
				return _students.get(i).getKor();
			}
		});
	}

	public void sortByMath() {
		sort(new FunctionPointer() {
			@Override
			public int func(int i) {
				return _students.get(i).getMath();
			}
		});
	}

	public void sortByTotal() {
		sort(new FunctionPointer() {
			@Override
			public int func(int i) {
				return getStudentTotal(i);
			}
		});
	}
	
	private void sort(FunctionPointer fp) {
		for(int j = 0; j < _students.size() - 1; j++) {
			for(int i = 0; i < _students.size() - 1 - j; i++) {
				if(fp.func(i) < fp.func(i + 1)) {
					swap(i, i+1);
				}
			}
		}
	}
	
	private interface FunctionPointer {
		int func(int i);
	}
	//endregion
	
	private void swap(int i, int j) {
		Student temp = _students.get(i);
		_students.set(i, _students.get(j));
		_students.set(j, temp);
	}
	
}
