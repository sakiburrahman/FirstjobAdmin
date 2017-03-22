package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header_panel {
	
	public Header_panel(WebDriver driver){
		super();
		
	}
	private static WebElement element = null;
	
	public static WebElement link_summary (WebDriver driver) throws Exception {
		try{
			element = driver.findElement(By.xpath("//div[1]/nav/div/div[2]/ul[1]/li[1]/a"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);	
		}
		return element;		
	}
	
	public static WebElement link_usermanagement (WebDriver driver) throws Exception {
		try{
			element = driver.findElement(By.xpath("//div[1]/nav/div/div[2]/ul[1]/li[2]/a"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);	
		}
		return element;		
	}
	
	public static WebElement link_usermanagement_user (WebDriver driver) throws Exception {
		try{
			element = driver.findElement(By.xpath("//div[1]/nav/div/div[2]/ul[1]/li[2]/ul/li[1]/a"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);	
		}
		return element;		
	}
	
	public static WebElement link_usermanagement_recruiter (WebDriver driver) throws Exception {
		try{
			element = driver.findElement(By.xpath("//div[1]/nav/div/div[2]/ul[1]/li[2]/ul/li[3]/a"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);	
		}
		return element;		
	}
	
	public static WebElement link_setup (WebDriver driver) throws Exception {
		try{
			element = driver.findElement(By.xpath("//div[1]/nav/div/div[2]/ul[1]/li[3]/a"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);	
		}
		return element;		
	}
	
	public static WebElement link_setup_country (WebDriver driver) throws Exception {
		try{
			element = driver.findElement(By.xpath("//div[1]/nav/div/div[2]/ul[1]/li[3]/ul/li/a"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);	
		}
		return element;		
	}
	
	public static WebElement link_job_management (WebDriver driver) throws Exception {
		try{
			element = driver.findElement(By.xpath("//div[1]/nav/div/div[2]/ul[1]/li[4]/a"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);	
		}
		return element;		
	}
	
	public static WebElement link_job_management_jobs (WebDriver driver) throws Exception {
		try{
			element = driver.findElement(By.xpath("//div[1]/nav/div/div[2]/ul[1]/li[4]/ul/li[1]/a"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);	
		}
		return element;		
	}
	
	public static WebElement link_job_management_job_applied (WebDriver driver) throws Exception {
		try{
			element = driver.findElement(By.xpath("//div[1]/nav/div/div[2]/ul[1]/li[4]/ul/li[3]/a"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);	
		}
		return element;		
	}
	
	public static WebElement link_company_management (WebDriver driver) throws Exception {
		try{
			element = driver.findElement(By.xpath("//div[1]/nav/div/div[2]/ul[1]/li[5]/a"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);	
		}
		return element;		
	}
	
	public static WebElement link_company_management_company_list (WebDriver driver) throws Exception {
		try{
			element = driver.findElement(By.xpath("//div[1]/nav/div/div[2]/ul[1]/li[5]/ul/li[1]/a"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);	
		}
		return element;		
	}
	
	public static WebElement link_company_management_company_request (WebDriver driver) throws Exception {
		try{
			element = driver.findElement(By.xpath("//div[1]/nav/div/div[2]/ul[1]/li[5]/ul/li[3]/a"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);	
		}
		return element;		
	}
	
	public static WebElement link_chat_history (WebDriver driver) throws Exception {
		try{
			element = driver.findElement(By.xpath("//div[1]/nav/div/div[2]/ul[1]/li[6]/a"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);	
		}
		return element;		
	}
	
	public static WebElement link_cache (WebDriver driver) throws Exception {
		try{
			element = driver.findElement(By.xpath("//div[1]/nav/div/div[2]/ul[1]/li[7]/a"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);	
		}
		return element;		
	}
	
	public static WebElement link_logout (WebDriver driver) throws Exception {
		try{
			element = driver.findElement(By.xpath("//div[1]/nav/div/div[2]/ul[2]/li/a"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);	
		}
		return element;		
	}

}
