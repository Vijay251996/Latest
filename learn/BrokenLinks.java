package learn;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
	public static WebDriver driver;
	
	@Test
	public void broken() throws IOException
	{
		int brokenlink=0;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> ele=driver.findElements(By.tagName("a"));
		for(WebElement opt:ele)
		{
			String url=opt.getAttribute("href");
			if(url==null || url.isEmpty())
			{
				System.out.println("URL is empty");
				continue;
			}
			URL link=new URL( url);
			
			try {
				HttpURLConnection httpconnect = (HttpURLConnection) link.openConnection();
				httpconnect.connect();
				if(httpconnect.getResponseCode()>=400)
				{
					System.out.println("The link is broken "+ url);
					brokenlink++;
				
				}
				else {
					System.out.println("The link is Valid "+ url);
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
							}
			
			
		}
		System.out.println("Total no. of broken Links: "+ brokenlink);
	}

}
