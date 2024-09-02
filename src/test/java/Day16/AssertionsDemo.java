package Day16;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
	
	@Test
	void testTitle()
	{
		String exp_title = "Opencart";
		String act_title = "Openshop";
		
		/*if(exp_title.equals(act_title))
		{
			System.out.println("Test Paseed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		*/
		                 
		//Assert.assertEquals(exp_title, act_title);
		                 //OR
		if(exp_title.equals(act_title))
		{
			System.out.println("Test Paseed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Test Failed");
			Assert.assertTrue(false);
		}
	}

}
