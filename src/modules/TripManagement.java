package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import DataDriven.setInputs;
import utilities.NewWebDriver;

public class TripManagement extends master.MainClass {

	NewWebDriver driverProvider = NewWebDriver.getInstance();

	@Test(priority = 23)
 
  public void Trips() throws Exception {
		
		// Click on Menu
		System.out.println("Click on menu");

		driverProvider.setDriver(driver);
		driver = driverProvider.getDriver();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id='nav-toggle']/i")).click();
		
		System.out.println("Click  on Operations");
		Thread.sleep(10000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/cgc-menu-bar/div[1]/div/ul/li[6]/div"))
				.click();

		// Click on vehicles
		System.out.println("Click on Trips");
		Thread.sleep(10000);
		driver.findElement(By.linkText("Trips")).click();
  }
@Test(priority=24)
	public void addNewTrips() throws Exception
	{
		System.out.println("Click on Add New Trips");
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-trip-listing/div[2]/div[2]/div[1]/div/div/button")).click();
		System.out.println("Enter start point");
		String startPoint = setInputs.getCellData(31, 1);
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-manage-trip/div[2]/div/div/form/div[1]/div[1]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys(startPoint);
		
		System.out.println("Enter End point");
		String EndPoint = setInputs.getCellData(31, 2);
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-manage-trip/div[2]/div/div/form/div[1]/div[1]/div[1]/div[1]/div[2]/div/div/div/input")).sendKeys(EndPoint);
		System.out.println("Select Trip type");
		String TripType = setInputs.getCellData(31, 3);
		Thread.sleep(10000);
        Select triptype=new Select (driver.findElement(By.xpath("//*[@id='triptype']")));
	    triptype.selectByVisibleText(TripType);
	    Thread.sleep(10000);
	    System.out.println("Select Trip status");
	    String TripStatus = setInputs.getCellData(31, 4);
	    Select tripstatus=new Select (driver.findElement(By.xpath("//*[@id='tripstatus']")));
	    tripstatus.selectByVisibleText(TripStatus);
	    String start = setInputs.getCellData(31, 14);
	    System.out.println("Trip start date" +start);
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-manage-trip/div[2]/div/div/form/div[1]/div[1]/div[1]/div[3]/div[1]/div/wj-input-date/div/div/div/span/button/span")).click();
	    Thread.sleep(5000);
	    //driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-manage-trip/div[2]/div/div/form/div[1]/div[1]/div[1]/div[3]/div[1]/div/wj-input-date/div/div/div/span/button/span")).sendKeys(start);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/button[2]/span")).click();
	    Thread.sleep(10000);
//	    driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-manage-trip/div[2]/div/div/form/div[1]/div[1]/div[1]/div[3]/div[1]/div/wj-input-date/div/div/div/input")).sendKeys("27/Dec/2017");
//	    Thread.sleep(10000);
//	    driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-manage-trip/div[2]/div/div/form/div[1]/div[1]/div[1]/div[3]/div[2]/div/wj-input-date/div/div/div/input")).sendKeys("28/Dec/2017");
//	    
	    System.out.println("Trip end date");
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-manage-trip/div[2]/div/div/form/div[1]/div[1]/div[1]/div[3]/div[2]/div/wj-input-date/div/div/div/input")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/button[2]/span")).click();
	    
	    System.out.println("Trip start Time");
	    Double tripstart = setInputs.getCellDataobj(31, 12);
		System.out.println(tripstart);
		String tripstarttime = (int) Double.parseDouble(String.valueOf(tripstart)) + "";

	    Thread.sleep(20000);
	    driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-manage-trip/div[2]/div/div/form/div[1]/div[1]/div[1]/div[4]/div[1]/div/wj-input-time/div/div/div/input")).click();
	    Thread.sleep(20000);
	    driver.findElement(By.xpath("//*[@id='_dropdown']/div["+tripstarttime+"]")).click();
	    
	    System.out.println("Trip end Time");
	    Double tripend = setInputs.getCellDataobj(31, 13);
		System.out.println(tripend);
		String tripendtime = (int) Double.parseDouble(String.valueOf(tripend)) + "";
	    Thread.sleep(20000);
	    driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-manage-trip/div[2]/div/div/form/div[1]/div[1]/div[1]/div[4]/div[2]/div/wj-input-time/div/div/div/input")).click();
	    Thread.sleep(20000);
	    
	    
	    driver.findElement(By.xpath("//*[@id='_dropdown']/div["+tripendtime+"]")).click();
	    
	    
	    
	   
	    System.out.println("Select Route");
	    String Route = setInputs.getCellData(31, 5);
	    Thread.sleep(10000);
	    Select route=new Select (driver.findElement(By.xpath("//*[@id='triproute']")));
	    route.selectByVisibleText(Route);
	  
	    System.out.println("Nature of Trip");
	    String Nature = setInputs.getCellData(31,6);
	    Thread.sleep(10000);
	    Select nature=new Select (driver.findElement(By.xpath("//*[@id='tripNature']")));
	    nature.selectByVisibleText(Nature);
	  
	    System.out.println("Fee charges -7 days");
	    Double Fee7d = setInputs.getCellDataobj(31, 7);
		System.out.println(Fee7d);
		String days7 = (int) Double.parseDouble(String.valueOf(Fee7d)) + "";

	    Thread.sleep(10000);
	    driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-manage-trip/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/input")).sendKeys(days7);
	    System.out.println("Fee charges -1 Month");
	    Double Fee1m = setInputs.getCellDataobj(31, 8);
		System.out.println(Fee1m);
		String Mon1 = (int) Double.parseDouble(String.valueOf(Fee1m)) + "";

	    Thread.sleep(10000);
	    driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-manage-trip/div[2]/div/div/form/div[1]/div[2]/div[1]/div[3]/div/div[2]/div/input")).sendKeys(Mon1);
	    System.out.println("Fee charges -3 Mon");
	    Double Fee3m = setInputs.getCellDataobj(31, 9);
		System.out.println(Fee3m);
		String Mon3 = (int) Double.parseDouble(String.valueOf(Fee3m)) + "";
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-manage-trip/div[2]/div/div/form/div[1]/div[2]/div[1]/div[4]/div/div[2]/div/input")).sendKeys(Mon3);
	
	    System.out.println("Start Point Blocks Line One");
	    Double startBlock = setInputs.getCellDataobj(31, 10);
		System.out.println(startBlock);
		String startBlocks = (int) Double.parseDouble(String.valueOf(startBlock)) + "";
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-manage-trip/div[2]/div/div/form/div[1]/div[2]/div[1]/div[5]/div/div[1]/div[1]/div[1]/div[2]/div/input")).sendKeys(startBlocks);
	    System.out.println("End Point Blocks Line One");
	    Double endBlock = setInputs.getCellDataobj(31, 11);
		System.out.println(endBlock);
		String endBlocks = (int) Double.parseDouble(String.valueOf(endBlock)) + "";
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-manage-trip/div[2]/div/div/form/div[1]/div[2]/div[1]/div[5]/div/div[1]/div[2]/div[1]/div[2]/div/input")).sendKeys(endBlocks);
	
	    System.out.println("Click on save");
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-manage-trip/div[2]/div/div/form/div[2]/button[3]")).click();
	    }
	
//	@Test(priority=25)
//	public void EditTrips() throws Exception
//	{
//		String triprefid="TRP-SAL-KUW-201117-0005";
//		Dimension Row_count = driver.findElement(By.cssSelector("wj-flexgrid-custom.wj-control.wj-flexgrid.wj-content.wj-state-readonly.wj-state-focused")).getSize();
//	    
//		System.out.println(Row_count);
//	
//	}

}