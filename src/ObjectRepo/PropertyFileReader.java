

package ObjectRepo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyFileReader 
{
	static WebDriver driver;
	public static void main(String[] args) throws Throwable
	{
		FileInputStream file= new FileInputStream("C:\\Users\\Dell\\Desktop\\eclipse\\Venkatesh\\Venkatesh\\src\\ObjectRepo\\dotproprites");
	   Properties properties= new Properties();
	   properties.load(file);
	   String value = properties.getProperty("browser");
	   System.out.println(value);
	   String value1 = properties.getProperty("url");
	   System.out.println(value1);
	   String value2 = properties.getProperty("whoisthegoodboy");
	   System.out.println(value2);
	   if(value.equals("chrome"))
	   {
		   driver = new ChromeDriver();
	   }
	   else if(value.equals("edge"))
	   {
		   driver = new EdgeDriver();
		   
	   }
	   else if(value.equals("Firefox"))
	   {
		   driver = new FirefoxDriver();
	   }
	}
	
}
