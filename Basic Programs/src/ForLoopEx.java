public class ForLoopEx 
{
	public static void main(String[] args) 
	{
		//Print an array  using for loop
		int a[]={1,2,3,4,5};
		for(int i=0;a.length>i;i++)
		{
			System.out.println(a[i]);
		}
		//Print an array in reverse using for loop
		System.out.println("IN REVERSE ORDER");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		//Print an array in reverse using for each loop
		//for each element of a collections do the following code block.
		int a1[]=new int[]{1,2,3,4,5};
		for(int print:a1)
		{
			System.out.println(print);
		}
	}
}
