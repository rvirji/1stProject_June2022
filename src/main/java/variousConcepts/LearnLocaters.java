package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocaters {

	WebDriver driver;
	
	public void init() {
	
		System.setProperty("Webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

		
	public void testLocaters() {
		
		driver.findElement(By.name("firstname")).sendKeys("selenium");
		driver.findElement(By.id("sex-0")).click();
		
//		upload file
//		if the tag id anything else than INPUT then use Robot
	}
}

