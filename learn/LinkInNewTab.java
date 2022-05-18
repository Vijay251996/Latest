package learn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkInNewTab {
	public static WebDriver driver;
	
	@Test
	public void newTab()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/index.htm");
		String tabs=Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/ul/li[3]/span/a")).sendKeys(tabs);
	}

}
