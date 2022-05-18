 package learn;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static WebDriver driver;
	
	@Test
	public void drop() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.salesforce.com/uk/form/signup/freetrial-sales-pe/");
		List<WebElement> listopt=driver.findElements(By.xpath("//select[@name='CompanyEmployees']//option"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebElement listopts=driver.findElement(By.xpath("//select[@name='CompanyEmployees']//option"));
		//Select sec=new Select(listopts);
	     //sec.selectByIndex(0);
		System.out.println(listopt.size());
		for(WebElement opt:listopt)
		{
			if(opt.getText().equals("21 - 99 employees"))
			{
				opt.click();
				break;
			}
		}
		
		
	}
}
