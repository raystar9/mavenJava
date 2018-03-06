package week5.day19.practice._07_serialiVersion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class VersionMain {

	public static void main(String[] args) {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/resources/output4.dat"))){
			
			Rectangle obj = new Rectangle(100, 200);
			out.writeObject(obj);
			System.out.println("Successfully write to file.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/resources/output4.dat"))){
			Rectangle rect = (Rectangle)in.readObject();
			System.out.println(rect);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
