package com.smoothstack.weekOneProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class UserInput {
	
	public static void main(String[] args) {
		try(BufferedReader bufStream = new BufferedReader(new FileReader("./resources/inputFiles/authors.txt"))){
			// resources/inputfiles/inputFile.txt - relative path
			//C:\GCIT\Training\Inclass code\SS April 2020 - absolute path
			String line = bufStream.readLine();
			System.out.println(line);
//			while(line!=null){
//				Author author = new Author(1, "Test");
//				author.setAuthorId(Integer.parseInt(line.substring(0, line.indexOf("\t"))));
//				author.setAuthorName(line.substring(line.indexOf("\t")+1, line.length()));
//				System.out.println("Author ID: "+author.getAuthorId()+" & Author Name:" +author.getAuthorName());
//				line = bufStream.readLine();
			}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to read from File");
		
		}
	}
}