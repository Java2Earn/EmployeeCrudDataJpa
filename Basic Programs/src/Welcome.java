public class Welcome
{
	int eid;
	String userid;
	String password;
	void m1()
	{
		System.out.println(userid+" "+eid);
	}
	public static void main(String[] args)
	{
	Welcome w=new Welcome();
	w.m1();
	}
}
