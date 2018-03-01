package week3.day10.exam.student;

class ScoreTable {
	public static void main(String[] args) {
		
		Statistics stat = Statistics.getInstance();
		
		Student[] students = new Student[5];
		
		students[0] = new Student("Hodong", 85, 60, 70);
		students[1] = new Student("SeungKi", 90, 95, 80);
		students[2] = new Student("Jaeseok", 75, 80, 100);
		students[3] = new Student("Haha", 80, 70, 95);
		students[4] = new Student("Kwangsu", 100, 65, 80);
		
		stat.setStudents(students);
		stat.sortByTotal();
		
		TablePrinter.print(stat);
	}
}
