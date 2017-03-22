package managementDashboard;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.lang.Object;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.CompanyRequest_page;
import pageObjects.Company_Page;
import pageObjects.Country_Page;
import pageObjects.Header_panel;
import pageObjects.JobApplied_Page;
import pageObjects.Jobs_Page;
import pageObjects.Recruiter_Page;
import pageObjects.Summary_Page;
import pageObjects.Users_Page;
import utility.Constant;
import utility.ExcelUtils;

public class UserManagementUser extends managementDashboard.BaseClass {
	private static final TimeUnit SECONDS = null;
	
	/*@Test(testName ="Test header panel")
	public static void test_header_panel() throws Exception{
		ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output,"Sheet1");
		
		try{
			
			WebDriverWait wait = new WebDriverWait(driver, 20);
			
			//Test Dashboard Text & link
			Header_panel.link_summary(driver).click();
			//Thread.sleep(30);
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h3[contains(.,' Dashboard')]"), "DASHBOARD"));
			//wait.until(ExpectedConditions.textToBePresentInElement(Summary_Page.text_Dashboard(driver), "DASHBOARD"));
			//wait.until(ExpectedConditions.visibilityOf(Summary_Page.text_Dashboard(driver)));
			//wait.until(ExpectedConditions.presenceOfElementLocated(Summary_Page.text_Dashboard(driver)));
			Summary_Page.view_details_users_logo(driver).isEnabled();
			Summary_Page.text_Dashboard(driver).isEnabled();
			
			//Test User List Text & link
			Header_panel.link_usermanagement(driver).click();
			Thread.sleep(30);
			Header_panel.link_usermanagement_user(driver).click();
			//Thread.sleep(30);
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h3[contains(.,' User List')]"), "USER LIST"));
			
			//wait.until(ExpectedConditions.textToBePresentInElement(Users_Page.text_users_list(driver), "USER LIST"));
			//By.xpath("//h3[contains(.,' User List')]")
			
			Users_Page.users_list_logo(driver).isDisplayed();
			Users_Page.text_users_list(driver).isDisplayed();
			
			//Test Recruiter List Text & link
			Header_panel.link_usermanagement(driver).click();
			Thread.sleep(30);
			Header_panel.link_usermanagement_recruiter(driver).click();
			Thread.sleep(30);
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h3[contains(.,' Recruiter List')]"), "RECRUITER LIST"));
			Recruiter_Page.recruiter_list_logo(driver).isDisplayed();
			Recruiter_Page.text_recruiter_list(driver).isDisplayed();
			
			//Test Country List Text & link
			Header_panel.link_setup(driver).click();
			Thread.sleep(30);
			Header_panel.link_setup_country(driver).click();
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h3[contains(.,' Country List')]"), "COUNTRY LIST"));
			Country_Page.country_list_logo(driver).isDisplayed();
			Country_Page.text_country_list(driver).isDisplayed();
			
			//Test Jobs Text & link from Job Management
			Header_panel.link_job_management(driver).click();
			Thread.sleep(30);
			Header_panel.link_job_management_jobs(driver).click();
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h3[contains(.,' Job List')]"), "JOB LIST"));
			Jobs_Page.jobs_list_logo(driver).isDisplayed();
			Jobs_Page.text_jobs_list(driver).isDisplayed();
			
			//Test Job applied Text & link from Job Management
			Header_panel.link_job_management(driver).click();
			Thread.sleep(30);
			Header_panel.link_job_management_job_applied(driver).click();
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h3[contains(.,' Job Applied')]"), "JOB APPLIED"));
			JobApplied_Page.job_applied_logo(driver).isDisplayed();
			JobApplied_Page.text_job_applied(driver).isDisplayed();
			
			//Test Company List Text & link from Company Management
			Header_panel.link_company_management(driver).click();
			Thread.sleep(30);
			Header_panel.link_company_management_company_list(driver).click();
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h3[contains(.,' Company List')]"), "COMPANY LIST"));
			Company_Page.Company_list_logo(driver).isDisplayed();
			Company_Page.text_Company_list(driver).isDisplayed();
			
			//Test Company request Text & link from Company Management
			Header_panel.link_company_management(driver).click();
			Thread.sleep(30);
			Header_panel.link_company_management_company_request(driver).click();
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h3[contains(.,' Company Request List')]"), "COMPANY REQUEST LIST"));
			CompanyRequest_page.company_request_logo(driver).isDisplayed();
			CompanyRequest_page.text_company_request(driver).isDisplayed();
			
			//Test Log out link
			Header_panel.link_logout(driver).click();
			Thread.sleep(30);
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[1]/div/div/div[2]/form/h4[1]"), "Email address"));
			
			
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 10, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 10, 2);
	    	ExcelUtils.setCellData("PASS", 10, 3);

		}
		 catch (TimeoutException toe){
	    	 	toe.printStackTrace();
				
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 10, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 10, 2);
		    	ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 10, 3);
			}
	     catch ( NoSuchElementException nfe){
	    	 	nfe.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 10, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 10, 2);
		    	ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 10, 3);
			}
	     	
	     catch ( ElementNotVisibleException enve){
	    	 	enve.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 10, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 10, 2);
		    	ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 10, 3);
			}
	     
	     catch ( Exception e){
	    	 	e.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 10, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 10, 2);
		    	ExcelUtils.setCellData(e.getClass().getCanonicalName(), 10, 3);
			}
	
	}*/
	
	
	@Test(testName= "Test Column under user panel")
	public static void test_column_name() throws Exception{
		ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output,"Sheet1");
		try{
			Header_panel.link_usermanagement(driver).click();
			Thread.sleep(30);
			Header_panel.link_usermanagement_user(driver).click();
			Thread.sleep(30);
			
			
			
			//Test Column Name
			Users_Page.column_text_name(driver).isDisplayed();
			String columnName = Users_Page.column_text_name(driver).getText();
			//Assert.assertEquals("Name", columnName);
			//org.testng.Assert.assertEquals(columnName, "Name");
			if ( columnName.matches("Name"))
			{
			    System.out.println("Column name is correct");
			}
			
			else
			{
				throw new Exception("text mismatch error");
				//System.out.println("New Company text mismatch error");
			}
			
			//Test Column Email
			Users_Page.column_text_email(driver).isDisplayed();
			String columnEmail = Users_Page.column_text_email(driver).getText();
			//Assert.assertEquals("Email", columnEmail);
			if ( columnEmail.matches("Email"))
			{
			    System.out.println("Column name is correct");
			}
			
			else
			{
				throw new Exception("text mismatch error");
				//System.out.println("New Company text mismatch error");
			}
			
			//Test Column Phone
			Users_Page.column_text_phone(driver).isDisplayed();
			String columnPhone = Users_Page.column_text_phone(driver).getText();
			//Assert.assertEquals("Phone", columnPhone);
			if ( columnPhone.matches("Phone"))
			{
			    System.out.println("Column name is correct");
			}
			
			else
			{
				throw new Exception("text mismatch error");
				//System.out.println("New Company text mismatch error");
			}
			
			//Test Column Job Saved
			Users_Page.column_text_job_saved(driver).isDisplayed();
			String columnJobSaved = Users_Page.column_text_job_saved(driver).getText();
			//Assert.assertEquals("Job Saved", columnJobSaved);
			if ( columnJobSaved.matches("Job Saved"))
			{
			    System.out.println("Column name is correct");
			}
			
			else
			{
				throw new Exception("text mismatch error");
				//System.out.println("New Company text mismatch error");
			}
			
			//Test Column Job Applied
			Users_Page.column_text_job_applied(driver).isDisplayed();
			String columnJobApplied = Users_Page.column_text_job_applied(driver).getText();
			//Assert.assertEquals("Job Applied", columnJobApplied);
			if ( columnJobApplied.matches("Job Applied"))
			{
			    System.out.println("Column name is correct");
			}
			
			else
			{
				throw new Exception("text mismatch error");
				//System.out.println("New Company text mismatch error");
			}
			
			//Test Column Follow Company
			Users_Page.column_text_follow_company(driver).isDisplayed();
			String columnFollowCompany = Users_Page.column_text_follow_company(driver).getText();
			//Assert.assertEquals("Follow Company", columnFollowCompany);
			if ( columnFollowCompany.matches("Follow Company"))
			{
			    System.out.println("Column name is correct");
			}
			
			else
			{
				throw new Exception("text mismatch error");
				//System.out.println("New Company text mismatch error");
			}
			
			//Test Column Date Register
			Users_Page.column_text_date_register(driver).isDisplayed();
			String columnDateRegister = Users_Page.column_text_date_register(driver).getText();
			//Assert.assertEquals("Date Register", columnDateRegister);
			if ( columnDateRegister.matches("Date Register"))
			{
			    System.out.println("Column name is correct");
			}
			
			else
			{
				throw new Exception("text mismatch error");
				//System.out.println("New Company text mismatch error");
			}
			
			//Test Column Facebook
			Users_Page.column_text_facebook(driver).isDisplayed();
			String columnFacebook = Users_Page.column_text_facebook(driver).getText();
			//Assert.assertEquals("Facebook", columnFacebook);
			if ( columnFacebook.matches("Facebook"))
			{
			    System.out.println("Column name is correct");
			}
			
			else
			{
				throw new Exception("text mismatch error");
				//System.out.println("New Company text mismatch error");
			}
			
			//Test Column CV
			Users_Page.column_text_cv(driver).isDisplayed();
			String columnCv = Users_Page.column_text_cv(driver).getText();
			//Assert.assertEquals("CV", columnCv);
			if ( columnCv.matches("CV"))
			{
			    System.out.println("Column name is correct");
			}
			
			else
			{
				throw new Exception("text mismatch error");
				//System.out.println("New Company text mismatch error");
			}
			
			//Test Column Actions
			Users_Page.column_text_actions(driver).isDisplayed();
			String columnActions = Users_Page.column_text_actions(driver).getText();
			//Assert.assertEquals("Actions", columnActions);
			if ( columnActions.matches("Actions"))
			{
			    System.out.println("Column name is correct");
			}
			
			else
			{
				throw new Exception("text mismatch error");
				//System.out.println("New Company text mismatch error");
			}
			
			
			
		ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 11, 1);
		ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 11, 2);
    	ExcelUtils.setCellData("PASS", 11, 3);

	}
	 catch (TimeoutException toe){
    	 	toe.printStackTrace();
			
		    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 11, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 11, 2);
	    	ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 11, 3);
		}
     catch ( NoSuchElementException nfe){
    	 	nfe.printStackTrace();
    	 	
		    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 11, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 11, 2);
	    	ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 11, 3);
		}
     	
     catch ( ElementNotVisibleException enve){
    	 	enve.printStackTrace();
    	 	
		    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 11, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 11, 2);
	    	ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 11, 3);
		}
     
     catch ( Exception e){
    	 	e.printStackTrace();
    	 	
		    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 11, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 11, 2);
	    	ExcelUtils.setCellData(e.getClass().getCanonicalName(), 11, 3);
		}
	}

}
