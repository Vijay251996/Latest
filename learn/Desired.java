package learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Desired {

	@Test
	public void des() {
		

		WebDriverManager.chromedriver().setup();
		DesiredCapabilities caps =new  DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--start-maximized");
		opt.merge(caps);
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://cacert.com/");


		
	}

}
