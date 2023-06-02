package loginTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestCase {

	String[][]data =
	{
			{"standard_user","secret_sauce"},
			{"standard_user","secret_sauc"},
			{"standard_use","secret_sauce"},
			{"standard_use","secret_sauc"}
	};

	@DataProvider(name = "logindata")
	public String[][] logindataProvider() {
		return data;
	}

	@Test(dataProvider = "logindata")
	public void loginTestcase(String uName, String pword ) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get("https://www.saucedemo.com/");
		
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys(uName);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pword);
		
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();
		
		driver.quit();
	}

}
