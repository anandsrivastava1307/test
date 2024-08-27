package Day11;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {
	
	//user defined method for converting month from string----->Month 
	static Month covertMonth(String month) {
		HashMap<String, Month> monthMap = new HashMap<String, Month>();
		
		monthMap.put("January", Month.JANUARY);
		monthMap.put("February", Month.FEBRUARY);
		monthMap.put("March", Month.MARCH);
		monthMap.put("April", Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("June", Month.JUNE);
		monthMap.put("July", Month.JULY);
		monthMap.put("August", Month.AUGUST);
		monthMap.put("September", Month.SEPTEMBER);
		monthMap.put("October", Month.OCTOBER);
		monthMap.put("November", Month.NOVEMBER);
		monthMap.put("December", Month.DECEMBER);

        Month vmonth = monthMap.get(month);
        if (vmonth == null) {
        	System.out.println("Invalid Month...");
        }
        return vmonth;

	}

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//input DOB
		String requiredYear = "2021";
		String requiredMonth = "June";
		String requiredDate = "15";
		
		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.xpath("//span[@class=\'icon_calendar\']")).click();
		
		//select year
		WebElement yearDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selectYear = new Select(yearDropDown);
		selectYear.selectByVisibleText(requiredYear);
		
		//select month
		
		while(true)
		{
		String displayMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		//convert requiredMonth & displayMonth in to Month objects
		Month expectedMonth = convertMonth(requiredMonth);
		Month currentMonth = convertMonth(displayMonth);
		
		
		//compare
		int result = expectedMonth.compareTo(currentMonth);
		
		

	}
	}
}
