import java.util.Scanner;
public class Col 
{
public static void main(String args[])
  {
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	boolean b=colorcodeValidation(s1);
  }
public static boolean colorcodeValidation(String s1)
{
	boolean b=false,b1=false;
	String s2=s1.substring(1,s1.length())
			if(s1.length()==7)
				if(s1.charAt(0)=='#')
					b1=true;
	if(b1==true)
		for(int i=0;i<s2.length();i++)
		{
			char c=s2.charAt(i);
			if(c!='#')
			{
				if(s2.matches("[A-F]{1,}")||s2.matches("[0-9]{1,}"))
					b=true;
				else
				{
					b=false;
					break;
				}
			}
			
		}
	return b;
}
}