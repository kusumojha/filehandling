package pkg;
//WRITE IN .TXT FILE BY FILE HANDLING
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writefile
{ 
	public static void main(String[] args) throws IOException 
	{ 
	File f=new File("C:\\Users\\admin\\Desktop\\file2.txt");//connection and create file
	FileWriter fw=new FileWriter(f);
	BufferedWriter bw=new BufferedWriter(fw);//moving cursor
	bw.write("first line");//write data
	bw.newLine();//moving to next line
	bw.write("second line");
	bw.close();//saving and closing
	
		
	}

}
  