package com.edureka.file_operations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
		try{
		FileReader fr;
		fr= new FileReader("Sample1.txt");
		BufferedReader br = new BufferedReader(fr);
		//for(char c : in){         //for loop is used for arrays. two parts , right: name of collection/array u want to traverse. left: each element of the type.
		String data=null;
		do{
		data = br.readLine();
		System.out.println(data);
		}while(data!=null);
		}
		catch(IOException e){
			e.printStackTrace();
		}

	}

}
