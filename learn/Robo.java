package learn;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robo {
	public static WebDriver driver;
	
	@Test
	public void robi() throws AWTException
	{
		
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.monsterindia.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"user-signup-actions\"]/div[1]/div[1]/a[2]")).click();
	WebElement ele=driver.findElement(By.cssSelector("#file-upload"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", ele);
	
	Robot rb=new Robot();
	rb.delay(2000);
	StringSelection sel=new StringSelection("C:\\Users\\user\\Downloads\\Resume1.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	//When type is of file we can use send Keys instead of robot class
	//driver.findElement(By.cssSelector("#file-upload")).sendKeys("C:\\Users\\user\\Downloads\\Resume1.pdf");
	
	
	}

}
