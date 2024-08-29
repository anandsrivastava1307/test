package Day14;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        driver.get("https://www.jrecommerce.com/features.php#features");
		driver.manage().window().maximize();
		
		//1) capture full page screenshot
		/*TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshot\\fullpage.png");
		sourcefile.renameTo(targetfile);  //copy sourcefile to target file
		*/
		
		//2) capture the screenshot of specific section
		/*WebElement featuredProducts = driver.findElement(By.xpath("//body/div[@class='page-wrapper']/section[@id='features']/div[@class='auto-container']/div[@class='services']/div[@class='row clearfix']/div[2]/div[1]"));
		File sourcefile = featuredProducts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshot\\featuredProducts.png");
		sourcefile.renameTo(targetfile);  //copy sourcefile to target file
		*/
		
		//3)capture the screenshot of webelement
		WebElement logo = driver.findElement(By.xpath("//img[@id='thm-logo']"));
	    File sourcefile = logo.getScreenshotAs(OutputType.FILE);
	    File targetfile = new File(System.getProperty("user.dir")+"\\screenshot\\logo.png");
		sourcefile.renameTo(targetfile);  //copy sourcefile to target file
		
		driver.quit();

		
		driver.quit();
		


		

	}

}
