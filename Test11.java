import java.util.*;
public class Test11 {
	public static void main(String args[])
	{
		List<String> list=new ArrayList<String>();
		list.add("rick");
		list.add("Negan");
		list.add("Daryl");
		list.add("carl");
		//list.forEach(
				//(names)->{System.out.println(names);}
				//);
		/*list
		.stream()
		.filter(s -> s.startsWith("C"))
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);*/
		Stream.of("a1","a2","a3")
		.findFirst()
		.ifPresent(System.out::println);
		Arrays.stream(new int[] {1,2,3})
		.flatMap(n ->*n+1)
		.average()
		.ifPresent(System.out.println);
	}

}
