package learn;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	public static WebDriver driver;
@Test
	public void screenshots()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		//for complete page
//	 TakesScreenshot file=(TakesScreenshot)driver;
//	 File arc= file.getScreenshotAs(OutputType.FILE);
//	 File tag=new File("C:\\Users\\user\\git\\Latest\\Learning\\Screenshots\\homepage.png");
//	 try {
//		FileUtils.copyFile(src, trg);
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
		
	//To Take Section of page
		WebElement ele=driver.findElement(By.xpath("//*[@data-testid=\"royal_login_button\"]"));
         File src=ele.getScreenshotAs(OutputType.FILE);
         File trg=new File("C:\\Users\\user\\git\\Latest\\Learning\\Screenshots\\LoginButton.png");
         try {
			FileUtils.copyFile(src, trg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
