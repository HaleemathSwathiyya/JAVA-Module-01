package ioserialization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFrontFileToConsole {

	public static void main(String[] args) throws IOException{
		
        FileReader reader = new FileReader("D:\\ustcore\\ioserialization\\src\\ioserialization\\KeyBoardToFile.java");
		BufferedReader buffer = new BufferedReader(reader);
		
		String data = buffer.readLine();
		while(data != null) {
			System.out.println(data);
			data = buffer.readLine();
//			 data = buffer.readLine();
		}
		
		reader.close();
		buffer.close();
	}

}
