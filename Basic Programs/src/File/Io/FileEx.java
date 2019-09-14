package File.Io;

import java.io.File;
import java.io.IOException;

class FileEx
{
public static void main(String []args) throws IOException
{

	File f=new File("capgemini");
	f.mkdir();
	System.out.println("folder created");
	
	
}
}