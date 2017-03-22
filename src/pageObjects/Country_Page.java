package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Country_Page {
	
	public Country_Page(WebDriver driver){
		super();
	}
	
	private static WebElement element = null;
	
	public static WebElement country_list_logo (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[1]/div/div/h3/i"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement text_country_list (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//h3[contains(.,' Country List')]"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement button_create_country (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div[2]/a"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement text_create_country (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[9]/a"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement text_code (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div/div/div[2]/form/div[1]/label"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement input_field_code (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div/div/div[2]/form/div[1]/input"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement text_name (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div/div/div[2]/form/div[2]/label"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement input_field_name (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div/div/div[2]/form/div[2]/input"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement button_save (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div/div/div[2]/form/button"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement button_close (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div/div/div[3]/button"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement icon_close (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div/div/div[1]/button"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement text_alart (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.id("alertMeg"));
			//div[1]/section/div[2]/div[2]/div/div
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement messagebox_alart (WebDriver driver) throws Exception{
		try{
			//element = driver.findElement(By.xpath("//div[1]/section/div[2]/div[2]/div/div"));
			element = driver.findElement(By.xpath("//div[contains(@role,'alert')]"));
			//div[1]/section/div[2]/div[2]/div/div
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement column_text_code (WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div[2]/table/thead/tr/th[1]"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	public static WebElement column_text_name (WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div[2]/table/thead/tr/th[2]"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	public static WebElement column_text_actions (WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div[2]/table/thead/tr/th[3]"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	


}
