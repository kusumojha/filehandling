package pkg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.FieldPosition;
import java.util.Scanner;

public class WriteLineOfRange
{
  public void writeline(int line) throws IOException
  {
	  for(int i=0;i<line;i++)
	  {
		 File f=new File("C:\\Users\\admin\\Desktop\\file5.txt");
		 FileWriter fw=new FileWriter(f,true);
		 BufferedWriter bw=new BufferedWriter(fw);
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter text");
		 String a=s.nextLine();
		 bw.write(a);
		 bw.newLine();
		 bw.close();
		//System.out.println(a);
		 
	  }
	  
  }
  
  public static void main(String[] args) throws IOException
  {
	  WriteLineOfRange obj=new WriteLineOfRange();
	  obj.writeline(3);
	  
}
}
