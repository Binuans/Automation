package modules;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import DataDriven.setInputs;
import utilities.NewWebDriver;

public class MyProfileClass extends master.MainClass {
	NewWebDriver driverProvider = NewWebDriver.getInstance();
	 @Test(priority=1)
	public void profileUpdation() throws Exception {
		// Click on account
		 System.out.println("Select My Profle");
		
		driverProvider.setDriver(driver);
		driver = driverProvider.getDriver();
		
		 Thread.sleep(20000);
		driver.findElement(By.className("user-image")).click();
		// Click on My profile
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/app-root/cgc-header/header/div/div[2]/div[2]/div[4]/div/ul/li[1]/a"))
				.click();
		Thread.sleep(3000);
		// Click on Edit
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-view-user-profile/div[2]/div/div/div/div[3]/a/button"))
				.click();
		Thread.sleep(3000);
		// Cancel Edit screen
		System.out.println("Cancel Edit screen");
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-edit-user-profile/div[2]/div/div/div/div[3]/button[1]"))
				.click();
	 }
	 @Test(priority=2)
	 public void editMyProfile()throws Exception
	 {
		// Click on Edit
		// String Mobilenumber = setInputs.getCellData(2, 2);
		 Double Mobilenumber1 = setInputs.getCellDataobj(4,1);
			System.out.println(Mobilenumber1);
		String Mobilenumber = (int) Double.parseDouble(String.valueOf(Mobilenumber1)) + "";
		System.out.println(Mobilenumber);
		//	String password = setInputs.getCellData(2, 1);
		 System.out.println("Edit profile details");
		System.out.println("Click on Edit");
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-view-user-profile/div[2]/div/div/div/div[3]/a/button"))
				.click();
   

		// Clear Mobile number
		System.out.println("Clear Mobile number");
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-edit-user-profile/div[2]/div/div/div/div[2]/form/div/div[2]/div[2]/div/div/div/div/input"))
				.clear();

		// Enter Mobile number
		System.out.println("Mobile number");
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-edit-user-profile/div[2]/div/div/div/div[2]/form/div/div[2]/div[2]/div/div/div/div/input"))
				.sendKeys(Mobilenumber);
		// Click on save
		System.out.println("save");
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("/html/body/app-root/section/section/cgc-edit-user-profile/div[2]/div/div/div/div[3]/button[3]"))
				.click();

	}
//	 @Test(priority=3)
//	 public void checkDisable() throws InterruptedException
//	 {
//		 System.out.println("Click on Edit");
//			Thread.sleep(3000);
//			driver.findElement(
//					By.xpath("/html/body/app-root/section/section/cgc-view-user-profile/div[2]/div/div/div/div[3]/a/button"))
//					.click();
//			// Clear username number
//						System.out.println("Clear username");
//						Thread.sleep(3000);
//						driver.findElement(
//								By.xpath("/html/body/app-root/section/section/cgc-edit-user-profile/div[2]/div/div/div/div[2]/form/div/div[2]/div[1]/div/div/input"))
//								.clear();
//						
//
//			// Clear Mobile number
//			System.out.println("Clear Mobile number");
//			Thread.sleep(3000);
//			driver.findElement(
//					By.xpath("/html/body/app-root/section/section/cgc-edit-user-profile/div[2]/div/div/div/div[2]/form/div/div[2]/div[2]/div/div/div/div/input"))
//					.clear();
//			Boolean savebutton = driver
//					.findElement(
//							By.xpath("/html/body/app-root/section/section/cgc-edit-user-profile/div[2]/div/div/div/div[3]/button[3]"))
//					.isEnabled();
//			
//			Assert.assertFalse(savebutton, "Save button Disabled");
//			
//			
//	 }
//	 
	 @Test(priority=3)
	 public void changePassword() throws Exception
	 {
		 System.out.println("Change password"); 
		 String oldpassword = setInputs.getCellData(6, 1);
		 String newpassword = setInputs.getCellData(6, 2);
		 String confirmpassword = setInputs.getCellData(6, 3);


		 
		 System.out.println("Click on Edit");
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("/html/body/app-root/section/section/cgc-view-user-profile/div[2]/div/div/div/div[3]/a/button"))
					.click();
		 System.out.println("Click on Change password");
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("/html/body/app-root/section/section/cgc-edit-user-profile/div[2]/div/div/div/div[3]/button[2]"))
					.click();
			// Enter current password
						System.out.println("Enter current password");
						Thread.sleep(3000);
						driver.findElement(
								By.xpath("/html/body/app-root/section/section/cgc-edit-user-profile/div[3]/div/div/form/div[2]/div[1]/input")).sendKeys(oldpassword);
								
						

			// Enter new password
			System.out.println("Enter new password");
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("/html/body/app-root/section/section/cgc-edit-user-profile/div[3]/div/div/form/div[2]/div[2]/input"))
					.sendKeys(newpassword);
			System.out.println("Enter confirm  password");
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("/html/body/app-root/section/section/cgc-edit-user-profile/div[3]/div/div/form/div[2]/div[3]/input"))
					.sendKeys(confirmpassword);
			driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-edit-user-profile/div[3]/div/div/form/div[3]/button[2]")).click();
			// Click on save
			System.out.println("save");
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("/html/body/app-root/section/section/cgc-edit-user-profile/div[2]/div/div/div/div[3]/button[3]"))
					.click();
			
	 }
	 @Test(priority=4)
	 public void uploadImage() throws InterruptedException, AWTException
	 {
		 Robot robot = new Robot();
		 System.out.println("Upload image");
		 System.out.println("Click on Edit");
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("/html/body/app-root/section/section/cgc-view-user-profile/div[2]/div/div/div/div[3]/a/button"))
					.click();
			
		 System.out.println("Click on browse button");
		 Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-edit-user-profile/div[2]/div/div/div/div[2]/form/div/div[1]/div[2]")).click();
		//	uploadFile("E:\flower.jpg");
			Thread.sleep(20000);
			
			
			StringSelection selection = new StringSelection("E:\\flower.jpg");
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
	        //native key strokes for CTRL, V and ENTER keys
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
					By.xpath("/html/body/app-root/section/section/cgc-edit-user-profile/div[2]/div/div/div/div[3]/button[3]"))
					.click();
		}
		
	 @Test(priority=5)
	 public void removeImage() throws InterruptedException
	 {
		 System.out.println("Remove Image");
		 System.out.println("Click on Edit");
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("/html/body/app-root/section/section/cgc-view-user-profile/div[2]/div/div/div/div[3]/a/button"))
					.click();
			Thread.sleep(10000);
		//Click on remove
			driver.findElement(By.xpath("/html/body/app-root/section/section/cgc-edit-user-profile/div[2]/div/div/div/div[2]/form/div/div[1]/div[3]/button")).click();
			 System.out.println("save");
				Thread.sleep(5000);
				driver.findElement(
						By.xpath("/html/body/app-root/section/section/cgc-edit-user-profile/div[2]/div/div/div/div[3]/button[3]"))
						.click();
	 
	 }
			
	 }

