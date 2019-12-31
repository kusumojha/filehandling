package pkg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writedata 
{
	public static void main(String[] args) throws IOException 
	{
	   File f=new File("C:\\Users\\admin\\Desktop\\myfile2"); //this will create new file name myfile2 on desktop
	   FileWriter fw=new FileWriter(f);
	   BufferedWriter bw=new BufferedWriter(fw);//for moving cursor
	   bw.write("my first line");//write data
	   bw.newLine();//moving to next line
	   bw.write("my second line");
	   bw.close();//for saving and closing
	   
	}

}
