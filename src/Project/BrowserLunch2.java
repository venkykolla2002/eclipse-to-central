package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLunch2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\Project\\WebDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https:rbgtechnologies.com");
		

	}

}
