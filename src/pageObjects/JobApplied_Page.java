package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobApplied_Page {

	public JobApplied_Page(WebDriver driver){
		super();
	}
	
	private static WebElement element =null;
	
	public static WebElement job_applied_logo (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[1]/div/div/h3/i"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
		
	}
	
	public static WebElement text_job_applied (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[1]/div/div/h3"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
		
	}
	
	public static WebElement column_text_applicant_name(WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/thead/tr/th[1]"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	public static WebElement column_text_job_name(WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/thead/tr/th[2]"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	public static WebElement column_text_company_name (WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/thead/tr/th[3]"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}

	public static WebElement column_text_chat_page (WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/thead/tr/th[4]"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}

	public static WebElement column_text_applied_date (WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/thead/tr/th[5]"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}

	public static WebElement column_text_CV (WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/thead/tr/th[6]"));
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
	
}
