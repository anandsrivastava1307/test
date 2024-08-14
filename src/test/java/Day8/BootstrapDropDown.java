package Day8;

public class BootstrapDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();  //open dropdown option
		
		//1)select single option
		//driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//2)capture all the options and find out size
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("Number of options:" +options.size());   //14
		
		//3)printing options from dropdown
		/*for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		*/
		//4) select multiple options
		
		for(WebElement op:options)
		{
			String option = op.getText();
			if(option.equals("Java") || option.equals("Python") || option.equals("MySQL")) 
			{
			  op.click();	
			}
		}


	}

}
