class TwoStrings
{
	synchronized 
	static void print(String str1,String str2)
	{
		System.out.println(str1);
		try
		{
			Thread.sleep(500);
		}
		catch(Exception ie)
		{
			
		}
		System.out.println(str2);
	}
}
class PrintStringsThread implements Runnable
{
	Thread th;
	String str1,str2;
	PrintStringsThread(String str1,String str2)
	{
		this.str1=str1;
		this.str2=str2;
		th=new Thread(this);
		th.start();
	}
	public void run()
	{
		TwoStrings.print(str1, str2);
	}
}
public class TestThread 
{
	public static void main(String args[])
	{
		new PrintStringsThread("Hello","there");
		new PrintStringsThread("how are","you");
		new PrintStringsThread("Thank you","very much");
		
	
	}

}
