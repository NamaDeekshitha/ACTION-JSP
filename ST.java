
public class ST {
	public static void main(String args[])
	{
		String name1="T"
				+ "he quick brown fox jumps over the lazy dog";
		String name2="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		System.out.println(name1.charAt(12));
		System.out.println(name1.contains("is"));
		System.out.println(name1.concat("and killed"));
		System.out.println(name1.length());
		System.out.println(name1.equals(name1));
		System.out.println(name1.replace("the","A"));
		System.out.println(name1.endsWith("dogs"));
		System.out.println(name1.indexOf('a'));
		System.out.println(name1.lastIndexOf('e'));
		System.out.println(name1.toUpperCase());
		System.out.println(name1.toLowerCase());
		System.out.println(name1.equals(name2));
		
	}

}
