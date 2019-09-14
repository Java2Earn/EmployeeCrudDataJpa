package File.Io;

import java.io.File;
import java.io.IOException;

public class FileEx1 
{
public static void main(String[] args) throws IOException {
	File f=new File("welcome1.txt");
	System.out.println(f.createNewFile());
	
}
}
