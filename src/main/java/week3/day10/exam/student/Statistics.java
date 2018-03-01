package week3.day10.exam.student;

class Statistics {
	//region singleton
	private static Statistics instance = new Statistics();
	
	private Statistics() {}
	
	public static Statistics getInstance() {
		return instance;
	}
	//endregion
	
	Student[] _students;
	
	public Student[] getStudents() {
		return _students;
	}

	public void setStudents(Student[] students) {
		_students = students;
		rank();
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
		return _students[index].getEng() 
				+_students[index].getMath() 
				+ _students[index].getKor();
	}
	public float getStudentAverage(int index) {
		return (float) getStudentTotal(index) / Student.SUBJECT_COUNT;
	}
	
	public void rank() {
		for(int j = 0; j < _students.length; j++) {
			_students[j].resetRank();
			for(int i = 0; i < _students.length; i++) {
				if(getStudentTotal(j) < getStudentTotal(i)) {
					_students[j].addRank();
				}
			}
		}
	}
	
	public void sortByEnglish() {
		sort(new FunctionPointer() {
			@Override
			public int func(int i) {
				return _students[i].getEng();
			}
		});
	}

	public void sortByKorean() {
		sort(new FunctionPointer() {
			@Override
			public int func(int i) {
				return _students[i].getKor();
			}
		});
	}

	public void sortByMath() {
		sort(new FunctionPointer() {
			@Override
			public int func(int i) {
				return _students[i].getMath();
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
	
	public void sort(FunctionPointer fp) {
		for(int j = 0; j < _students.length - 1; j++) {
			for(int i = 0; i < _students.length - 1 - j; i++) {
				if(fp.func(i) < fp.func(i + 1)) {
					swap(i, i+1);
				}
			}
		}
	}
	
	private void swap(int i, int j) {
		Student temp = _students[i];
		_students[i] = _students[j];
		_students[j] = temp;
	}
	private interface FunctionPointer {
		int func(int i);
	}
}
