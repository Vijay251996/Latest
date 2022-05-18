package learn;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cooki {
public static WebDriver driver;
	
    @Test
	public void basics()
	{
    	WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Set<Cookie> cook= driver.manage().getCookies();
		
		for(Cookie cookies: cook)
		{
			System.out.println(cookies.getName()+" : "+ cookies.getValue());
		}
		
		Cookie cookObj=new Cookie("MyCookie123","123456");
		driver.manage().addCookie(cookObj);
		
		cook= driver.manage().getCookies();
		
		for(Cookie cookies: cook)
		{
			System.out.println(cookies.getName()+" : "+ cookies.getValue());
		}
	}
}
