import java.util.Scanner;
public class Dog 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=Cat.getMiddleChars(s);
		System.out.println(s1);
	}
	

}
class Cat
{
	public static String getMiddleChars(String str)
	{
		StringBuffer sb=new StringBuffer();
		if(str.length()%2==0)
		{
			sb.append(str.substring((str.length()/2)-1,(str.length()/2)+1));
		}
		return sb.toString();
		
	}
}
