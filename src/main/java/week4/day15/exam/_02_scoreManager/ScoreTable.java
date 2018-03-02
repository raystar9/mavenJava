package week4.day15.exam._02_scoreManager;

import java.util.ArrayList;
import java.util.Scanner;

class ScoreTable {
	public static void main(String[] args) {
		
		Statistics stat = Statistics.getInstance();
		
		ArrayList<Student> students = new ArrayList<>();
		
		scoreInserter(students);
		
		stat.setStudents(students);
		stat.rank();
		stat.sortByTotal();
		
		TablePrinter.print(stat);
	}
	
	static void scoreInserter(ArrayList<Student> students) {
		Scanner sc = new Scanner(System.in);
		boolean isRunning = true;
		while(isRunning) {
			Student student = new Student();
			
			System.out.print("Name : ");
			student.setName(sc.nextLine());
			
			try {
				System.out.print("Korean : ");
				student.setKor(Integer.parseInt(sc.nextLine()));
				System.out.print("Math : ");
				student.setMath(Integer.parseInt(sc.nextLine()));
				System.out.print("English : ");
				student.setEng(Integer.parseInt(sc.nextLine()));
				students.add(student);
			} catch (NumberFormatException e) {
				System.out.println("Have to input integer.");
			}
			
			System.out.print("press any key to continue, q or Q to quit : ");
			String checkQuit = sc.nextLine();
			if(checkQuit.equals("q") ||checkQuit.equals("Q")){
				isRunning = false;
			}
		}
		sc.close();
	}
}
