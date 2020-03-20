package pkg;
//READ FILE OF .TXT FORMAT 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class read
{
  public static void main(String[] args) throws IOException 
  {
	  File f=new File("C:\\Users\\admin\\Desktop\\myfile.txt");
	  FileReader fr=new FileReader(f);
	  int a;
	  while((a=fr.read())!=-1)
	  {
		  System.out.println((char)a);
		  
	  }
	  
	
}
}
