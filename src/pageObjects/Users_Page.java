package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Users_Page {
	
	public Users_Page(WebDriver driver){
		super();
	}
	
	private static WebElement element = null;
	
	
	public static WebElement users_list_logo (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[1]/div/div/h3/i"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement text_users_list(WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//h3[contains(.,' User List')]"));
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
	
	public static WebElement column_text_name (WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/thead/tr/th[1]"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	public static WebElement column_text_email (WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/thead/tr/th[2]"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	public static WebElement column_text_phone (WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/thead/tr/th[3]"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	public static WebElement column_text_job_saved (WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/thead/tr/th[4]"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	public static WebElement column_text_job_applied (WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/thead/tr/th[5]"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	public static WebElement column_text_follow_company (WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/thead/tr/th[6]"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	public static WebElement column_text_date_register (WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/thead/tr/th[7]"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	public static WebElement column_text_facebook (WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/thead/tr/th[8]"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	public static WebElement column_text_cv (WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/thead/tr/th[9]"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	public static WebElement column_text_actions (WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/thead/tr/th[10]"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	

}
