import java.util.*;
public class Seven 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList <Integer> al1=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<Integer>();
		ArrayList<Integer> ans=new ArrayList<Integer>();
		for(int i=0;i<5;i++)
			al1.add(sc.nextInt());
		for(int j=0;j<51;j++)
			al2.add(sc.nextInt());
		ans=answer(al1,al2);
		for(int k=0;k<3;k++)
			System.out.println(ans.get(k));
	}

    
	public static ArrayList <Integer> answer(ArrayList<Integer> al1,ArrayList<Integer> al2)
	{
		al1.addAll(al2);
		Collections.sort(al1);
		ArrayList<Integer> ans=new ArrayList<Integer>();
		
		ans.add(al1.get(2));
		ans.add(al1.get(4));
		ans.add(al1.get(6));
		return ans;
	}
}
	

