package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollinPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//1) scroll down page by pixel number
		//js.executeScript("window.scrollBy(0,1500)", "");
		//System.out.println(js.executeScript("return window.pageYoffset;"));
		
		//2)scroll the page till element is visible
		/*WebElement ele = driver.findElement(By.xpath("//h2[normalize-space()='Compensation']"));
		js.executeScript("window.scrollIntoView();", ele);
		System.out.println(js.executeScript("return window.pageYoffset;"));
         */
		
		//3)scroll page till end the pge
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYoffset;"));
		
		Thread.sleep(5000);
		
		//4)scrolling up to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

}
