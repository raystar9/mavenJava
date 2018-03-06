package week5.day19.practice._06_serializationTransient;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class TransientMain {

	public static void main(String[] args) {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/resources/output3.dat"))){
			BBSItem obj = new BBSItem("Choi", "sunshine", "Meet", "How about this weekend?");
			/*System.out.println("Total number of post : "+ BBSItem.getItemNum());
			System.out.println("Writer : "+ obj.getWriter());
			System.out.println("Password : "+ obj.getPassword());
			System.out.println("Title : "+ obj.getTitle());
			System.out.println("Content : "+ obj.getContent());*/
			out.writeObject(obj);
			System.out.println("Successfully write.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/resources/output3.dat"))){
			BBSItem obj = (BBSItem) in.readObject();
			
			System.out.println("Total number of post : "+ BBSItem.getItemNum());
			System.out.println("Writer : "+ obj.getWriter());
			System.out.println("Password : "+ obj.getPassword());
			System.out.println("Title : "+ obj.getTitle());
			System.out.println("Content : "+ obj.getContent());
			System.out.println();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
