import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable {
// Exception in thread "main" java.io.NotSerializableException: io.Student
private  int sno;
private String name;
transient private  String addr;

public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
}
public class Serialization 
{
public static void main(String[] args) throws Exception
{
Student student = new Student();
student.setSno(1011);
student.setName("sandeep");
student.setAddr("hyderabad");
FileOutputStream fos = new FileOutputStream("capgemini1.txt");
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(student);
System.out.println("success");
}
}