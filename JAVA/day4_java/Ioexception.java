package java_day4;

import java.io.*;

class Ioexception {
public static void main(String[]args)
{
	String line;
	
	try(BufferedReader br=new BufferedReader(new FileReader("test.txt")))
			{
			while((line=br.readLine())!=null)
			{
				System.out.println("line==>"+line);
				
			}
			}
catch(IOException e)
{
	System.out.println("IOException  in try block==>"+e.getMessage());
	
}
}

}