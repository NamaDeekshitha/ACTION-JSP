import java.util.*;
public class Ball extends Thread 
{
	public void run()
	{
		while(true)
		{
			try {
				System.out.println("have a nice day");
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				break;
			}
			
		}
	}
	public static void main(String args[])
	{
		Ball b=new Ball();
		b.start();
		Scanner scan=new Scanner(System.in);
		String s= scan.nextLine();
		if(s!=null) b.interrupt();
	}

}

