package week5.day18.practice._08_buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class BufferInMain {

	static final String resourceAddress = "src/main/resources/";
	
	public static void main(String[] args) {

		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(resourceAddress + "output1"), 5)){
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
