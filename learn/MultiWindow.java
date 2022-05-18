package learn;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiWindow {

	public static WebDriver driver;

	@Test
	public void basics() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows/");
		driver.manage().window().maximize();
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.id("windowButton")).click();
		Set<String> str = driver.getWindowHandles();
		Iterator<String> itr = str.iterator();

		while (itr.hasNext()) {
			String childWindow = itr.next();
			if (!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				driver.manage().window().maximize();
				Thread.sleep(1000);
			}
		}
		driver.switchTo().window(parentWindow);
	}

}
