package com.edureka.file_operations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		try{
			File sample= new File("Sample1.txt");
			boolean test = sample.createNewFile();
			//write(test);
			System.out.println(test);
			System.out.println(sample.exists());
			FileWriter fw = new FileWriter(sample);
			fw.write("How old are you.\nAre you married\n");
			fw.flush(); // flush before closing
			fw.close(); // close when file is done
		}
		
		catch(IOException e){
			e.printStackTrace();
		}

	}

}
