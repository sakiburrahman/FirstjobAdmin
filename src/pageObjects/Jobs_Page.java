package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Jobs_Page {
	
	public Jobs_Page(WebDriver driver){
		super();
	}
	
	private static WebElement element = null;
	
	
	public static WebElement jobs_list_logo (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[1]/div/div/h3/i"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement text_jobs_list(WebDriver driver) throws Exception{
		try{
			element = element = driver.findElement(By.xpath("//div[1]/section/div[1]/div/div/h3"));
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
	
	public static WebElement column_text_job_title(WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/thead/tr/th[1]"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	public static WebElement column_text_company(WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/thead/tr/th[2]"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	public static WebElement column_text_status(WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/thead/tr/th[3]"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	public static WebElement column_text_type(WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/thead/tr/th[4]"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	public static WebElement column_text_expire_date(WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/thead/tr/th[5]"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	public static WebElement column_text_action(WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/thead/tr/th[6]"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	public static WebElement input_field_search(WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//input[@type='search']"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	public static WebElement text_No_matching_records_found(WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/tbody/tr/td"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	public static WebElement text_entries_info(WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[3]/div[1]/div"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	public static WebElement button_create_job(WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div/a"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	public static WebElement create_job_logo (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/h3/i"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement text_create_job(WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/h3"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}

}