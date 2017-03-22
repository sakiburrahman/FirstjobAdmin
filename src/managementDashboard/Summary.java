package managementDashboard;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.corba.se.impl.orbutil.threadpool.TimeoutException;
//import com.thoughtworks.selenium.Selenium;

import pageObjects.Jobs_Page;
import pageObjects.Login_Page;
import pageObjects.Summary_Page;
import pageObjects.Users_Page;
import utility.Constant;
import utility.ExcelUtils;
import managementDashboard.*;
import utility.*;
import pageObjects.Company_Page;


public class Summary extends managementDashboard.BaseClass{
	
	private static final TimeUnit SECONDS = null;
	
	
	@Test(testName ="Test users panel")
	public static void test_users_panel() throws Exception{
		ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output,"Sheet1");
		
		try{
			
			
			Summary_Page.text_view_details_from_users_panel(driver).isDisplayed();
			String view_details = Summary_Page.text_view_details_from_users_panel(driver).getText();
			System.out.println(view_details);
			Assert.assertEquals("View Details", view_details);
			Summary_Page.text_users_from_users_panel(driver).isDisplayed();
			String users = Summary_Page.text_users_from_users_panel(driver).getText();
			System.out.println(users);
			Assert.assertEquals("Users", users);
			
			Summary_Page.number_from_users_panel(driver).isDisplayed();
			String number = Summary_Page.number_from_users_panel(driver).getText();
			
			//Assert.assertEquals(number.matches("[0-9]{5}"), number);
			number.matches("[0-9]{5}");
			//Assert.ass
			//assertThat("FooBarBaz", matchesPattern("^Foo"));
			//Assert.assertEquals("regexp:^[0-9]*$", number);
			//Assert.assertTrue(number.matches("[0-9]{5}"));
			
			//Summary_Page.text_view_details_from_users_panel(driver).click();
			
			Summary_Page.text_view_details_from_users_panel(driver).click();
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.textToBePresentInElement(Users_Page.text_users_list(driver), "USER LIST"));
		    Users_Page.text_users_list(driver).isDisplayed();
		    String user_list = Users_Page.text_users_list(driver).getText();
			System.out.println(user_list);
			Assert.assertEquals("USER LIST", user_list);
			driver.navigate().back();
			Summary_Page.text_Dashboard(driver).isDisplayed();
			Summary_Page.arrow_sign_from_users_panel(driver).click();
			driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
			Users_Page.text_users_list(driver).isDisplayed();
			Assert.assertEquals("USER LIST", user_list);
			
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 3, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 3, 2);
	    	ExcelUtils.setCellData("PASS", 3, 3);

		}
		 catch (TimeoutException toe){
	    	 	toe.printStackTrace();
				
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 3, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 3, 2);
		    	ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 3, 3);
			}
	     catch ( NoSuchElementException nfe){
	    	 	nfe.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 3, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 3, 2);
		    	ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 3, 3);
			}
	     	
	     catch ( ElementNotVisibleException enve){
	    	 	enve.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 3, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 3, 2);
		    	ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 3, 3);
			}
	     
	     catch ( Exception e){
	    	 	e.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 3, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 3, 2);
		    	ExcelUtils.setCellData(e.getClass().getCanonicalName(), 3, 3);
			}
	
	}
	

	@Test(testName ="Test Jobs panel")
	public static void test_jobs_panel() throws Exception{
		ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output,"Sheet1");
		
		try{
			
			
			Summary_Page.text_view_details_from_jobs_panel(driver).isDisplayed();
			String view_details = Summary_Page.text_view_details_from_jobs_panel(driver).getText();
			System.out.println(view_details);
			Assert.assertEquals("View Details", view_details);
			Summary_Page.text_jobs_from_jobs_panel(driver).isDisplayed();
			String jobs = Summary_Page.text_jobs_from_jobs_panel(driver).getText();
			System.out.println(jobs);
			Assert.assertEquals("Jobs", jobs);
			
			Summary_Page.number_from_jobs_panel(driver).isDisplayed();
			String number = Summary_Page.number_from_jobs_panel(driver).getText();
			
			//Assert.assertEquals(number.matches("[0-9]{5}"), number);
			number.matches("[0-9]{5}");
			//Assert.ass
			//assertThat("FooBarBaz", matchesPattern("^Foo"));
			//Assert.assertEquals("regexp:^[0-9]*$", number);
			//Assert.assertTrue(number.matches("[0-9]{5}"));
			
			//Summary_Page.text_view_details_from_users_panel(driver).click();
			
			Summary_Page.text_view_details_from_jobs_panel(driver).click();
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.textToBePresentInElement(Jobs_Page.text_jobs_list(driver), "JOB LIST"));
			Jobs_Page.text_jobs_list(driver).isDisplayed();
		    String job_list = Jobs_Page.text_jobs_list(driver).getText();
			System.out.println(job_list);
			Assert.assertEquals("JOB LIST", job_list);
			driver.navigate().back();
			Summary_Page.text_Dashboard(driver).isDisplayed();
			Summary_Page.arrow_sign_from_jobs_panel(driver).click();
			driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
			Jobs_Page.text_jobs_list(driver).isDisplayed();
			Assert.assertEquals("JOB LIST", job_list);
			
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 4, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 4, 2);
	    	ExcelUtils.setCellData("PASS", 4, 3);

		}
		 catch (TimeoutException toe){
	    	 	toe.printStackTrace();
				
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 4, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 4, 2);
		    	ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 4, 3);
			}
	     catch ( NoSuchElementException nfe){
	    	 	nfe.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 4, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 4, 2);
		    	ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 4, 3);
			}
	     	
	     catch ( ElementNotVisibleException enve){
	    	 	enve.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 4, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 4, 2);
		    	ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 4, 3);
			}
	     
	     catch ( Exception e){
	    	 	e.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 4, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 4, 2);
		    	ExcelUtils.setCellData(e.getClass().getCanonicalName(), 4, 3);
			}
	
	}
	
	@Test(testName ="Test companies panel")
	public static void test_companies_panel() throws Exception{
		ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output,"Sheet1");
		
		try{
			
			
			Summary_Page.text_view_details_from_jobs_panel(driver).isDisplayed();
			String view_details = Summary_Page.text_view_details_from_companies_panel(driver).getText();
			System.out.println(view_details);
			Assert.assertEquals("View Details", view_details);
			Summary_Page.text_companies_from_companies_panel(driver).isDisplayed();
			String companies = Summary_Page.text_companies_from_companies_panel(driver).getText();
			System.out.println(companies );
			Assert.assertEquals("Companies", companies );
			
			Summary_Page.number_from_companies_panel(driver).isDisplayed();
			String number = Summary_Page.number_from_jobs_panel(driver).getText();
			
			//Assert.assertEquals(number.matches("[0-9]{5}"), number);
			number.matches("[0-9]{5}");
			//Assert.ass
			//assertThat("FooBarBaz", matchesPattern("^Foo"));
			//Assert.assertEquals("regexp:^[0-9]*$", number);
			//Assert.assertTrue(number.matches("[0-9]{5}"));
			
			//Summary_Page.text_view_details_from_users_panel(driver).click();
			
			Summary_Page.text_view_details_from_companies_panel(driver).click();
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.textToBePresentInElement(Company_Page.text_Company_list(driver), "COMPANY LIST"));
			Company_Page.text_Company_list(driver).isDisplayed();
		    String company_list = Company_Page.text_Company_list(driver).getText();
			System.out.println(company_list);
			Assert.assertEquals("COMPANY LIST", company_list);
			driver.navigate().back();
			Summary_Page.text_Dashboard(driver).isDisplayed();
			Summary_Page.arrow_sign_from_companies_panel(driver).click();
			driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
			Jobs_Page.text_jobs_list(driver).isDisplayed();
			Assert.assertEquals("COMPANY LIST", company_list);
			
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 5, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 5, 2);
	    	ExcelUtils.setCellData("PASS", 5, 3);

		}
		 catch (TimeoutException toe){
	    	 	toe.printStackTrace();
				
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 5, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 5, 2);
		    	ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 5, 3);
			}
	     catch ( NoSuchElementException nfe){
	    	 	nfe.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 5, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 5, 2);
		    	ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 5, 3);
			}
	     	
	     catch ( ElementNotVisibleException enve){
	    	 	enve.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 5, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 5, 2);
		    	ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 5, 3);
			}
	     
	     catch ( Exception e){
	    	 	e.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 5, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 5, 2);
		    	ExcelUtils.setCellData(e.getClass().getCanonicalName(), 5, 3);
			}
	
	}
	
	@Test(testName ="Test notification panel")
	public static void test_notification_panel() throws Exception{
		ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output,"Sheet1");
		
		try{
			
			
			Summary_Page.text_notification_panel_from_notification_panel(driver).isDisplayed();
			String notification_panel = Summary_Page.text_notification_panel_from_notification_panel(driver).getText();
			Assert.assertEquals(notification_panel, "Notification Panel");
			
			Calendar cal = Calendar.getInstance();
			String current_date ="Today" + " " + "(" + new SimpleDateFormat("d").format(cal.getTime())+"th " + new SimpleDateFormat("MMMMMMMMMMMMM").format(cal.getTime()) + ")";
			System.out.println(current_date);
			
			String today = Summary_Page.text_today_from_notification_panel(driver).getText();
			Assert.assertEquals(today, current_date);
			

			String string_today_newuser = Summary_Page.list_new_user_from_today_secton_under_notification_panel(driver).getText();
			
			String string_today_newcompany= Summary_Page.list_new_company_from_today_secton_under_notification_panel(driver).getText();
			
			String string_today_newjob= Summary_Page.list_new_job_from_today_secton_under_notification_panel(driver).getText();
			
			String string_today_jobapplied= Summary_Page.list_job_applied_from_today_secton_under_notification_panel(driver).getText();
			
			if ( Character.isDigit(string_today_newuser.charAt(0)) && string_today_newuser.endsWith("User") )
			{
			    System.out.println("Text begins with a digit and ends with a text User");
			}
			
			else
			{
				throw new Exception("New User text mismatch error");
				//System.out.println("New User text mismatch error");
			}
			
			if ( Character.isDigit(string_today_newcompany.charAt(0)) && string_today_newcompany.endsWith("Company") )
			{
			    System.out.println("Text begins with a digit and ends with a text Company");
			}
			
			else
			{
				throw new Exception("New Company text mismatch error");
				//System.out.println("New Company text mismatch error");
			}
			
			
			if ( Character.isDigit(string_today_newjob.charAt(0)) && string_today_newjob.endsWith("Job") )
			{
			    System.out.println("Text begins with a digit and ends with a text Job");
			}
			
			else
			{
				throw new Exception("New Job text mismatch error");
				//System.out.println("New Job text mismatch error");
			}
			
			if ( Character.isDigit(string_today_jobapplied.charAt(0)) && string_today_jobapplied.endsWith("Applied") )
			{
			    System.out.println("Text begins with a digit and ends with a text Applied");
			}
			
			else
			{
				throw new Exception("Job Applied text mismatch error");
				//System.out.println("Job Applied text mismatch error");
			}
			
		    String week_last_date = new SimpleDateFormat("d").format(cal.getTime())+"th " + new SimpleDateFormat("MMMMMMMMMMMMM").format(cal.getTime());
		    System.out.println(week_last_date);
	        cal.add(Calendar.DATE, - 6);
			String first_date_of_week = new SimpleDateFormat("d").format(cal.getTime())+"th " + new SimpleDateFormat("MMMMMMMMMMMMM").format(cal.getTime());
			System.out.println(first_date_of_week);
			String current_week ="This Week" + " " + "(" + first_date_of_week + " - " + week_last_date + ")";
			System.out.println(current_week);
			String week = Summary_Page.text_this_week_from_notification_panel(driver).getText();
			Assert.assertEquals(week, current_week);
			
			String string_this_week_newuser = Summary_Page.list_new_user_from_this_week_secton_under_notification_panel(driver).getText();
			
			String string_this_week_newcompany= Summary_Page.list_new_company_from_this_week_secton_under_notification_panel(driver).getText();
			
			String string_this_week_newjob= Summary_Page.list_new_job_from_this_week_secton_under_notification_panel(driver).getText();
			
			String string_this_week_jobapplied= Summary_Page.list_job_applied_from_this_week_secton_under_notification_panel(driver).getText();
			
			if ( Character.isDigit(string_this_week_newuser.charAt(0)) && string_this_week_newuser.endsWith("User") )
			{
			    System.out.println("Text begins with a digit and ends with a text User");
			}
			
			else
			{
				throw new Exception("New User text mismatch error");
				//System.out.println("New User text mismatch error");
			}
			
			if ( Character.isDigit(string_this_week_newcompany.charAt(0)) && string_this_week_newcompany.endsWith("Company") )
			{
			    System.out.println("Text begins with a digit and ends with a text Company");
			}
			
			else
			{
				throw new Exception("New Company text mismatch error");
				//System.out.println("New Company text mismatch error");
			}
			
			
			if ( Character.isDigit(string_this_week_newjob.charAt(0)) && string_this_week_newjob.endsWith("Job") )
			{
			    System.out.println("Text begins with a digit and ends with a text Job");
			}
			
			else
			{
				throw new Exception("New Job text mismatch error");
				//System.out.println("New Job text mismatch error");
			}
			
			if ( Character.isDigit(string_this_week_jobapplied.charAt(0)) && string_this_week_jobapplied.endsWith("Applied") )
			{
			    System.out.println("Text begins with a digit and ends with a text Applied");
			}
			
			else
			{
				throw new Exception("Job Applied text mismatch error");
				//System.out.println("Job Applied text mismatch error");
			}
			
			String current_month ="This Month" + " "+ "(" + new SimpleDateFormat("MMMMMMMMMMMMM").format(cal.getTime()) + " " + cal.get(Calendar.YEAR) + ")";
			String month = Summary_Page.text_month_from_notification_panel(driver).getText();
			Assert.assertEquals(month, current_month);
			
			String string_this_month_newuser = Summary_Page.list_new_user_from_this_month_secton_under_notification_panel(driver).getText();
			
			String string_this_month_newcompany= Summary_Page.list_new_company_from_this_month_secton_under_notification_panel(driver).getText();
			
			String string_this_month_newjob= Summary_Page.list_new_job_from_this_month_secton_under_notification_panel(driver).getText();
			
			String string_this_month_jobapplied= Summary_Page.list_job_applied_from_this_month_secton_under_notification_panel(driver).getText();
			
			if ( Character.isDigit(string_this_month_newuser.charAt(0)) && string_this_month_newuser.endsWith("User") )
			{
			    System.out.println("Text begins with a digit and ends with a text User");
			}
			
			else
			{
				throw new Exception("New User text mismatch error");
				//System.out.println("New User text mismatch error");
			}
			
			if ( Character.isDigit(string_this_month_newcompany.charAt(0)) && string_this_month_newcompany.endsWith("Company") )
			{
			    System.out.println("Text begins with a digit and ends with a text Company");
			}
			
			else
			{
				throw new Exception("New Company text mismatch error");
				//System.out.println("New Company text mismatch error");
			}
			
			if ( Character.isDigit(string_this_month_newjob.charAt(0)) && string_this_month_newjob.endsWith("Job") )
			{
			    System.out.println("Text begins with a digit and ends with a text Job");
			}
			
			else
			{
				throw new Exception("New Job text mismatch error");
				//System.out.println("New Job text mismatch error");
			}
			
			if ( Character.isDigit(string_this_month_jobapplied.charAt(0)) && string_this_month_jobapplied.endsWith("Applied") )
			{
			    System.out.println("Text begins with a digit and ends with a text Applied");
			}
			
			else
			{
				throw new Exception("Job Applied text mismatch error");
				//System.out.println("Job Applied text mismatch error");
			}
			
			Summary_Page.text_popular_jobs_from_popular_jobs_panel(driver).isDisplayed();
			String popular_jobs_panel = Summary_Page.text_popular_jobs_from_popular_jobs_panel(driver).getText();
			Assert.assertEquals(popular_jobs_panel, "Popular Jobs");
			
			String string_job_name = Summary_Page.list_job_name_from_popular_jobs_panel(driver).getText();
			Assert.assertEquals(string_job_name, "Job Name");
			
			String string_total_applied_popular_jobs = Summary_Page.list_total_applied_from_popular_jobs_panel(driver).getText();
			Assert.assertEquals(string_total_applied_popular_jobs, "Total Applied");
			
			String string_company_popular_jobs = Summary_Page.list_company_from_popular_jobs_panel(driver).getText();
			Assert.assertEquals(string_company_popular_jobs, "Company");
			
			String string_expired_date = Summary_Page.list_expired_date_from_popular_jobs_panel(driver).getText();
			Assert.assertEquals(string_expired_date, "Expired Date");
			
			Summary_Page.text_popular_companies_from_popular_companies_panel(driver).isDisplayed();
			String popular_companies_panel = Summary_Page.text_popular_companies_from_popular_companies_panel(driver).getText();
			Assert.assertEquals(popular_companies_panel, "Popular Companies");
			
			String string_company_popular_companies = Summary_Page.list_comapny_from_popular_companies_panel(driver).getText();
			Assert.assertEquals(string_company_popular_companies, "Company");
			
			String string_total_applied_popular_companies = Summary_Page.list_total_applied_from_popular_companies_panel(driver).getText();
			Assert.assertEquals(string_total_applied_popular_companies, "Total Applied");
			
			String string_total_jobs = Summary_Page.list_total_jobs_from_popular_companies_panel(driver).getText();
			Assert.assertEquals(string_total_jobs, "Total Jobs");
			
			//Check copyright text
			
			String string_copyright = Summary_Page.text_copyright_statement(driver).getText();
			System.out.println(string_copyright);
			Assert.assertEquals(string_copyright, "Copyright 2016 © All rights reserved for FirstJob BD.");
			
			
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 6, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 6, 2);
	    	ExcelUtils.setCellData("PASS", 6, 3);

		}
		 catch (TimeoutException toe){
	    	 	toe.printStackTrace();
				
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 6, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 6, 2);
		    	ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 6, 3);
			}
	     catch ( NoSuchElementException nfe){
	    	 	nfe.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 6, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 6, 2);
		    	ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 6, 3);
			}
	     	
	     catch ( ElementNotVisibleException enve){
	    	 	enve.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 6, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 6, 2);
		    	ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 6, 3);
			}
	     
	     catch ( Exception e){
	    	 	e.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 6, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 6, 2);
		    	ExcelUtils.setCellData(e.getClass().getCanonicalName(), 6, 3);
			}
	
	}
	
	@Test(testName ="Test Popular Jobs panel")
	public static void test_Popular_Jobs_panel() throws Exception{
		ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output,"Sheet1");
		
		try{
			
			Summary_Page.text_popular_jobs_from_popular_jobs_panel(driver).isDisplayed();
			String popular_jobs_panel = Summary_Page.text_popular_jobs_from_popular_jobs_panel(driver).getText();
			Assert.assertEquals(popular_jobs_panel, "Popular Jobs");
			
			String string_job_name = Summary_Page.list_job_name_from_popular_jobs_panel(driver).getText();
			Assert.assertEquals(string_job_name, "Job Name");
			
			String string_total_applied_popular_jobs = Summary_Page.list_total_applied_from_popular_jobs_panel(driver).getText();
			Assert.assertEquals(string_total_applied_popular_jobs, "Total Applied");
			
			String string_company_popular_jobs = Summary_Page.list_company_from_popular_jobs_panel(driver).getText();
			Assert.assertEquals(string_company_popular_jobs, "Company");
			
			String string_expired_date = Summary_Page.list_expired_date_from_popular_jobs_panel(driver).getText();
			Assert.assertEquals(string_expired_date, "Expired Date");
			
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 7, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 7, 2);
	    	ExcelUtils.setCellData("PASS", 7, 3);

		}
		 catch (TimeoutException toe){
	    	 	toe.printStackTrace();
				
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 7, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 7, 2);
		    	ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 7, 3);
			}
	     catch ( NoSuchElementException nfe){
	    	 	nfe.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 7, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 7, 2);
		    	ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 7, 3);
			}
	     	
	     catch ( ElementNotVisibleException enve){
	    	 	enve.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 7, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 7, 2);
		    	ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 7, 3);
			}
	     
	     catch ( Exception e){
	    	 	e.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 7, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 7, 2);
		    	ExcelUtils.setCellData(e.getClass().getCanonicalName(), 7, 3);
			}
	
	}
	
	@Test(testName ="Test Popular Companies panel")
	public static void test_Popular_Companies_panel() throws Exception{
		ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output,"Sheet1");
		
		try{
			
			Summary_Page.text_popular_companies_from_popular_companies_panel(driver).isDisplayed();
			String popular_companies_panel = Summary_Page.text_popular_companies_from_popular_companies_panel(driver).getText();
			Assert.assertEquals(popular_companies_panel, "Popular Companies");
			
			String string_company_popular_companies = Summary_Page.list_comapny_from_popular_companies_panel(driver).getText();
			Assert.assertEquals(string_company_popular_companies, "Company");
			
			String string_total_applied_popular_companies = Summary_Page.list_total_applied_from_popular_companies_panel(driver).getText();
			Assert.assertEquals(string_total_applied_popular_companies, "Total Applied");
			
			String string_total_jobs = Summary_Page.list_total_jobs_from_popular_companies_panel(driver).getText();
			Assert.assertEquals(string_total_jobs, "Total Jobs");
			
			
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 8, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 8, 2);
	    	ExcelUtils.setCellData("PASS", 8, 3);

		}
		 catch (TimeoutException toe){
	    	 	toe.printStackTrace();
				
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 8, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 8, 2);
		    	ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 8, 3);
			}
	     catch ( NoSuchElementException nfe){
	    	 	nfe.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 8, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 8, 2);
		    	ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 8, 3);
			}
	     	
	     catch ( ElementNotVisibleException enve){
	    	 	enve.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 8, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 8, 2);
		    	ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 8, 3);
			}
	     
	     catch ( Exception e){
	    	 	e.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 8, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 8, 2);
		    	ExcelUtils.setCellData(e.getClass().getCanonicalName(), 8, 3);
			}
	
	}
	
	@Test(testName ="Test Copyright Statement")
	public static void test_Copyright_panel() throws Exception{
		ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output,"Sheet1");
		
		try{
			
			//Check copyright text
			Summary_Page.text_copyright_statement(driver).isDisplayed();
			String string_copyright = Summary_Page.text_copyright_statement(driver).getText();
			System.out.println(string_copyright);
			Assert.assertEquals(string_copyright, "Copyright 2016 © All rights reserved for FirstJob BD.");
			
			
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 9, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 9, 2);
	    	ExcelUtils.setCellData("PASS", 9, 3);

		}
		 catch (TimeoutException toe){
	    	 	toe.printStackTrace();
				
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 9, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 9, 2);
		    	ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 9, 3);
			}
	     catch ( NoSuchElementException nfe){
	    	 	nfe.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 9, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 9, 2);
		    	ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 9, 3);
			}
	     	
	     catch ( ElementNotVisibleException enve){
	    	 	enve.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 9, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 9, 2);
		    	ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 9, 3);
			}
	     
	     catch ( Exception e){
	    	 	e.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 9, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 9, 2);
		    	ExcelUtils.setCellData(e.getClass().getCanonicalName(), 9, 3);
			}
	
	}



}
