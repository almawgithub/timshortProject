package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadFromCsvFile {

	
	
	public static List<String[]> readDataFromFile(String file){
		
	
		
		List<String[]> stArray=new ArrayList<>();
		
	//	{
			String line;
			try {
				FileReader fr=new FileReader(file);
				BufferedReader br=new BufferedReader(fr);
				 
				//line=br.readLine();
				
				
				while((line=br.readLine())!=null) {
					String[] arrayOfString=line.split(",");
					stArray.add(arrayOfString);
				}
				br.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("File not found");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Couldn't read file");
			}
		
		
	//	}
		
		return stArray;
		
		// TODO Auto-generated method stub

	}

}
