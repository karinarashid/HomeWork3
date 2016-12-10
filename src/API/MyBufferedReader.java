package API;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReader {

	public static void main(String[] args){
		FileReader fr = null;
		BufferedReader br = null;
		String path1 = "C:/Users/Karina/Documents/file01.txt";
		String path2 = "C:\\Users\\Karina\\Documents\\file01.txt";
		
		try {
			 fr = new FileReader(path1);
			} catch (FileNotFoundException e) {	
			e.printStackTrace();
			
		}
		finally{
		
		//File-reader is sub-class of Reader class
		//BufferedReader can take Sub-Class Of Reader-class
		//Reader-class has few Sub-class..those are File-Reader, BufferedReader
		
			
		
		br = new BufferedReader (fr);
		String text = "";
		try {
			while ((text = br.readLine())!=null){
			System.out.println(text);
			}
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	}
}

