
public class Employee1 
{
private int eid;
private String ename;
private  String address;

@Override
	public String toString() {
		
		return eid+"  "+ename+" "+address;
	}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public static void main(String[] args) {
	Employee1 e=new Employee1();
	e.setEid(124);
	e.setEname("asdas");
	e.setAddress("hyd");
	System.out.println(e.toString());
	System.out.println(e.hashCode());
	
	//hashcode of memory address in hexdecimal format
		//classname@hashcode in hexadecimal format
}
}





