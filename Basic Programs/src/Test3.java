import java.io.File;
import java.io.IOException;
public class Test3 
{
	public static void main(String[] args) throws IOException {
		File f=new File("online.txt");
		f.createNewFile();
		System.out.println(f.createNewFile());
	}
}
