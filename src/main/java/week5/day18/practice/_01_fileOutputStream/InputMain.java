package week5.day18.practice._01_fileOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class InputMain {

	static final String resourceAddress = "src/main/resources/";
	
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Input a data in the Arguments");
			return;
		}
		FileInputStream in = null;

		try {
			in = new FileInputStream(resourceAddress + args[0]);
			byte[] arr = new byte[20];
			while(true) {
				int num = in.read(arr);
				if(num < 0) {
					break;
				}
				System.out.println("Hexademical : ");
				for(int i = 0; i < arr.length; i++) {
					System.out.printf("%02X ", arr[i]);
				}
				System.out.println();
				System.out.println("Decimal : ");
				for(int i = 0; i < arr.length; i++) {
					System.out.printf("%02d ", arr[i]);
				}
				System.out.println();
				System.out.println("Octal : ");
				for(int i = 0; i < arr.length; i++) {
					System.out.printf("%02o ", arr[i]);
				}
				System.out.println();
				break;
			}
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find file.");
		}
		catch (IOException e) {
			System.out.println("IO exception Occurred");
		} finally {
			try {
				if(in != null) {
					in.close();					
				}
			} catch (IOException e) {
				System.out.println("Error occured on closing file");
			}
		}
	}

}
