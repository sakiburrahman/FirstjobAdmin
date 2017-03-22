package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Company_Page {
	public Company_Page(WebDriver driver){
		super();
	}
	
	private static WebElement element = null;
	
	
	public static WebElement Company_list_logo (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[1]/div/div/h3/i"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement text_Company_list(WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//h3[contains(.,' Company List')]"));
			//html/body/div[1]/section/div[1]/div/div/h3
			//html/body/div[1]/section/div[1]/div/div/h3
			//html/body/div[1]/section/div[1]/div/div/h3
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}

}
