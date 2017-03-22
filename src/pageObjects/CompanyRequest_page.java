package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompanyRequest_page {
	public CompanyRequest_page(WebDriver driver){
		super();
	}
	
	private static WebElement element = null;
	
	public static WebElement company_request_logo (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[1]/div/div/h3/i"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);	
		}
		return element;	
		
	}
	
	public static WebElement text_company_request (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[1]/div/div/h3"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);	
		}
		return element;	
		
	}

}
