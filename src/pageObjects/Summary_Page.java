package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import jdk.nashorn.internal.runtime.regexp.RegExpMatcher;

public class Summary_Page {
	
	public Summary_Page(WebDriver driver){
		super();
	}
	
	private static WebElement element = null;
	
	public static WebElement text_Dashboard (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//h3[contains(.,' Dashboard')]"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	
	public static WebElement view_details_users_logo (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//span[contains(.,'View Details')]"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement text_view_details_from_users_panel (WebDriver driver) throws Exception{
		try{
			//element =  driver.findElement(By.xpath("//a[@href='http://firstjob-bd.com/fjadmin/applicant']"));
			element = driver.findElement(By.xpath("//div/section/div[2]/div[1]/div/a/div/span[1]"));
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement text_users_from_users_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div[1]/div/div/div/div[2]/div[2]"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement number_from_users_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div[1]/div/div/div/div[2]/div[1]"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement arrow_sign_from_users_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div[1]/div/a/div/span[2]/i"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement view_details_jobs_logo (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div[2]/div/div/div/div[1]/i"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement text_view_details_from_jobs_panel (WebDriver driver) throws Exception{
		try{
			//element =  driver.findElement(By.xpath("//a[@href='http://firstjob-bd.com/fjadmin/applicant']"));
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div[2]/div/a/div/span[1]"));
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement text_jobs_from_jobs_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div[2]/div/div/div/div[2]/div[2]"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement number_from_jobs_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div[2]/div/div/div/div[2]/div[1]"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement arrow_sign_from_jobs_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div[2]/div/a/div/span[2]/i"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	
	public static WebElement view_details_companies_logo (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div[3]/div/div/div/div[1]/i"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement text_view_details_from_companies_panel (WebDriver driver) throws Exception{
		try{
			//element =  driver.findElement(By.xpath("//a[@href='http://firstjob-bd.com/fjadmin/applicant']"));
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div[3]/div/a/div/span[1]"));
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement text_companies_from_companies_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div[3]/div/div/div/div[2]/div[2]"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement number_from_companies_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div[3]/div/div/div/div[2]/div[1]"));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement arrow_sign_from_companies_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[2]/div[3]/div/a/div/span[2]/i"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement text_notification_panel_from_notification_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[@class='container-fluid main-wrapper']/section[@class='container-fluid jp-container']/div[@class='row'][2]/div[@class='col-md-6'][1]/div[@class='panel panel-primary']/div[@class='panel-heading']"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement text_today_from_notification_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div[1]/div/div[2]/h3[1]"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement list_new_user_from_today_secton_under_notification_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div[1]/div/div[2]/ul[1]/li[1]"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement list_new_company_from_today_secton_under_notification_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div[1]/div/div[2]/ul[1]/li[2]"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement list_new_job_from_today_secton_under_notification_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div[1]/div/div[2]/ul[1]/li[3]"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement list_job_applied_from_today_secton_under_notification_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div[1]/div/div[2]/ul[1]/li[4]"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement text_this_week_from_notification_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div[1]/div/div[2]/h3[2]"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement list_new_user_from_this_week_secton_under_notification_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div[1]/div/div[2]/ul[2]/li[1]"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement list_new_company_from_this_week_secton_under_notification_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div[1]/div/div[2]/ul[2]/li[2]"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement list_new_job_from_this_week_secton_under_notification_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div[1]/div/div[2]/ul[2]/li[3]"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement list_job_applied_from_this_week_secton_under_notification_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div[1]/div/div[2]/ul[2]/li[4]"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement text_month_from_notification_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div[1]/div/div[2]/h3[3]"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement list_new_user_from_this_month_secton_under_notification_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div[1]/div/div[2]/ul[3]/li[1]"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement list_new_company_from_this_month_secton_under_notification_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div[1]/div/div[2]/ul[3]/li[2]"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement list_new_job_from_this_month_secton_under_notification_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div[1]/div/div[2]/ul[3]/li[3]"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement list_job_applied_from_this_month_secton_under_notification_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div[1]/div/div[2]/ul[3]/li[4]"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement text_popular_jobs_from_popular_jobs_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div[2]/div[1]/div[1]"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement list_job_name_from_popular_jobs_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div[2]/div[1]/div[2]/table/thead/tr/th[1]"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement list_total_applied_from_popular_jobs_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div[2]/div[1]/div[2]/table/thead/tr/th[2]"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement list_company_from_popular_jobs_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div[2]/div[1]/div[2]/table/thead/tr/th[3]"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement list_expired_date_from_popular_jobs_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div[2]/div[1]/div[2]/table/thead/tr/th[4]"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement text_popular_companies_from_popular_companies_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div[2]/div[2]/div[1]"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement list_comapny_from_popular_companies_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div[2]/div[2]/div[2]/table/thead/tr/th[1]"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement list_total_applied_from_popular_companies_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div[2]/div[2]/div[2]/table/thead/tr/th[2]"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement list_total_jobs_from_popular_companies_panel (WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/section/div[3]/div[2]/div[2]/div[2]/table/thead/tr/th[3]"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement text_copyright_statement(WebDriver driver) throws Exception{
		try{
			element = driver.findElement(By.xpath("//div[1]/footer"));

		}
		catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	





}
