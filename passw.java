import java.util.*;
public class passw {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		int n=Validate.display(s1);
		if(n==1)
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("not valid");
		}
	}

}
class Validate 
{
	public static int display(String s1)
	{
	
	if(s1.matches("[0-9]{1,}")&& s1.matches("[@,#,$]{1,}")&& s1.length()>=6 && s1.length()<=20)
	{
		return 1;
	}
	else
	{
		return -1;
	}
	
}
}
