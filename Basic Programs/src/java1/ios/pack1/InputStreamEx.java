package java1.ios.pack1;
import java.io.FileInputStream;
import java.io.IOException;
public class InputStreamEx 
{
	public static void main(String[] args) throws IOException
	{
	FileInputStream fi=new FileInputStream("hello.jpg");
	int i;
	while((i=fi.read())!=1)
	{
		System.out.println(i);	
		System.out.println((char)i);
	}
	}
}
