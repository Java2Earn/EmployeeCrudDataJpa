import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class Deserialization 
{
public static void main(String[] args) throws Exception{
	
FileInputStream fis = new FileInputStream("capgemini1.txt");
ObjectInputStream ois = new ObjectInputStream(fis);
Student st=(Student) ois.readObject();
System.out.println(st.getSno());
System.out.println(st.getName());
System.out.println(st.getAddr());
}
}
