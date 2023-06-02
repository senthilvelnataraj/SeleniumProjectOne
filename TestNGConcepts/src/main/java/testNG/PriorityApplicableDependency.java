package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PriorityApplicableDependency {
	
	@Test (priority=0,enabled = true)
	public void firsttestcase() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.quit();
	}
	
	@Test(priority=1,enabled = true)
	public void secondtestcase() {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.google.co.in");
		driver1.close();
	}	
	
		
	@Test(dependsOnMethods = "secondtestcase")
	public void thirdtestcase() {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver1 = new EdgeDriver();
		driver1.get("https://www.google.co.in");
		driver1.close();
	}

}
