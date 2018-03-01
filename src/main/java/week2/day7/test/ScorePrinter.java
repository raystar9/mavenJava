package week2.day7.test;

public class ScorePrinter {
	
	public void printTable(Student[] students) {
		printTitle();
		printLabel();
		printScore(students);
		printBoundary();
		printStatistics();
	}
	
	private void printTitle() {
		System.out.println("================  Score Table ================");
		
	}
	
	private void printLabel() {
		System.out.println("\tKorean\tMath\tEnglish\tTotal\tAverage");
	}
	
	private void printScore(Student[] students) {
		for(int i = 0; i < students.length; i++) {
			System.out.printf("%s\t", students[i].getName());
			System.out.printf("%d\t", students[i].getKor());
			System.out.printf("%d\t", students[i].getMath());
			System.out.printf("%d\t", students[i].getEng());
			System.out.printf("%d\t", students[i].getTotal());
			System.out.printf("%.1f\n", students[i].getAverage());
		}
	}
	
	private void printBoundary() {
		System.out.println("==============================================");
		
	}
	
	private void printStatistics() {
		System.out.printf("Total\t%d\t%d\t%d",
				Student.getTotalKor(),
				Student.getTotalMath(),
				Student.getTotalEng());
	}
}
