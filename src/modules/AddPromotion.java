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

public class AddPromotion extends master.MainClass {

	NewWebDriver driverProvider = NewWebDriver.getInstance();

	@Test(priority = 13)
	public void Promotion() throws Exception {

		// Click on Menu
		Thread.sleep(10000);
		System.out.println("Click on menu");

		driverProvider.setDriver(driver);
		driver = driverProvider.getDriver();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id='nav-toggle']/i")).click();
		// Click on masters
		System.out.println("masters");
		Thread.sleep(15000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/cgc-menu-bar/div[1]/div/ul/li[11]/div/span"))
				.click();
		
		System.out.println("promotions");
		Thread.sleep(15000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/cgc-menu-bar/div[1]/div/ul/li[11]/ul/li[11]/a"))
				.click();

	}

	@Test(priority = 14)
	public void addNewPromotion() throws Exception {
		System.out.println("Add new promotions");
		Thread.sleep(15000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/app-promotion-graphics-management/div[2]/div/div/div[1]/div/button"))
				.click();
		Double duration1 = setInputs.getCellDataobj(16, 1);
		String dur = (int) Double.parseDouble(String.valueOf(duration1)) + "";
		System.out.println("Enter Duration");
		Thread.sleep(5000);
		Select durationselect = new Select(
				driver.findElement(By
						.xpath("/html/body/app-root/section/section/app-promotion-management/div[2]/div/div/div/form/div[2]/div[2]/div/div[1]/div[1]/select")));
		System.out.println("select Duration");
		Thread.sleep(5000);
		durationselect.selectByVisibleText(dur);
		System.out.println("Enter From date");
		Thread.sleep(10000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/app-promotion-management/div[2]/div/div/div/form/div[2]/div/div/div[2]/div[1]/wj-input-date/div/div/div/input"))
				.click();

		Thread.sleep(10000);
		driver.findElement(
				By.xpath("/html/body/div[2]/div/div/div[2]/button[2]/span"))
				.click();
		
		
//		System.out.println("Enter To date");
//		Thread.sleep(10000);
//		driver.findElement(
//				By.xpath("/html/body/app-root/section/section/app-promotion-management/div[2]/div/div/div/form/div[2]/div/div/div[2]/div[2]/wj-input-date/div/div/div/input"))
//				.click();

		Thread.sleep(10000);
		driver.findElement(
				By.xpath("/html/body/div[2]/div/div/div[2]/button[2]/span"))
				.click();
		
		String description = setInputs.getCellData(16, 2);
		System.out.println("Enter Description");
		Thread.sleep(10000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/app-promotion-management/div[2]/div/div/div/form/div[2]/div/div/div[2]/div[4]/textarea")).sendKeys(description);
			
		 System.out.println("Click on browse button");
		 Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/app-root/section/section/app-promotion-management/div[2]/div/div/div/form/div[2]/div/div/div[1]/div[2]/div[2]/div/div")).click();
		
			Thread.sleep(20000);
			
			
			StringSelection selection = new StringSelection("E:\\flower.jpg");
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
					By.xpath("/html/body/app-root/section/section/app-promotion-management/div[2]/div/div/div/form/div[3]/button[4]"))
					.click();
		
		

	}
}