package com.shimbhu.FileClass;

import java.io.File;
import java.io.IOException;

public class CreatingNewFile {

	public static void main(String[] args) throws IOException {
		
		File file = new File("x.txt");
		File file2 = new File("C://Users//kumaw//Desktop//RJ101//JavaRevision//JavaRevision//RevisionJava/y.txt");
		
		File file3 = new File("C://Users//kumaw//Desktop//RJ101//JavaRevision//JavaRevision//RevisionJava/Shimbhu");
		
		
		System.out.println(file);
		
		System.out.println(file.exists());
		
		file.createNewFile();
		
		System.out.println(file.exists());
		
        System.out.println(file2.exists());
		
		file2.createNewFile();
		
		System.out.println(file2.exists());
		
		System.out.println(file3.exists());
		
		file3.mkdir();
		
		System.out.println(file3.exists());
		
		
		
		
		
	}
}
