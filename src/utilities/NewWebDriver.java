package utilities;

import org.openqa.selenium.WebDriver;

public class NewWebDriver {  //Singleton class

	private static NewWebDriver instance;  //  purpose is to control object creation, limiting the number of obejcts to one only
	private WebDriver driver;
	
	
	   /* A private Constructor prevents any other 
	    * class from instantiating.
	    */
	
	private NewWebDriver() {
	}
	
	/* Static 'instance' method */
	public static NewWebDriver getInstance() {  //static accessor method with a name like getInstance().
		if(instance == null) {
			instance = new NewWebDriver();
		}
		return instance;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
