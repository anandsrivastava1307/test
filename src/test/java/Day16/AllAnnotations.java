package Day16;

import org.testng.annotations.*;

public class AllAnnotations {
	
	@BeforeSuite
	void bs()
	{
		System.out.println("This is BeforeSuite..." );
	}

	@AfterSuite
	void as()
	{
		System.out.println("This AfterSuite..");
	}
	
	@BeforeTest
	void bt()
	{
		System.out.println("This is BeforeTest Method..");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("This is AfterTest Method..");
	}
	
	@BeforeClass
	void bc()
	{
		System.out.println("This is BeforeClass Method..");
	}
	
	@AfterClass
	void ac()
	{
		System.out.println("This is AfterClass Method..");
	}
	
	@BeforeMethod
	void bm()
	{
		System.out.println("This is BeforeMethod..");
	}
	
	@AfterMethod
	void am()
	{
		System.out.println("This is AfterMethod..");
	}
	
	@Test
	void tm1()
	{
	    System.out.println("This is Test Method1..");	
	}
	
	@Test
	void tm2()
	{
		System.out.println("This is Test Method2..");
	}
}
