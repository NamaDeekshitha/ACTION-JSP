import java.io.*;
public class Test6 {
	public static void main(String args[])throws Exception
	{
		String s="pw2.java";
		String s1="pw1.txt";
		int i;
		FileInputStream fis=new FileInputStream(s1);
		FileOutputStream bw=new FileOutputStream(s,false);
		fis.skip(2);
		while((i=fis.read())!=-1)
		{
			bw.flush();
			bw.write(i);
		}
		bw.close();fis.close();
		
	}
	

}
