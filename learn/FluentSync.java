package learn;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentSync {
public static WebDriver driver;
	
	@Test
	public void explicit()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Selenium");
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys(Keys.ENTER);
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3"));
		waitforElementpresent(driver, ele, 30).click();
	}
     public static WebElement waitforElementpresent(WebDriver driver, final WebElement eles, int Time)
     {
    	 Wait<WebDriver> wait = new FluentWait<WebDriver>( driver)
    			 .withTimeout(Duration.ofSeconds(10))
    			 .pollingEvery(Duration.ofSeconds(2))
    			 .ignoring(NoSuchElementException.class);
    	 
    	 WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){
    			
    			public WebElement apply(WebDriver driver ) {
    				return eles;
    			}});
		return clickseleniumlink;
    	 
    	 
     }
}
