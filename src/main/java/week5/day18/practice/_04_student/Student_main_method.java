package week5.day18.practice._04_student;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student_main_method {
	static final String resourceAddress = "src/main/resources/";
	static final String dataAddress = "student/student.dat";
	
	public static void main(String args[]) {
		ArrayList<Student> studentList = new ArrayList<>();
		String fileAddress = resourceAddress + dataAddress;
		outputData(fileAddress);
		inputData(studentList, fileAddress);
		print(studentList);
	}
	
	static void outputData(String address) {
		String pandan = "";
		String name="";
		int kor, eng, math;
		Scanner sc = new Scanner(System.in);
		DataOutputStream out = null;
		try {
			out = new DataOutputStream(new FileOutputStream(address));
			while (!pandan.equalsIgnoreCase("q")) {
				System.out.println("이름을 입력하세요?");
				name = sc.nextLine();
				System.out.println("국어 점수를 입력하세요?");
				kor = sc.nextInt();
				System.out.println("영어 점수를 입력하세요?");
				eng = sc.nextInt();
				System.out.println("수학 점수를 입력하세요?");
				math = sc.nextInt(); // 수학 점수 입력 후 엔터를 입력하는데 수학점수는 math가 가져가고 엔터는 nextLine()이 가져갑니다.
				sc.nextLine();
				out.writeUTF(name);
				out.writeInt(kor);
				out.writeInt(eng);
				out.writeInt(math);
				
				System.out.println("계속입력하시겠습니까?(q 또는 Q 이면 종료)");
				pandan = sc.nextLine();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		sc.close();
	}
	
	private static void inputData(ArrayList<Student> list, String address) {
		String name = "";
		int kor, eng, math;
		DataInputStream in = null;
		try {
			in = new DataInputStream(new FileInputStream(address));
			while(true) {
				name = in.readUTF();
				kor = in.readInt();
				eng = in.readInt();
				math = in.readInt();

				list.add(new Student(name, kor, eng, math));
			}
		} catch (EOFException eof) {
			System.out.println("Import ended.");
		} catch (Exception e) {
			
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


	static void print(ArrayList<Student> list) {
		System.out.println("==========   학생별   /  과목별 총점구하기  ==========");
		System.out.println("이름\t국어\t수학\t영어\t총점\t평균");

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).name + "\t" + list.get(i).kor + "\t" + list.get(i).eng + "\t"
					+ list.get(i).math + "\t" + list.get(i).getTotal() + "\t");
			System.out.printf("%.1f\n", list.get(i).getAverage());
		}

		for (int j = 0; j < 45; j++) {
			System.out.print("=");
		}

		System.out.print("\n총점\t");
		System.out.print(Student.korTotal + "\t");
		System.out.print(Student.engTotal + "\t");
		System.out.print(Student.mathTotal + "\t");
		
		
	}
}
