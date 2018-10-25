package modules;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import DataDriven.setInputs;
import utilities.NewWebDriver;

public class ScheduledRide extends master.MainClass {

	NewWebDriver driverProvider = NewWebDriver.getInstance();

	@Test(priority = 15)
	public void ScheduledRideWindow() throws Exception {
		// Click on Menu
		Thread.sleep(10000);
				System.out.println("Click on menu");

				driverProvider.setDriver(driver);
				driver = driverProvider.getDriver();
				Thread.sleep(20000);
				driver.findElement(By.xpath("//*[@id='nav-toggle']/i")).click();
				
				System.out.println("Click on scheduled ride");
				Thread.sleep(20000);
				driver.findElement(By.xpath("/html/body/app-root/section/cgc-menu-bar/div[1]/div/ul/li[10]/div/a/i")).click();
				

        }
	@Test(priority = 16)
	public void AddNewScheduledRide() throws Exception {
		// Click on Menu
				System.out.println("Click on Add New");
				Thread.sleep(20000);
				driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-scheduled-ride-request-management/div[2]/div/div/div[1]/div/button")).click();
	
	            System.out.println("Select Passenger");
	            String paxname = setInputs.getCellData(18, 1);
	            Thread.sleep(20000);
				driver.findElement(By.className("wj-form-control")).sendKeys(paxname);
				Thread.sleep(2000);
				Robot robot=new Robot();
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(2000);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
//				robot.keyPress(KeyEvent.VK_ENTER);
//				robot.keyRelease(KeyEvent.VK_ENTER);
				
				System.out.println("Enter pickup loc");
				 String pickloc = setInputs.getCellData(18, 2);
				Thread.sleep(10000);
				driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-scheduled-ride-request-add/div[2]/div/div/form/div/div/div[1]/div[2]/div[1]/div/div/div/input")).sendKeys(pickloc);
				
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				
				System.out.println("Enter drop off loc");
				 String droploc = setInputs.getCellData(18, 3);
				Thread.sleep(10000);
				driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-scheduled-ride-request-add/div[2]/div/div/form/div/div/div[1]/div[2]/div[2]/div/div/div/input")).sendKeys(droploc);
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				
				System.out.println("Enter ride date");
				String ridedate = setInputs.getCellData(18, 4);
				System.out.println(ridedate);
               StringSelection selection1 = new StringSelection(ridedate);
       		Toolkit.getDefaultToolkit().getSystemClipboard()
       				.setContents(selection1, null);
       		// native key strokes for CTRL, V and ENTER keys
       		Thread.sleep(30000);
       		driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-scheduled-ride-request-add/div[2]/div/div/form/div/div/div[1]/div[3]/div[1]/div/wj-input-date/div/div/div/input")).click();
       		robot.setAutoDelay(1000);

       		robot.keyPress(KeyEvent.VK_CONTROL);
       		robot.keyPress(KeyEvent.VK_V);

       		robot.keyRelease(KeyEvent.VK_CONTROL);
       		robot.keyRelease(KeyEvent.VK_V);
       		robot.setAutoDelay(1000);
       		robot.keyPress(KeyEvent.VK_ENTER);
       		robot.keyRelease(KeyEvent.VK_ENTER);

				
				System.out.println("Enter time");
				String ridetime = setInputs.getCellData(18, 5);
				System.out.println(ridetime);
				Thread.sleep(30000);
				driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-scheduled-ride-request-add/div[2]/div/div/form/div/div/div[1]/div[3]/div[2]/div/wj-input-time/div/div/div/input")).sendKeys(ridetime);
				
				System.out.println("Enter number of passengers");
				Thread.sleep(10000);
				
                Select paxcount=new Select(driver.findElement(By.xpath("//*[@id='sel1']")));
                paxcount.selectByVisibleText("10");
				
				System.out.println("Click on view fare");
				Thread.sleep(10000);
				driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-scheduled-ride-request-add/div[2]/div/div/div[2]/button[3]")).click();
				System.out.println("Click on fare class");
				Thread.sleep(10000);
				driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-scheduled-ride-request-add/div[3]/div/div/div[2]/div/div/div[1]/div/div/div[1]/label/input")).click();
				
				
				System.out.println("Click on create request");
				Thread.sleep(10000);
				driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-scheduled-ride-request-add/div[3]/div/div/div[3]/button")).click();
	}

}
