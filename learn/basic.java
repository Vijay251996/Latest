package learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basic {
	public static WebDriver driver;
	
    @Test
	public void basics()
	{
    	WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String actual=driver.getTitle();
		String expected="vijay";
		Assert.assertTrue(false);
		}
}
