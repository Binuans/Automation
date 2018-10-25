package modules;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import DataDriven.setInputs;
import utilities.NewWebDriver;

public class FareManagement extends master.MainClass {

	NewWebDriver driverProvider = NewWebDriver.getInstance();

	@Test(priority = 17)
	public void FareManagementScreen() throws Exception {
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
				System.out.println("Click on Fare");
				Thread.sleep(10000);
				driver.findElement(By.linkText("Fare")).click();
  }
	@Test(priority=18)
	public void RentalAddnew() throws Exception
	{
		System.out.println("Click on Add new rental");
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[2]/div/div/div/div/tabset/div/tab[1]/div/div[1]/div[1]/div/button")).click();
		System.out.println("Select Service model");
		String Servicemodelname = setInputs.getCellData(21, 1);
		Thread.sleep(10000);
		Select servicemodel=new Select(driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[3]/div/form/div/div[2]/div[1]/div[1]/div/select")));
		servicemodel.selectByVisibleText(Servicemodelname);
		System.out.println(Servicemodelname);
		System.out.println("Select Fare class");
		String Fareclass = setInputs.getCellData(21, 2);
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[3]/div/form/div/div[2]/div[1]/div[2]/div/wj-auto-complete/div/div/div/input")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[3]/div/form/div/div[2]/div[1]/div[2]/div/wj-auto-complete/div/div/div/input")).sendKeys(Fareclass);
		System.out.println(Fareclass);
		Robot robot=new Robot();
	    robot.keyPress(KeyEvent.VK_UP);
	    robot.keyRelease(KeyEvent.VK_UP);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    robot.keyPress(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_TAB);
	    
		

	    System.out.println("Select Rental Type");
	    String RentalTypename = setInputs.getCellData(21, 3);
	    Thread.sleep(10000);
		Select RentalType=new Select(driver.findElement(By.xpath("//*[@id='sel1']")));
		RentalType.selectByVisibleText(RentalTypename);
		System.out.println(RentalTypename);
		System.out.println("Enter Max Allowed Mileage (km)");
		Double maxmileage1 = setInputs.getCellDataobj(21, 4);
		System.out.println(maxmileage1);
		String maxmileage = (int) Double.parseDouble(String.valueOf(maxmileage1)) + "";
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[3]/div/form/div/div[2]/div[2]/div[2]/div/input")).sendKeys(maxmileage);
	   
