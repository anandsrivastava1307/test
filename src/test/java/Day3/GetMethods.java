package Day3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//getTitle()  - returns title of the page
		System.out.println(driver.getTitle());
		
		//getCurrentUrl() - returns URL of the page
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource - returns source code of the page
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle() - returns ID of the single Browser window
		String windowid = driver.getWindowHandle();
		System.out.println("Window ID :"+windowid); //Window ID :CB94EB1B884B5191D6A7297D0E9D9E83
                                                    //Window ID :E2AAF50DBE499DE16052513474459C57

		
		//getWindowHandles() - returns ID's of the multiple browser window
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowids = driver.getWindowHandles();
		System.out.println(windowids);
	}
}
