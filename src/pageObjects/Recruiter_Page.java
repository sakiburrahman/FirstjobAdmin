package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Recruiter_Page {
	
	public Recruiter_Page(WebDriver driver){
		super();
	}
	
	private static WebElement element = null;
	
	public static WebElement recruiter_list_logo (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[1]/div/div/h3/i"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement text_recruiter_list(WebDriver driver) throws Exception{
		try{
			element = element = driver.findElement(By.xpath("//div[1]/section/div[1]/div/div/h3"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}

}
