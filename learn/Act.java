package learn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Act {
	@Test
	public void act() {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
	      
	        driver.get("https://demoqa.com/text-box");
	       
	       
	        WebElement fullName = driver.findElement(By.id("userName"));
	        fullName.sendKeys("Mr.Peter Haynes");
	      
	        WebElement email=driver.findElement(By.id("userEmail"));
	        email.sendKeys("PeterHaynes@toolsqa.com");
	        
	        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
	        currentAddress.sendKeys("43 School Lane London EC71 9GO");
	        
	        // Copy the Current Address
	        currentAddress.sendKeys(Keys.CONTROL);
	        currentAddress.sendKeys("A");
	        currentAddress.sendKeys(Keys.CONTROL);
	        currentAddress.sendKeys("C");
	        
	        //Press the TAB Key to Switch Focus to Permanent Address
	        currentAddress.sendKeys(Keys.TAB);
	        
	        //Paste the Address in the Permanent Address field
	        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
	        permanentAddress.sendKeys(Keys.CONTROL);
	        permanentAddress.sendKeys("V");
	        
	      
	}

}
