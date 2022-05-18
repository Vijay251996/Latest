package learn;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker_Dropdown {
	public static WebDriver driver;

	@Test
	public void date() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		String date="23";
		driver.findElement(By.xpath("//input[@id='dob']")).click();
	Select sel= new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]")));
	sel.selectByIndex(2);
	Select sel1= new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[2]")));
	sel1.selectByValue("1996");
	     List<WebElement> ele=driver.findElements(By.xpath("//tbody/tr/td/a"));
	     
	    for(WebElement opt:ele)
	    {
	    	String curDate=opt.getText();
	    	if(curDate.equalsIgnoreCase(date))
	    	{
	    		opt.click();
	    		break;
	    	}
	    }
	 
	}
}
