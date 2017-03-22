package pageObjects;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.*;



public class Login_Page{
	
		public Login_Page(WebDriver driver) {
		super();
		// TODO Auto-generated constructor stub
	}

		private static WebElement element = null;
	
	public static WebElement firstjoblogo(WebDriver driver){
		
		element = driver.findElement(By.xpath("//img[@src='http://firstjob-bd.com/fjmanagement/resources/assets/images/logo.png']"));
		//Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", "logo.png");
		//Log.info("Logo found");
		
		return element;
	 }
	
	public static WebElement input_field_email(WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.id("email"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	}
	
	public static WebElement input_field_password (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.id("password"));
           // Log.info("Password text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("Password text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
	}
	
	public static WebElement button_signin (WebDriver driver){
		
		element = driver.findElement(By.xpath("//button[contains(.,'Sign In')]"));
		
		
		//Log.info("Sign In button found");
		
		return element;
	}
	
	//@FindBy(how = How.NAME, using = "remember")

	//public static WebElement checkbox_remember_me1 ;
	
	
	public static WebElement checkbox_remember_me (WebDriver driver){
		
		element = driver.findElement(By.xpath("//div[@class='container']/div[@id='login']/div[@class='panel panel-default']/div[@class='panel-body']/form/div[@class='checkbox']/label[1]"));
		
		//Log.info("Remember me checkbox found");
		
		return element;
	}
	
	public static WebElement link_forgot_password (WebDriver driver){
		
		element = driver.findElement(By.linkText("Forgot Password"));
		
		//Log.info("Forgot password link found");
		
		return element;
	}
	
	public static WebElement text_or (WebDriver driver){
		
		element = driver.findElement(By.xpath("//div[contains(.,'---------- OR ----------')]"));
		
		//Log.info("OR text found");
		
		return element;
	}
	
	public static WebElement link_Register_Now(WebDriver driver){
		
		element = driver.findElement(By.xpath("//a[contains(@href,'http://firstjob-bd.com/fjadmin/auth/register')]"));
		
		//Log.info("REGISTER NOW link found");
		
		return element;
	}
	
	
	

}
