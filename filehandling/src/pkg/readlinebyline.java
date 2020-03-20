package pkg;
//READ DATA LINE BY LINE
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class readlinebyline
{
public static void main(String[] args) throws IOException 
{
 File f=new File("C:\\Users\\admin\\Desktop\\myfile.txt");
 FileReader fr=new FileReader(f);
 BufferedReader br=new BufferedReader(fr);
 String a;
 while((a=br.readLine())!=null)
		 {
	       System.out.println(a);
		 }
}
}
