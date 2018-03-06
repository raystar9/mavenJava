package week5.day19.practice._04_serializationError;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class SerializationErrorMain {

	public static void main(String[] args) {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/resources/outputG.dat"))) {
			out.writeObject(new GoodsStock("70707", 100));
			out.writeObject(new GoodsStock("70708", 50));
			out.writeObject(new GoodsStock("70709", 100));
			System.out.println("file exported");
		} catch (IOException e) {
			System.out.println("cannot export to file");
			e.printStackTrace();
		}

	}

}
