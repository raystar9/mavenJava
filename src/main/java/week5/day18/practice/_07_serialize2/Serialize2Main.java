package week5.day18.practice._07_serialize2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.StringTokenizer;

class Serialize2Main {

	static final String resourceAddress = "src/main/resources/";
	
	public static void main(String[] args) {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(resourceAddress + "output9"));
				ObjectInputStream in = new ObjectInputStream(new FileInputStream(resourceAddress + "output9"))) {
			out.writeObject(new StringTokenizer("a|b|c", "|"));
			System.out.println(in.readObject());
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
