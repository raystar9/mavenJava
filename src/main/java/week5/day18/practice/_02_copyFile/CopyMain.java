package week5.day18.practice._02_copyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class CopyMain {

static final String resourceAddress = "src/main/resources/";
	
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("first arg : Original file name, second arg : Target file name");
			return;
		}
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream(resourceAddress + args[0]);
			out = new FileOutputStream(resourceAddress + args[1]);
			byte[] arr = new byte[128];
			
			while(in.read(arr) != -1) {
				out.write(arr);
			}
			System.out.println("Copy end.");
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find file.");
		}
		catch (IOException e) {
			System.out.println("IO exception Occurred.");
		} finally {
			try {
				if(in != null || out != null) {
					in.close();	
					out.close();
					System.out.println("Successfully closed.");
				}
			} catch (IOException e) {
				System.out.println("Error occured on closing file.");
			}
		}
	}
}
