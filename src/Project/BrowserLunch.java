package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLunch {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\eclipse\\Venkatesh\\Venkatesh\\src\\Project\\WebDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https:rbgtechnologies.com");
		

	}

}
