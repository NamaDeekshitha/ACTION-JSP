import java.util.*;
public class HashSetDemo 
{
	public static void main(String args[])
	{
		Set hs=new HashSet();
		hs.add("Sandeep");
		hs.add("Tilaka");
		hs.add("Deepak");
		hs.add("Elan");
		hs.add("Chitra");
		hs.add("Tilaka");
		hs.add("Elan");
		hs.add(null);
		System.out.println(hs);
	}

}
