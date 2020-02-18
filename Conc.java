import java.util.Scanner;
public class Conc {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		String s1=s.nextLine();
		String s2=s.nextLine();
		if(s1.length()==s2.length())
		{
		System.out.println(s1.concat(s2));
	    }
		else if(s1.length()>s2.length())
		{
			sb.append(s1.substring(s1.length()-s2.length(),s1.length())).append(s2);
			
		}
		else if(s2.length()>s1.length()) 
		{
			sb.append(s1).append(s2.substring(s2.length()-s1.length(),s2.length()));
		}
			
		System.out.println(sb);
		
		

}
}
