package Day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import dev.failsafe.internal.util.Assert;

public class HandleFrames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		//Frame1
		
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);  //passed frame as a webelement   //Switch to frame1
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent();  //go back to page
		
		//Frame2
		WebElement frame2 = driver.findElement((By.xpath("//frame[@src='frame_2.html']")));
		driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
        
        driver.switchTo().defaultContent();   //go back to page
        
        //Frame3
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java");
        
        
        //inner iframe - part of frame3
        driver.switchTo().frame(0);   //switching to frame using index
        driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
        
        driver.switchTo().defaultContent();
        
        //Frame5
        WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
        driver.switchTo().frame(frame5);
        driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();
        boolean logoPresent = driver.findElement(By.xpath("//img[@alt='UI Vision by a9t9 software - Image-Driven Automation']")).isDisplayed();
        if(logoPresent==true) {
        	System.out.println("Logo is Present");
        }
        	else {
        		System.out.println("Logo is not Present");
        	}
        }
}

