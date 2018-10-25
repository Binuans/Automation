package master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import DataDriven.setInputs;
import constant.constants;
import utilities.NewWebDriver;

public class MainClass {
	protected static WebDriver driver = null;
	  @BeforeSuite

	public void homePageSettings() throws Exception {
		 NewWebDriver driverProvider = NewWebDriver.getInstance(); // creating singleton object:
		//System.setProperty("webdriver.chrome.driver","E:\\Binu\\Selenium\\chromedriver.exe");
		 System.setProperty("webdriver.chrome.driver",constants.chromepath);
		setInputs.setExcelFile(constants.inputpath + constants.testdata,
				"LoginDetails");
		 driverProvider.setDriver(driver);
		driver = new ChromeDriver();
		System.out.println("Load url");
		driver.get(constants.URL);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		System.out.println("Loaded");
	}
}