		System.out.println("Base Fare (KD)");
		Double BaseFare1 = setInputs.getCellDataobj(21, 4);
		System.out.println(BaseFare1);
		String BaseFare = (int) Double.parseDouble(String.valueOf(BaseFare1)) + "";
		Thread.sleep(20000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[3]/div/form/div/div[2]/div[3]/div[1]/div/input")).sendKeys(BaseFare);
		
		System.out.println("Waiting Charge (KD/Min)");
		Double Waitingcharge1 = setInputs.getCellDataobj(21, 5);
		System.out.println(Waitingcharge1);
		String Waitingcharge = (int) Double.parseDouble(String.valueOf(Waitingcharge1)) + "";
		Thread.sleep(20000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[3]/div/form/div/div[2]/div[3]/div[2]/div/input")).sendKeys(Waitingcharge);
		
		System.out.println("Additional Mileage (KD//km)");
		Double AddMileage1 = setInputs.getCellDataobj(21, 6);
		System.out.println(AddMileage1);
		String AddMileage = (int) Double.parseDouble(String.valueOf(AddMileage1)) + "";
		Thread.sleep(20000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[3]/div/form/div/div[2]/div[4]/div[1]/div/input")).sendKeys(AddMileage);
	
		
		System.out.println("Additional Time (KD/Min)");
		Double AddTime1 = setInputs.getCellDataobj(21, 7);
		System.out.println(AddTime1);
		String AddTime = (int) Double.parseDouble(String.valueOf(AddTime1)) + "";
		Thread.sleep(20000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[3]/div/form/div/div[2]/div[4]/div[2]/div/input")).sendKeys(AddTime);
	
		System.out.println("Click on save");
		Thread.sleep(20000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[3]/div/form/div/div[3]/button[2]")).click();
		//driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
	}
	
	@Test(priority=19)
	public void RentalCancellationPolicy() throws Exception
	{
		
		System.out.println("Click on add new");
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[2]/div/div/div/div/tabset/div/tab[1]/div/div[2]/div[1]/div/button")).click();
		
		System.out.println("Add Description(en)");
		String EngDescription = setInputs.getCellData(23, 1);
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[4]/div/form/div/div[2]/div[1]/div/div/div/textarea")).sendKeys(EngDescription);
	
		System.out.println("Add Description(Ar)");
		String ArDescription = setInputs.getCellData(23, 2);
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[4]/div/form/div/div[2]/div[2]/div/div/div/textarea")).sendKeys(ArDescription);
	
		
		System.out.println("Upper Limit (Min)");
		Double UpperLimit1 = setInputs.getCellDataobj(23, 3);
		System.out.println(UpperLimit1);
		String UpperLimit = (int) Double.parseDouble(String.valueOf(UpperLimit1)) + "";
		Thread.sleep(20000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[4]/div/form/div/div[2]/div[3]/input")).sendKeys(UpperLimit);
		
		
		System.out.println("Fare%)");
		Double Fare1 = setInputs.getCellDataobj(23, 4);
		System.out.println(Fare1);
		String Fare = (int) Double.parseDouble(String.valueOf(Fare1)) + "";
		Thread.sleep(20000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[4]/div/form/div/div[2]/div[4]/input")).sendKeys(Fare);
		
		System.out.println("Click on save");
		Thread.sleep(20000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[4]/div/form/div/div[3]/button[2]")).click();	
		
		
		
		
	}
	
	
	@Test(priority=20)
	public void ScheduledAddnew() throws Exception
	{
	System.out.println("Select scheduled ride tab");
	Thread.sleep(10000);
	driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[2]/div/div/div/div/tabset/ul/li[2]/a")).click();
	System.out.println("Click on add new scheduled");
	Thread.sleep(10000);
	driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[2]/div/div/div/div/tabset/div/tab[2]/div/div[1]/div[1]/div/button")).click();
	
	System.out.println("Select Service model");
	String Servicemodelname = setInputs.getCellData(25, 1);
	Thread.sleep(10000);
	Select servicemodel=new Select(driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[5]/div/form/div/div[2]/div[1]/div[1]/div/select")));
	servicemodel.selectByVisibleText(Servicemodelname);
	System.out.println(Servicemodelname);
	System.out.println("Select Fare class");
	String Fareclass = setInputs.getCellData(25, 2);
	Thread.sleep(10000);
	driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[5]/div/form/div/div[2]/div[1]/div[2]/div/wj-auto-complete/div/div/div/input")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[5]/div/form/div/div[2]/div[1]/div[2]/div/wj-auto-complete/div/div/div/input")).sendKeys(Fareclass);
	System.out.println(Fareclass);
	Robot robot=new Robot();
    robot.keyPress(KeyEvent.VK_UP);
    robot.keyRelease(KeyEvent.VK_UP);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    robot.keyPress(KeyEvent.VK_TAB);
    robot.keyRelease(KeyEvent.VK_TAB);
    
	System.out.println("Enter Max Passenger Num");
	Double maxpax1 = setInputs.getCellDataobj(25, 3);
	System.out.println(maxpax1);
	String maxpax = (int) Double.parseDouble(String.valueOf(maxpax1)) + "";
	Thread.sleep(10000);
	driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[5]/div/form/div/div[2]/div[2]/div[1]/div/input")).sendKeys(maxpax);
   
	System.out.println("Base Fare (KD)");
	Double BaseFare1 = setInputs.getCellDataobj(25, 4);
	System.out.println(BaseFare1);
	String BaseFare = (int) Double.parseDouble(String.valueOf(BaseFare1)) + "";
	Thread.sleep(20000);
	driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[5]/div/form/div/div[2]/div[2]/div[2]/div/input")).sendKeys(BaseFare);
	
	
	System.out.println("Price per Km)");
	Double PriceperKm1 = setInputs.getCellDataobj(25, 5);
	System.out.println(PriceperKm1);
	String PriceperKm = (int) Double.parseDouble(String.valueOf(PriceperKm1)) + "";
	Thread.sleep(20000);
	driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[5]/div/form/div/div[2]/div[3]/div[1]/div/input")).sendKeys(PriceperKm);

	
	System.out.println("Waiting Charge (KD/Min)");
	Double Waitingcharge1 = setInputs.getCellDataobj(25, 6);
	System.out.println(Waitingcharge1);
	String Waitingcharge = (int) Double.parseDouble(String.valueOf(Waitingcharge1)) + "";
	Thread.sleep(20000);
	driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[5]/div/form/div/div[2]/div[3]/div[2]/div/input")).sendKeys(Waitingcharge);
	
	System.out.println("Additional Fare (Per pax)");
	Double AddFare1 = setInputs.getCellDataobj(25, 7);
	System.out.println(AddFare1);
	String AddFare = (int) Double.parseDouble(String.valueOf(AddFare1)) + "";
	Thread.sleep(20000);
	driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[5]/div/form/div/div[2]/div[4]/div/div/input")).sendKeys(AddFare);

	
	
	System.out.println("Click on save");
	Thread.sleep(20000);
	driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[5]/div/form/div/div[3]/button[2]")).click();	
	
	}
	
	
	@Test(priority=21)
	public void ScheduledDuplicationCheck() throws Exception
	{
	System.out.println("Select scheduled ride tab");
	Thread.sleep(10000);
	driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[2]/div/div/div/div/tabset/ul/li[2]/a")).click();
	System.out.println("Click on add new");
	Thread.sleep(10000);
	driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[2]/div/div/div/div/tabset/div/tab[2]/div/div[1]/div[1]/div/button")).click();
	
	System.out.println("Select Service model");
	String Servicemodelname = setInputs.getCellData(27, 1);
	Thread.sleep(10000);
	Select servicemodel=new Select(driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[5]/div/form/div/div[2]/div[1]/div[1]/div/select")));
	servicemodel.selectByVisibleText(Servicemodelname);
	System.out.println(Servicemodelname);
	System.out.println("Select Fare class");
	String Fareclass = setInputs.getCellData(27, 2);
	Thread.sleep(10000);
	driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[5]/div/form/div/div[2]/div[1]/div[2]/div/wj-auto-complete/div/div/div/input")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[5]/div/form/div/div[2]/div[1]/div[2]/div/wj-auto-complete/div/div/div/input")).sendKeys(Fareclass);
	System.out.println(Fareclass);
	Robot robot=new Robot();
    robot.keyPress(KeyEvent.VK_UP);
    robot.keyRelease(KeyEvent.VK_UP);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    robot.keyPress(KeyEvent.VK_TAB);
    robot.keyRelease(KeyEvent.VK_TAB);
    
	System.out.println("Enter Max Passenger Num");
	Double maxpax1 = setInputs.getCellDataobj(27, 3);
	System.out.println(maxpax1);
	String maxpax = (int) Double.parseDouble(String.valueOf(maxpax1)) + "";
	Thread.sleep(10000);
	driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[5]/div/form/div/div[2]/div[2]/div[1]/div/input")).sendKeys(maxpax);
   
	System.out.println("Base Fare (KD)");
	Double BaseFare1 = setInputs.getCellDataobj(27, 4);
	System.out.println(BaseFare1);
	String BaseFare = (int) Double.parseDouble(String.valueOf(BaseFare1)) + "";
	Thread.sleep(20000);
	driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[5]/div/form/div/div[2]/div[2]/div[2]/div/input")).sendKeys(BaseFare);
	
	
	System.out.println("Price per Km)");
	Double PriceperKm1 = setInputs.getCellDataobj(27, 5);
	System.out.println(PriceperKm1);
	String PriceperKm = (int) Double.parseDouble(String.valueOf(PriceperKm1)) + "";
	Thread.sleep(20000);
	driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[5]/div/form/div/div[2]/div[3]/div[1]/div/input")).sendKeys(PriceperKm);

	
	System.out.println("Waiting Charge (KD/Min)");
	Double Waitingcharge1 = setInputs.getCellDataobj(27, 6);
	System.out.println(Waitingcharge1);
	String Waitingcharge = (int) Double.parseDouble(String.valueOf(Waitingcharge1)) + "";
	Thread.sleep(20000);
	driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[5]/div/form/div/div[2]/div[3]/div[2]/div/input")).sendKeys(Waitingcharge);
	
	System.out.println("Additional Fare (Per pax)");
	Double AddFare1 = setInputs.getCellDataobj(27, 7);
	System.out.println(AddFare1);
	String AddFare = (int) Double.parseDouble(String.valueOf(AddFare1)) + "";
	Thread.sleep(20000);
	driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[5]/div/form/div/div[2]/div[4]/div/div/input")).sendKeys(AddFare);

	
	
	System.out.println("Click on save");
	Thread.sleep(20000);
	driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[5]/div/form/div/div[3]/button[2]")).click();	
	
	
	 String alertText = "";
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("toast-msg")));
		WebElement toast1 = driver.findElement(By.className("toast-msg"));  
		alertText = toast1.getText();
		System.out.println( alertText);
		Thread.sleep(1000);
		String expectedAlert="Scheduled ride fare details already exists";
		Assert.assertEquals(alertText,expectedAlert, "Wrong Alert is displayed") ;

	     System.out.println("Unable to save");
	
	
	driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[5]/div/form/div/div[1]/button/span")).click();
	
	
	
	}
	
	
	
	
	
	
	@Test(priority=22)
	public void ScheduledCancellationPolicy() throws Exception
	{
		
		System.out.println("Click on add new");
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[2]/div/div/div/div/tabset/div/tab[2]/div/div[2]/div[1]/div/button")).click();
		
		System.out.println("Add Description(en)");
		String EngDescription = setInputs.getCellData(29, 1);
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[6]/div/form/div/div[2]/div[1]/div/div/textarea")).sendKeys(EngDescription);
	
		System.out.println("Add Description(Ar)");
		String ArDescription = setInputs.getCellData(29, 2);
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[6]/div/form/div/div[2]/div[2]/div/div/textarea")).sendKeys(ArDescription);
	
		
		System.out.println("Lower Limit (Min)");
		Double LowerLimit1 = setInputs.getCellDataobj(29, 3);
		System.out.println(LowerLimit1);
		String LowerLimit = (int) Double.parseDouble(String.valueOf(LowerLimit1)) + "";
		Thread.sleep(20000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[6]/div/form/div/div[2]/div[3]/input")).sendKeys(LowerLimit);
		
		
		System.out.println("Fare%)");
		Double Fare1 = setInputs.getCellDataobj(29, 4);
		System.out.println(Fare1);
		String Fare = (int) Double.parseDouble(String.valueOf(Fare1)) + "";
		Thread.sleep(20000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[6]/div/form/div/div[2]/div[4]/input")).sendKeys(Fare);
		
		System.out.println("Click on save");
		Thread.sleep(20000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-fare-management/div[6]/div/form/div/div[3]/button[2]")).click();	
		
		
		
		
	}
	
}
