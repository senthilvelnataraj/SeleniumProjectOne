package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestByGroup {
	WebDriver driver;
	long starttime;
	long endtime;

	@BeforeSuite
	public void openbrowser() {
		starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test(groups = {"Google"})
	public void firsttestcase() {
		driver.get("https://www.google.co.in");

	}

	@Test(groups = {"Yahoo"})
	public void secondtestcase() {

		driver.get("https://in.search.yahoo.com");

	}

	@Test(groups = {"Bing"})
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
