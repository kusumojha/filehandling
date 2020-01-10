package pkg;
//READ DATA FROM PERTICULAR LINE
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class readDataOfPerticularLine 
{ 
	public void readdataodline(int lineNo) throws IOException 
	{
		File f=new File("C:\\Users\\admin\\Desktop\\file1.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String data;
		int v=0;
		while((data=br.readLine())!=null)
		{
			v=v+1;
			if(v==lineNo)
			{
				System.out.println(data);
				break;
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException
	{
		readDataOfPerticularLine r=new readDataOfPerticularLine();
		Scanner s=new Scanner(System.in);
		System.out.println("enter line number you want to read");
		int l=s.nextInt();
		r.readdataodline(l);
		
		
	}

	

}

