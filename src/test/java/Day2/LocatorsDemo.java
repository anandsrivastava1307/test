package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
     WebDriver driver = new ChromeDriver();
     
     driver.get("https://www.flipkart.com/");
     driver.manage().window().maximize();
     driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Infinix");
     driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']//*[name()='svg']")).click();
     
     
	}

}
