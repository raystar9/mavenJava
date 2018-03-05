package week5.day18.practice._06_serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

class SerializeOutputMain {

	static final String resourceAddress = "src/main/resources/";
	
	public static void main(String[] args) {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(resourceAddress + "output5.dat"))){
			out.writeObject(new GregorianCalendar(2018, 2, 5));
			out.writeObject(new GregorianCalendar(2018, 2, 6));
			out.writeObject(new GregorianCalendar(2018, 2, 7));
		}catch(Exception e) {
			System.out.println("Cannot export.");
		}
		
		

	}

}
