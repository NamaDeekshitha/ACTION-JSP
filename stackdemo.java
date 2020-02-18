import java.util.*;

public class stackdemo 
{
	public static void main(String args[])
	{
		Stack s=new Stack();
		s.push("Patrick Naughton");
		s.push("James Gosling");
		s.push("Mike Sheriden");
		s.push("Chris Wrath");
		s.push("Ed Frank");
		System.out.println("stack elements:"+s);
		System.out.println("First element:"+s.peek());
		System.out.println("stack elements:"+s);
		System.out.println("popping Out:"+s.pop());
		System.out.println("stack elements:"+s);
		s.push("java");
		System.out.println("after adding:"+s);
		System.out.println("popping Out:"+s.pop());
		System.out.println("stack elements:"+s);
		System.out.println("First Element:"+s.peek());
		Enumeration e=s.elements();
		System.out.println("elements are:");
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
	}

}
