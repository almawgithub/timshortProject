package File_Operation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filename="C:\\Users\\selam\\Desktop\\FileToRead.txt";
		String text="";
	                                  //1. Create file to read
		
		File file=new File(filename);
		
		
		
		try {
			
	                                   //2. Open the file to read
			
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			
	                                   //3. Read the file
			
			try {
				
				
				    String tx;
				   
				   while((tx=br.readLine())!=null)
					   text=text+tx+"\n";
				  
				   
				   						//4 Close the file
				   		br.close();
				
			} catch (IOException e) 
			   {
				// TODO Auto-generated catch block
				System.out.println("Couldn't read the file");
				//e.printStackTrace();
			   }
			
		    } catch (FileNotFoundException e)
		        {
			// TODO Auto-generated catch block
			System.out.println("File not found !!!!!");
			
			//e.printStackTrace();
		       }
		finally {
			System.out.println("Finished reading the file  :  "+filename);
		}
		
		
		System.out.println(text);
         
		
		
	}

}
