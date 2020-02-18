
public interface TeachingStaff {
	void teach();

}
public class Course implements TeachingStaff
{
	public void teach()
	{
		System.out.println("teaching course");
	}
}
