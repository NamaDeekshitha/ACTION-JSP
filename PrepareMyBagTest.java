import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
public class PrepareMyBagTest {
	FirstDayAtSchool school;
	String[]bag= {"Books","Notebooks","Pens"};
	@Before
	public void setUp()throws Exception
	{
		System.out.println("Initializing");
		school=new FirstDayAtSchool(); 
	}
	@Test
	public void testPrepareMyBag()
	{
		System.out.println("Inside testPrepareMyBag()");
		assertArrayEquals(bag,school.prepareMyBag());
	}
	@Test
	void testCheckMyName()
	{
		System.out.println("Inside test check name()");
		school.checkmyName("deekshi");
		assertTrue(school.res);
	}

}
