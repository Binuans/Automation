package modules;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import DataDriven.setInputs;
import utilities.NewWebDriver;

public class EnquiryTrackingForm extends master.MainClass {

  NewWebDriver driverProvider = NewWebDriver.getInstance();
	 @Test(priority=11)
	public void EnquiryForm() throws Exception {
		 
		// Click on Menu
			System.out.println("Click on menu");
			
			driverProvider.setDriver(driver);
			driver = driverProvider.getDriver();
			Thread.sleep(20000);
			driver.findElement(By.xpath("//*[@id='nav-toggle']/i")).click();
			// Click on Enquiry form
			Thread.sleep(15000);
			driver.findElement(
					By.xpath("/html/body/app-root/section/cgc-menu-bar/div[1]/div/ul/li[8]/div/a/span"))
					.click();

			
		} 
	 @Test(priority=12)
	 public void addNewEnquiry() throws Exception
	 {
		 System.out.println("Click on Add new");
			Thread.sleep(5000);
		 driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-enquiry-form/div[2]/div/div/div/div/div[1]/div/div/button")).click();
		 String EnqContent = setInputs.getCellData(14, 1);
		 System.out.println("Add Enquiry content");
			Thread.sleep(5000);
		 driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-enquiry-form/div[2]/div/div/div/form/div[2]/div[1]/div[1]/div/input")).sendKeys(EnqContent);
	
		 System.out.println("Enquiry description");
		 String EnqDes = setInputs.getCellData(14, 2);
			Thread.sleep(5000);
		 driver.findElement(By.xpath(" /html/body/app-root/section/section/cgc-enquiry-form/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div/textarea")).sendKeys(EnqDes);
	
		 System.out.println("Date and Time");
			Thread.sleep(10000);
			 driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-enquiry-form/div[2]/div/div/div/form/div[2]/div[1]/div[3]/div/wj-input-date-time/div/div/div/span/button[1]/span")).click();
			 Thread.sleep(10000);
			 driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/button[2]/span")).click();
	
		 System.out.println("Location");
		 String Location = setInputs.getCellData(14, 3);
			Thread.sleep(5000);
		 driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-enquiry-form/div[2]/div/div/div/form/div[2]/div[1]/div[4]/div/input")).sendKeys(Location);
	
		 System.out.println("Passenger name");
		 String Passenger = setInputs.getCellData(14, 4);
			Thread.sleep(5000);
		 driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-enquiry-form/div[2]/div/div/div/form/div[2]/div[2]/div[1]/div/input")).sendKeys(Passenger);
	
		 System.out.println("Phone number");
		 
			Double mob = setInputs.getCellDataobj(14, 5);
			System.out.println(mob);
			String phone = (int) Double.parseDouble(String.valueOf(mob)) + "";
			Thread.sleep(5000);
		 driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-enquiry-form/div[2]/div/div/div/form/div[2]/div[2]/div[3]/div/div/input")).sendKeys(phone);
	
		 System.out.println("Click on save");
			Thread.sleep(5000);
		 driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-enquiry-form/div[2]/div/div/div/form/div[3]/button[3]")).click();
	
		 
		 
	 }
  }



