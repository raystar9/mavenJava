package week5.day18.practice._06_serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.GregorianCalendar;

class SerializeMain {

	static final String resourceAddress = "src/main/resources/";
	
	public static void main(String[] args) {
		try(ObjectInputStream out = new ObjectInputStream(new FileInputStream(resourceAddress + "output5.dat"))){
			GregorianCalendar cal1 = (GregorianCalendar) out.readObject();
			GregorianCalendar cal2 = (GregorianCalendar) out.readObject();
			GregorianCalendar cal3 = (GregorianCalendar) out.readObject();
			
			System.out.println(cal1.getTime());
			System.out.println(cal2.getTime());
			System.out.println(cal3.getTime());
		}catch(Exception e) {
			System.out.println("Cannot export.");
		}
		
		

	}

}
