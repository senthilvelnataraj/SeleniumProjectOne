package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	WebDriver driver;

	@BeforeSuite
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test(groups = { "Google" })
	@Parameters("Website Name")
	public void firsttestcase(String name) {
		driver.get(name);
		System.out.println("Name is " + name);

	}

	@AfterSuite
	public void closebrowser() {
		driver.quit();

	}

}
