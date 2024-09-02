package Day16.pack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {

	@Test
	void abc()
	{
		System.out.println("This is abc from c1..");
	}
	
	@BeforeTest
	void at()
	{
		System.out.println("This is BeforeTest method..");
	}
}
