package modules;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import DataDriven.setInputs;
import utilities.NewWebDriver;

public class AddNewVehicles extends master.MainClass {
	NewWebDriver driverProvider = NewWebDriver.getInstance();

	@Test(priority = 6)
	public void openVehicles() throws Exception {
		// Click on Menu
		Thread.sleep(10000);
		System.out.println("Click  on menu");
		Thread.sleep(10000);
		driverProvider.setDriver(driver);
		driver = driverProvider.getDriver();
		driver.findElement(By.xpath("//*[@id='nav-toggle']/i")).click();
		System.out.println("Click  on Operations");
		Thread.sleep(10000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/cgc-menu-bar/div[1]/div/ul/li[6]/div"))
				.click();

		// Click on vehicles
		System.out.println("Click on vehicles");
		Thread.sleep(10000);
		driver.findElement(By.linkText("Vehicles")).click();
	}

	@Test(priority = 7)
	public void addNewVehicles() throws Exception {
		// Click on addNEw
		Robot robot = new Robot();

		System.out.println("Add new vehicle details");
		Thread.sleep(15000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-vehicle-listing/div[2]/div/div/div[1]/div/button"))
				.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Select vehicle make
		Thread.sleep(10000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/form/div[2]/div[1]/div[1]/div/div/input"))
				.click();
		String vehiclemake = setInputs.getCellData(8, 1);
		System.out.println("Add vehicle name");
		Thread.sleep(20000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/form/div[2]/div[1]/div[1]/div/div/input"))
				.sendKeys(vehiclemake);

		// driver.findElement(By.xpath("//a[text()='Nissan']")).click();
		System.out.println("click oin tab");
		Thread.sleep(10000);
		// robot.keyPress(KeyEvent.VK_ENTER);
		// robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		Thread.sleep(10000);
		// Select model
		String vehiclemodel = setInputs.getCellData(8, 2);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div/div/input"))
				.sendKeys(vehiclemodel);
		System.out.println("click oin tab");
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		// Select model=new
		// Select(driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div/div/input")));
		// model.selectByVisibleText("Urvan - 2015 - Purple");
		System.out.println("Enter seating capacity");

		Double seat1 = setInputs.getCellDataobj(8, 3);
		System.out.println(seat1);
		String seat = (int) Double.parseDouble(String.valueOf(seat1)) + "";

		Thread.sleep(5000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/form/div[2]/div[1]/div[3]/div/input"))
				.sendKeys(seat);

		System.out.println("Enter  registration expiry date");
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/form/div[2]/div[1]/div[4]/div/wj-input-date/div/div/div/span/button/span"))
				.click();
		driver.findElement(
				By.xpath("/html/body/div[2]/div/div/div[2]/button[2]/span"))
				.click();
		System.out.println("Enter fleet");
		Double fleet1 = setInputs.getCellDataobj(8, 4);
		System.out.println(fleet1);
		String fleet = (int) Double.parseDouble(String.valueOf(fleet1)) + "";
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/form/div[2]/div[2]/div[1]/div/input"))
				.sendKeys(fleet);
		System.out.println("Enter Traffic plate number");
		Double Trafficplate1 = setInputs.getCellDataobj(8, 5);
		System.out.println(Trafficplate1);
		String Trafficplate = (int) Double.parseDouble(String
				.valueOf(Trafficplate1)) + "";
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/form/div[2]/div[2]/div[2]/div/input"))
				.sendKeys(Trafficplate);
		System.out.println("Enter chasis number");
		Double chasisnumber1 = setInputs.getCellDataobj(8, 6);
		System.out.println(chasisnumber1);
		String chasisnumber = (int) Double.parseDouble(String
				.valueOf(chasisnumber1)) + "";
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/form/div[2]/div[2]/div[3]/div/input"))
				.sendKeys(chasisnumber);
		System.out.println("select fuel type");

		System.out.println("Enter  purchase date");
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/form/div[2]/div[3]/div[1]/div/wj-input-date/div/div/div/span/button/span"))
				.click();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("/html/body/div[2]/div/div/div[2]/button[2]/span"))
				.click();

		System.out.println("Enter  service start date");
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/form/div[2]/div[3]/div[2]/div/wj-input-date/div/div/div/span/button/span"))
				.click();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("/html/body/div[2]/div/div/div[2]/button[2]/span"))
				.click();

		// select owner ship

		System.out.println("select status");
		String status1 = setInputs.getCellData(8, 7);
		Select status = new Select(
				driver.findElement(By
						.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/form/div[2]/div[4]/div/div/select")));
		status.selectByVisibleText(status1);
		Thread.sleep(5000);
		System.out.println("Click on save");
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/form/div[3]/button[3]"))
				.click();
	}

	@Test(priority = 8)
	public void addNewMaintenancedetails() throws Exception {

		System.out.println("Add New Maintenancedetails");
		Thread.sleep(10000);
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/div/cgc-maintenance-and-rental/div/div/div/tabset/div/tab[1]/div/div[1]/div/button"))
				.click();
		Thread.sleep(5000);
		System.out.println("Maintenance Type");
		Thread.sleep(5000);
		String maintenancetypes = setInputs.getCellData(10, 1);
		System.out.println(maintenancetypes);
		Select maintenancetype = new Select(
				driver.findElement(By
						.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/div/cgc-maintenance-and-rental/div/div/div/div/div/div/form/div[2]/div[1]/div[1]/div/select")));
		maintenancetype.selectByVisibleText(maintenancetypes);
		
		
		System.out.println("Add New activitytype");
		Thread.sleep(5000);
		// Select activitytype=new Select(
		// driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/div/cgc-maintenance-and-rental/div/div/div/div/div/div/form/div[2]/div[1]/div[2]/div/select")));
		// activitytype.selectByVisibleText("planned");
		
		
		System.out.println("Planned Odometer Reading (KM)");
		Double reading = setInputs.getCellDataobj(10, 2);
		System.out.println(reading);
		String readingkm = (int) Double.parseDouble(String.valueOf(reading))
				+ "";
		System.out.println(readingkm);
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/div/cgc-maintenance-and-rental/div/div/div/div/div/div/form/div[2]/div[2]/div[1]/div/input"))
				.sendKeys(readingkm);
		
		System.out.println("Planned start date");
		
		String pstartdate = setInputs.getCellData(10, 3);
		Thread.sleep(10000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/div/cgc-maintenance-and-rental/div/div/div/div/div/div/form/div[2]/div[2]/div[2]/div/wj-input-date-time/div/div/div/input"))
				.click();
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/div/cgc-maintenance-and-rental/div/div/div/div/div[2]/div/div/div[2]/button[2]/span")).click();
//		StringSelection selection = new StringSelection(pstartdate);
//		System.out.println(pstartdate);
//		Toolkit.getDefaultToolkit().getSystemClipboard()
//				.setContents(selection, null);
//		// native key strokes for CTRL, V and ENTER keys
//
//		Robot robot = new Robot();
//		robot.setAutoDelay(1000);
//
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.setAutoDelay(1000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);
		

		System.out.println("Planned End date");
		
		// driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/div/cgc-maintenance-and-rental/div/div/div/div/div/div/form/div[2]/div[3]/div[1]/div/wj-input-date-time/div/div/div/span/button[1]/span")).click();
		// Thread.sleep(5000);
		// driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/div/cgc-maintenance-and-rental/div/div/div/div/div[2]/div/div/div[2]/button[2]/span")).click();
		//
		String penddate = setInputs.getCellData(10, 4);
		Thread.sleep(10000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/div/cgc-maintenance-and-rental/div/div/div/div/div[1]/div/form/div[2]/div[3]/div[1]/div/wj-input-date-time/div/div/div/input"))
				.click();
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/div/cgc-maintenance-and-rental/div/div/div/div/div[2]/div/div/div[2]/button[2]/span")).click();
//		StringSelection selection1 = new StringSelection(penddate);
//		Toolkit.getDefaultToolkit().getSystemClipboard()
//				.setContents(selection1, null);
//		// native key strokes for CTRL, V and ENTER keys
//
//		robot.setAutoDelay(1000);
//
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.setAutoDelay(1000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//
//		
//		System.out.println("Actual Start Date");
//		Thread.sleep(5000);
//		
//		// driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/div/cgc-maintenance-and-rental/div/div/div/div/div[1]/div/form/div[2]/div[4]/div[1]/div/wj-input-date-time/div/div/div/span/button[1]/span")).click();
//		// Thread.sleep(5000);
//		// driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/div/cgc-maintenance-and-rental/div/div/div/div/div[2]/div/div/div[2]/button[2]/span")).click();
//		//
//		String astartdate = setInputs.getCellData(10, 5);
//		Thread.sleep(10000);
//		driver.findElement(
//				By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/div/cgc-maintenance-and-rental/div/div/div/div/div[1]/div/form/div[2]/div[4]/div[1]/div/wj-input-date-time/div/div/div/input"))
//				.click();
//		StringSelection selection2 = new StringSelection(astartdate);
//		Toolkit.getDefaultToolkit().getSystemClipboard()
//				.setContents(selection2, null);
//		// native key strokes for CTRL, V and ENTER keys
//
//		robot.setAutoDelay(1000);
//
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.setAutoDelay(1000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		System.out.println("Location");
		String loc = setInputs.getCellData(10, 6);
		Thread.sleep(5000);
		Select Location = new Select(
				driver.findElement(By
						.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/div/cgc-maintenance-and-rental/div/div/div/div/div/div/form/div[2]/div[5]/div[1]/div/select")));
		Location.selectByVisibleText(loc);
		System.out.println(loc);
		
		System.out.println("click on save");
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/div/cgc-maintenance-and-rental/div/div/div/div/div/div/form/div[3]/button[2]"))
				.click();
	}
	
	
	@Test(priority = 9)
	public void addAttachments() throws Exception {

		System.out.println("Add New attachment");
		
		//driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/div/cgc-maintenance-and-rental/div/div/div/tabset/div/tab[2]/div/div[1]/div/form/div[1]/div[2]/a/input")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/div/cgc-maintenance-and-rental/div/div/div/tabset/ul/li[2]/a")).click();
		
		String title = setInputs.getCellData(12, 2);
        System.out.println("Enter text");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/div/cgc-maintenance-and-rental/div/div/div/tabset/div/tab[2]/div/div[1]/div/form/div[1]/div/input")).sendKeys(title);
    	String path = setInputs.getCellData(12, 1);
        System.out.println("Click on browse");
		Thread.sleep(20000);
		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/div/cgc-maintenance-and-rental/div/div/div/tabset/div/tab[2]/div/div[1]/div/form/div[2]/div[2]/a")).click();
		StringSelection selection = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
        //native key strokes for CTRL, V and ENTER keys
       Robot robot=new Robot();
        robot.setAutoDelay(1000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
      
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.setAutoDelay(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        

        System.out.println("save");
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-vehicle-management/div[2]/div/div/div/div/cgc-maintenance-and-rental/div/div/div/tabset/div/tab[2]/div/div[1]/div/form/div[3]/button"))
				.click();
		
		System.out.println("Click on OK ");
		 Thread.sleep(20000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[10]/button[1]")).click();
				
		
	}
	@Test(priority=10)
	public void closeOperation() throws Exception {
		// Click on Menu
		
		 Thread.sleep(10000);
		driverProvider.setDriver(driver);
		driver = driverProvider.getDriver();
		 System.out.println("Click on menu");
		 Thread.sleep(10000);
		driver.findElement(
				By.xpath("//*[@id='nav-toggle']/i")).click();
		 System.out.println(" Click on operations");
		// Click on operations
		Thread.sleep(10000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/cgc-menu-bar/div[1]/div/ul/li[6]/div"))
				.click();
		System.out.println("Click on menu");
		
	
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id='nav-toggle']/i")).click();
		 }
}
