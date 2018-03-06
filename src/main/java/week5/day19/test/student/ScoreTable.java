package week5.day19.test.student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class ScoreTable {
	static final String resourceAddress = "src/main/resources/";

	public static void main(String[] args) {

		Statistics stat = Statistics.getInstance();

		ArrayList<Student> students = new ArrayList<>();

		// scoreInserter();
		scoreLoader(students);
		stat.setStudents(students);
		stat.rank();
		stat.sortByTotal();

		TablePrinter.print(stat);
	}

	private static void scoreLoader(ArrayList<Student> students) {
		try (BufferedReader reader = new BufferedReader(new FileReader(resourceAddress + "studentinput.txt"))) {
			StringBuilder sb = new StringBuilder();
			Student student = null;
			int in;
			while ((in = reader.read()) != -1) {
				sb.append((char) in);
			}

			StringTokenizer token = new StringTokenizer(sb.toString(), " \r\n");

			while (token.hasMoreTokens()) {
				student = new Student();
				student.setName(token.nextToken());
				student.setKor(Integer.parseInt(token.nextToken()));
				student.setMath(Integer.parseInt(token.nextToken()));
				student.setEng(Integer.parseInt(token.nextToken()));

				students.add(student);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static void scoreInserter() {
		Scanner sc = new Scanner(System.in);
		boolean isRunning = true;
		while (isRunning) {

			try (BufferedWriter writer = new BufferedWriter(new FileWriter(resourceAddress + "studentinput.txt", true))) {
				System.out.print("Name : ");
				writer.write(sc.nextLine() + " ");
				System.out.print("Korean : ");
				writer.write(sc.nextLine() + " ");
				System.out.print("Math : ");
				writer.write(sc.nextLine() + " ");
				System.out.print("English : ");
				writer.write(sc.nextLine() + " \r\n");
			} catch (NumberFormatException e) {
				System.out.println("Have to input integer.");
			} catch (IOException e) {
				System.out.println("IOException occurred");
			}

			System.out.print("press any key to continue, q or Q to quit : ");
			String checkQuit = sc.nextLine();
			if (checkQuit.equals("q") || checkQuit.equals("Q")) {
				isRunning = false;
			}
		}
		sc.close();
	}
}
