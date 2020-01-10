package pkg;
//READ DATA FRON FILE1 AND WRITE IT IN FILE2
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class readFromFile1andWriteInFile2 
{
	public static void main(String[] args) throws IOException
	{ 
		File f1=new File("C:\\Users\\admin\\Desktop\\file1.txt");// TO READ DATA FROM FILE1
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		
		File f2=new File("C:\\Users\\admin\\Desktop\\file2.txt");//CREATE FILE TO WRITE IN FILE2
		FileWriter fw=new FileWriter(f2);
		BufferedWriter bw=new BufferedWriter(fw);
		
		String s;
		while((s=br.readLine())!=null)
		{
			bw.write(s);
			bw.newLine();
		}
			
		br.close();
		bw.close();
		
		
	}

}
