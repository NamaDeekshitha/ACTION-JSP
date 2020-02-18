
interface MyFunctionalInterface1
{
	public String sayHello(String x);
}
public class Test10 {
	public static void main(String args[]) 
	{
		MyFunctionalInterface1 msg = (str)->
		{
			return str;
		};
		System.out.println(msg.sayHello("deekshitha"));
	}

}
