package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DataDriven.setInputs;
import utilities.NewWebDriver;

public class HomePage extends master.MainClass{

 NewWebDriver driverProvider = NewWebDriver.getInstance();
		
	@Test
	public void loginPage() throws Exception {
		// Enter Login credentials
		Thread.sleep(5000);
		 
			driverProvider.setDriver(driver);
			driver = driverProvider.getDriver();
			String usercode = setInputs.getCellData(2, 1);
			String password = setInputs.getCellData(2, 2);
		System.out.println("Enter Login credentials");
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-login/div/div[2]/div[2]/form/div[1]/input"))
				.sendKeys(usercode);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-login/div/div[2]/div[2]/form/div[2]/input"))
				.sendKeys(password);
		// Click on Login button
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-login/div/div[2]/div[2]/form/button"))
				.click();
		System.out.println("Successfully Login");
	}

	
}
