package Day14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestsIncognitoMode {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.jrecommerce.com/features.php#features");
		
		String act_title = driver.getTitle();
		
		if(act_title.equals("Must have features for a Multi vendor ecommerce website - Aug 2024"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test failed");
		}
	}

	}

