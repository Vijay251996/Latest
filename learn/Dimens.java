package learn;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Dimens {
	public static WebDriver driver;
    @Test
	public void dimen()
	{
		WebDriverManager.chromedriver().setup();
	  	driver=new ChromeDriver();
	  	driver.manage().window().maximize();
	  	Dimension dim = new Dimension(420, 1080);
	  	driver.manage().window().setSize(dim);     		
	}
    
    @Test
	public void screenshots()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		//for complete page
	 TakesScreenshot file=(TakesScreenshot)driver;
	 File arc= file.getScreenshotAs(OutputType.FILE);
	 File tag=new File("C:\\Users\\user\\git\\Latest\\Learning\\Screenshots\\homepage.png");
	 try {
		FileUtils.copyFile(arc, tag);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
