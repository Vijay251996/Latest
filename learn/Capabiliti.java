package learn;



import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;  
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Capabiliti {

	@Test
	public void capable()
	
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		Capabilities cap= ((RemoteWebDriver) driver).getCapabilities();
		String b=cap.getBrowserName();
		String v=cap.getVersion();
		System.out.println(v);
		System.out.println(b);
	}
}
