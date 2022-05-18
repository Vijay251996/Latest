package learn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MetdKeyDown {
	
	@Test
	public void bas() {
		WebDriverManager.chromedriver().setup();
		      WebDriver driver = new ChromeDriver();
		      String url = "https://www.tutorialspoint.com/index.htm";
		      driver.get(url);
		      driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		      WebElement l = driver.findElement(By.xpath("//*[@id='search-strings']"));
		      // Actions class
		      Actions a = new Actions(driver);
		      a.moveToElement(l).click();
		      
		      //enter text with keyDown() SHIFT key ,keyUp() then build() ,perform()
		      a.keyDown(Keys.SHIFT);
		      a.sendKeys("hello").keyUp(Keys.SHIFT).build().perform();
		      
		   }

}
