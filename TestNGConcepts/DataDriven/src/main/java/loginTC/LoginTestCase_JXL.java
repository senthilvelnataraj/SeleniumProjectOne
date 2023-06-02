package loginTC;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class LoginTestCase_JXL {
	
	WebDriver driver;

	String [][] data = null;

	@DataProvider(name = "logindata")
	public String[][] logindataProvider() throws BiffException, IOException {
		data=getExceldata();
		return data;
	}

	public String[][] getExceldata () throws BiffException, IOException {
		
		FileInputStream inputFile = new FileInputStream("D:\\7_Learning\\Selenium\\TestData\\Testdata1.xls");
		Workbook workbook = Workbook.getWorkbook(inputFile);
		Sheet sheet= workbook.getSheet(0);
		
		int rowcount = sheet.getRows();
		int columncount = sheet.getColumns();
		
		String testdata[][] = new String [rowcount-1][columncount];
		
		for(int i=1;i<rowcount;i++) {
			for(int j=0;j<columncount;j++) {
				testdata[i-1][j] = sheet.getCell(j, i).getContents();
				
			}
		}
		
		return testdata;
	}
	
	@BeforeTest
	public void beforetest() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	driver = new ChromeDriver();		
	driver.manage().window().maximize();		
	
	
	}
	
	@AfterTest
	public void aftertest() {
		driver.quit();
	
	}
	
	@Test(dataProvider = "logindata")
	public void loginTestcase(String uName, String pword ) {
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys(uName);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pword);
		
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();
		
		
	}

}
