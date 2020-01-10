package pkg;
//Read lines between range
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class readLineOfRange
{
   public void readofperticularrange(int line1,int line2) throws IOException
   {
	   File f=new File("C:\\Users\\admin\\Desktop\\file1.txt");
	   FileReader fr=new FileReader(f);
	   BufferedReader br=new BufferedReader(fr);
	   String data;
	   int v=0;
	   while((data=br.readLine())!=null)
		{
			v=v+1;
			if((v>=line1)&(v<=line2))
			{
				System.out.println(data);
				
			}
		}
	 }
   
   public static void main(String[] args) throws IOException 
   {
	   readLineOfRange r=new readLineOfRange();
		Scanner s=new Scanner(System.in);
		System.out.println("enter range you want to read");
		int l=s.nextInt();
		int l1=s.nextInt();
		r.readofperticularrange(l,l1);
		
   }
 }

