import java.util.StringTokenizer;


public class StringTokenizerEx1 {

	public static void main(String[] args) {
		String s="10/08/1993";
		StringTokenizer string=new StringTokenizer(s,"/");
		while(string.hasMoreElements())
		{
			System.out.println(string.nextToken());
		}
	}

}
