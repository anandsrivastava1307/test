package Day8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]")).click();
		
		//click on PIM
		driver.findElement(By.xpath("//span[normalize-space()=\"PIM\"]")).click();
		
		//click on dropdown
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")).click();
        Thread.sleep(5000);
		
		//click on single option by using debugger
		//driver.findElement(By.xpath("//span[normalize-space()=\"Automaton Tester\"]")).click();
		
		//count number of options
		List<WebElement> options = driver.findElements(By.xpath("//div[@role=\"listbox\"]//span"));
		System.out.println("Number of options:" +options.size());  //29
		
		//Printing options
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}

	}

}
