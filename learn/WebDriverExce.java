package learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverExce {
	public static WebDriver driver;
	  @Test
		public void basics()
		{
	    	WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("vijayrathore395@gmail.com");
			driver.quit();
			driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		}

}
