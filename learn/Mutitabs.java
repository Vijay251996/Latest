package learn;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mutitabs {
	
		public static WebDriver driver;
	  @Test
		public void basics()
		{
	    	WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://demoqa.com/browser-windows/");
			driver.manage().window().maximize();
			driver.findElement(By.id("tabButton")).click();
			Set<String> str=driver.getWindowHandles();
			ArrayList<String> tabs=new ArrayList<String>(str);
			tabs.get(1);
			
			
		}

}
