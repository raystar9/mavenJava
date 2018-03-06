package week5.day19.practice._03_fileClass;

import java.io.File;

class FileClassMain {

	public static void main(String[] args) {
		File file = new File("src/main/resources/");
		File[] arr = file.listFiles();
		String name;
		long time;
		System.out.printf("%-25s%s\t%s\n", "[name]", "[size]","[Last modified time]");
		for(int i = 0; i < arr.length; i++) {
			name = arr[i].getName();

			System.out.printf("%-25s",name);
			if(arr[i].isFile()) {
				System.out.print(arr[i].length() + "\t");
			}
			else {
				System.out.print("<DIR>\t");
			}
			time = arr[i].lastModified();
			System.out.printf("%1$tF %1$tT",time);
			System.out.println();
		}
	}

}
