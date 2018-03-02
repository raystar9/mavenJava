package week4.day15.exam._02_scoreManager;

import java.util.ArrayList;

class TablePrinter {
	public static void print(Statistics statistics) {
		printTitle();
		printLabel();
		printStudents(statistics);
		printBorder();
		printStatistics(statistics);
	}

	private static void printTitle() {
		System.out.println("===================  Score Table ===================");
	}

	private static void printLabel() {
		System.out.println("\tKorean\tMath\tEnglish\tTotal\tAverage\tRank");
	}

	private static void printStudents(Statistics statistics) {
		ArrayList<Student> students = statistics.getStudents();
		
		for(int i = 0; i < students.size(); i++) {
			System.out.print(students.get(i).getName() + "\t");
			System.out.print(students.get(i).getKor() + "\t");
			System.out.print(students.get(i).getMath() + "\t");
			System.out.print(students.get(i).getEng() + "\t");
			System.out.print(statistics.getStudentTotal(i) + "\t");
			System.out.printf("%.1f\t", statistics.getStudentAverage(i));
			System.out.print(students.get(i).getRank() + "\t\n");
		}
	}

	private static void printBorder() {
		System.out.println("====================================================");
	}

	private static void printStatistics(Statistics statistics) {
		System.out.printf("Total\t%d\t%d\t%d",
				statistics.getKorTotal(),
				statistics.getMathTotal(),
				statistics.getEngTotal());
	}
}
