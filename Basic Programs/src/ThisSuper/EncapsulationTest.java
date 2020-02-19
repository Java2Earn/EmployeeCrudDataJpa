package ThisSuper;

public class EncapsulationTest {
public static void main(String[] args) {
	Employee emp=new Employee();
	emp.setEmpid(1);
	emp.setEname("sandeep");
	emp.setAtmpin(1234);
	
	System.out.println(emp.getEmpid()+"  "+emp.getEname());
	
}
}
