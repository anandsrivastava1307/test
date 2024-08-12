package Day5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> WindowIDs = driver.getWindowHandles();
		
		//Approach1
		/*List<String> windowList = new ArrayList(windowIDs);
		
		String parentID = windowList.get(0);
		String childID = windowList.get(1);
		
		System.out.println(driver.getTitle());
		
		//switch to child window
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		//switch to parent window
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
        */
		
		//Approach2
		for(String winID:WindowIDs)
		{
			String title = driver.switchTo().window(winID).getTitle();
			
			if(title.equals("OrangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
			}
			else
			{
				System.out.println(driver.getCurrentUrl());
			}
		}
	}

}
