package week5.day19.practice._03_fileClass;

import java.io.File;
import java.io.IOException;

class CreateDirectory {

	public static void main(String[] args) {
		File file = new File("src/main/resources/dir");
		if (!file.exists()) {
			System.out.println("create new directory : " + file.getPath());
			file.mkdir();
		} else {
			System.out.println("directory is already exists : " + file.getPath());
		}
		
		File file2 = new File(file + "/newFile.txt");

		if (!file2.exists()) {
			try {
				file2.createNewFile();
				System.out.println("create new file : " + file2.getPath());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("file is already exists : " + file2.getPath());
		}
		
		/*
		if(file2.exists()) {
			file2.delete();
			System.out.println("file deleted");
		} else {
			System.out.println("file is not exists");
		}*/
		
		if(file.exists()) {
			if(file.delete()) {
				System.out.println("deleted.");
			} else {
				System.out.println("is not deleted");
			}
		} else {
			System.out.println("file is not exists");
		}
		
	}

}
