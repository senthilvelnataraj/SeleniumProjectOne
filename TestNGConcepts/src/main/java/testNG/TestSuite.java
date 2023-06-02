package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuite {
	WebDriver driver;
	long starttime;
	long endtime;

	@BeforeSuite
	public void openbrowser() {
		starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test(priority = 0)
	public void firsttestcase() {
		driver.get("https://www.google.co.in");

	}

	@Test(priority = 1)
	public void secondtestcase() {

		driver.get("https://in.search.yahoo.com");

	}

	@Test(priority = 2)
	public void thirdtestcase() {
		driver.get("https://www.bing.com/");

	}

	@AfterSuite
	public void closebrowser() {
		driver.quit();
		endtime = System.currentTimeMillis();
		long totaltime = starttime - endtime;
		System.out.println("Total Time Takens" + totaltime);

	}

}
