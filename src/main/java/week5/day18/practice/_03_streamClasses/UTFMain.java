package week5.day18.practice._03_streamClasses;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class UTFMain {

	static final String resourceAddress = "src/main/resources/";
	
	public static void main(String[] args) {
		DataOutputStream out = null;
		try {
			out = new DataOutputStream(new FileOutputStream(resourceAddress + "output3.dat"));
			
			out.writeUTF("Helloooooooooooooooooo");
			System.out.println("output end");
		} catch (IOException e) {
			System.out.println("cannot output");
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		DataInputStream in = null;
		
		try {
			in = new DataInputStream(new FileInputStream(resourceAddress + "output3.dat"));
			while(true) {
				System.out.println(in.readUTF());
			}
		} catch (EOFException e) {
			System.out.println("end");
		} catch (Exception e) {
			System.out.println();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
