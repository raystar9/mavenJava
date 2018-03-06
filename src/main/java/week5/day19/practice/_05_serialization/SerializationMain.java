package week5.day19.practice._05_serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class SerializationMain {

	public static void main(String[] args) {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/resources/outputG.dat"))) {
			out.writeObject(new GoodsStock("70707", 100));
			out.writeObject(new GoodsStock("70708", 50));
			out.writeObject(new GoodsStock("70709", 200));
			System.out.println("file exported");
		} catch (IOException e) {
			System.out.println("cannot export to file");
			e.printStackTrace();
		}

		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/resources/outputG.dat"))) {
			try {
				while(true) {
					GoodsStock gs = (GoodsStock) in.readObject();
					System.out.println(gs);
				}

			} catch(EOFException e) {}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}

}
