package learn;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {
	public static WebDriver driver;
	  @Test
		public void basics()
		{
	    	WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("admin");
			driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
			driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			List<WebElement> row=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));
			int row1=row.size();
			
			List <WebElement> col=driver.findElements(By.xpath("//*[@id='resultTable']/thead/tr/th"));
			int col1=col.size();
			System.out.println(row1+" : " +col1);
			
			for(int i=1; i<row1;i++)
			{
				for (int j=2;j<=col1;j++)
				{
					WebElement ele=driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+ i +"]/td["+ j +"]"));
					System.out.print(ele.getText()+" | ");
				}
				System.out.println();
			}
			
		}
}
