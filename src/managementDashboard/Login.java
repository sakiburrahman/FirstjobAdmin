package managementDashboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.corba.se.impl.orbutil.threadpool.TimeoutException;

import pageObjects.*;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

public class Login extends managementDashboard.BaseClass {

	
	 //protected static final TimeUnit SECONDS = null;

	private static final TimeUnit SECONDS = null;
	//private static String Classpackname = this.getClass().getName();

	/*@Test(testName ="Test Unsuccessful Login")
	 public static void test_Unsuccessful_Login_correct_email_wrong_password() throws Exception {
		String Workdir = System.getProperty("user.dir");
		String className = new Object(){}.getClass().getName();
		ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output,"Sheet1");
	     try {
	    	 String title = driver.getTitle();
		      System.out.print("\nCurrent page title is : "+ title + " ");
		      
		      
		     // ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		      String sUserName = ExcelUtils.getCellData(1, 1);
		      String sPassword = ExcelUtils.getCellData(1, 2);
		     // getSheetAt(0).getRow(1).getCell(2);
		     // wb.getSheetAt(0).getRow(9).getCell(4); 
		      System.out.println("\n " + sUserName);
		      System.out.println("\n " + sPassword);
		      
	    	Login_Page.input_field_email(driver).clear();
			Login_Page.input_field_email(driver).sendKeys(sUserName);
			Log.info(sUserName + " Username entered successfully");
			Login_Page.input_field_password(driver).clear();
			Login_Page.input_field_password(driver).sendKeys(sPassword);
			Log.info(sPassword + " Password entered successfully");
			Login_Page.button_signin(driver).click();
			WebDriverWait wait = new WebDriverWait(driver, 20);
		    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//li[contains(.,'These credentials do not match our records.')]"), "These credentials do not match our records."));
		    driver.findElement(By.xpath("//li[contains(.,'These credentials do not match our records.')]")).isDisplayed();
		    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 1, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 1, 2);
	    	ExcelUtils.setCellData("PASS", 1, 3);
	    	
			
	     }
	     
	     catch (TimeoutException toe){
	    	 	toe.printStackTrace();
				
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 1, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 1, 2);
		    	ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 1, 3);
			}
	     catch ( NoSuchElementException nfe){
	    	 	nfe.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 1, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 1, 2);
		    	ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 1, 3);
			}
	     	
	     catch ( ElementNotVisibleException enve){
	    	 	enve.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 1, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 1, 2);
		    	ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 1, 3);
			}
	     
	     catch ( Exception e){
	    	 	e.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 1, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 1, 2);
		    	ExcelUtils.setCellData(e.getClass().getCanonicalName(), 1, 3);
			}
	
	      
	}*/

	
	@Test(testName ="Test Successfull Login")
	 public static void test_Successful_Login() throws Exception {
	     
		String Workdir = System.getProperty("user.dir");
		String className = new Object(){}.getClass().getName();
		ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output,"Sheet1");
	     try {
	    	 String title = driver.getTitle();
		      System.out.print("\nCurrent page title is : "+ title + " ");
		      
		      
		     // ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		      String sUserName = ExcelUtils.getCellData(2, 1);
		      String sPassword = ExcelUtils.getCellData(2, 2);
		     // getSheetAt(0).getRow(1).getCell(2);
		     // wb.getSheetAt(0).getRow(9).getCell(4); 
		      System.out.println("\n " + sUserName);
		      System.out.println("\n " + sPassword);
		      
	    	Login_Page.input_field_email(driver).clear();
			Login_Page.input_field_email(driver).sendKeys(sUserName);
			Log.info(sUserName + " Username entered successfully");
			Login_Page.input_field_password(driver).clear();
			Login_Page.input_field_password(driver).sendKeys(sPassword);
			Log.info(sPassword + " Password entered successfully");
			Login_Page.button_signin(driver).click();
			WebDriverWait wait = new WebDriverWait(driver, 20);
		    wait.until(ExpectedConditions.textToBePresentInElement(Summary_Page.text_Dashboard(driver), "DASHBOARD"));
		    driver.findElement(By.xpath("//h3[contains(.,' Dashboard')]")).isDisplayed();
		    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 2, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 2, 2);
	    	ExcelUtils.setCellData("PASS", 2, 3);
			
	     }
	     
	     catch (TimeoutException toe){
	    	 	toe.printStackTrace();
				
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 2, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 2, 2);
		    	ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 2, 3);
			}
	     catch ( NoSuchElementException nfe){
	    	 	nfe.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 2, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 2, 2);
		    	ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 2, 3);
			}
	     	
	     catch ( ElementNotVisibleException enve){
	    	 	enve.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 2, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 2, 2);
		    	ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 2, 3);
			}
	     
	     catch ( Exception e){
	    	 	e.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 2, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 2, 2);
		    	ExcelUtils.setCellData(e.getClass().getCanonicalName(), 2, 3);
			}
			
	     
	}      
	
	
	/*@Test(testName ="Test Remember me checkbox is present or not")
	 public static void test_display_checkbox_remember_me() throws Exception {
	  
	      String Workdir = System.getProperty("user.dir");
	      //String Classpackname = this.getClass().getName();
	      String className = new Object(){}.getClass().getName();
	      
	      try {
			
	    	  if (Login_Page.checkbox_remember_me(driver).isDisplayed())
	    	  {
	    		  System.out.println("\n Remember me checkbox is displayed correctly");
	    	  }
	    	  
			else {
				
				System.out.println("\n Remember me checkbox is not displayed correctly");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			System.out.print("\n'"+Workdir+" -> "+className+" -> Exception ");
		}
	      
	}
	
	@Test(testName ="Test Remember me checkbox is clickable or not")
	 public static void test_clickable_checkbox_remember_me() throws Exception {
	  
	      String Workdir = System.getProperty("user.dir");
	      //String Classpackname = this.getClass().getName();
	      String className = new Object(){}.getClass().getName();
	      
	      try {
			
	    	  if (!Login_Page.checkbox_remember_me(driver).isSelected())
	    	  {
	    		  Login_Page.checkbox_remember_me(driver).click();
	    		  Thread.sleep(100);
	    		  System.out.println("\n Remember me chckbox is clickable"); 
	    	  }
			else {
				
				 System.out.println("\n Remember me chckbox is not clickable");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			System.out.print("\n'"+Workdir+" -> "+className+" -> Exception ");
		}
	      
	}
	
	@Test(testName ="Test forgot password link is present or not")
	 public static void test_display_link_forgot_password() throws Exception {
	  
	      String Workdir = System.getProperty("user.dir");
	      //Classpackname = this.getClass().getName();
	      String className = new Object(){}.getClass().getName();
	      
	      try {
			
	    	  if (Login_Page.link_forgot_password(driver).isDisplayed())
	    	  {
	    		  System.out.println("\n Forgot password link is displayed correctly");
	    	  }
	    	  
			else {
				
				System.out.println("\n Forgot password link is not displayed correctly");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			System.out.print("\n'"+Workdir+" -> "+className +" -> Exception ");
		}
	      
	}
	
	@Test(testName ="Test Forgot password link is clickable or not")
	 public static void test_clickable_link_forgot_password() throws Exception {
	  
	      String Workdir = System.getProperty("user.dir");
	      String className = new Object(){}.getClass().getName();
	      
	      try {
			
	    	  if (!Login_Page.link_forgot_password(driver).isEnabled())
	    	  {
	    		  Login_Page.link_forgot_password(driver).click();
	    		  Thread.sleep(100);
	    		  System.out.println("\n Forgot password link is clickable"); 
	    	  }
			else {
				
				 System.out.println("\n Forgot password link is not clickable");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			System.out.print("\n'"+Workdir+" -> "+className +" -> Exception ");
		}
	      
	}
	
	@Test(testName ="Test Firstjob logo")
	 public static void firstjoblogo() throws Exception {
	  
	      String Workdir = System.getProperty("user.dir");
	      String className = new Object(){}.getClass().getName();
	      
	      try {
	    	  
			
	    	  if (Login_Page.firstjoblogo(driver).isDisplayed())
	    	  {
	    		  //Login_Page.link_forgot_password(driver).click();
	    		  Thread.sleep(100);
	    		  System.out.println("\n Firstjob logo found"); 
	    	  }
			else {
				
				 System.out.println("\n Firstjob logo is not found");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			System.out.print("\n'"+Workdir+ " -> "+className +" -> Exception ");
		}
	      
	}
	
	@Test(testName ="Test email placeholder text")
	 public static void email_placeholder_text() throws Exception {
	  
	      String Workdir = System.getProperty("user.dir");
	      String className = new Object(){}.getClass().getName();
	      
	      try {
	    	  
			
	    	  if (Login_Page.input_field_email(driver).getAttribute("placeholder").matches("Email address"))
	    	  {
	    		  //Login_Page.link_forgot_password(driver).click();
	    		  Thread.sleep(100);
	    		  System.out.println("\n Email placeholder text is correct"); 
	    	  }
			else {
				
				 System.out.println("\n Email placeholder text is not corect");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			System.out.print("\n'"+Workdir+ " -> "+className +" -> Exception ");
		}
	      
	}
	
	@Test(testName ="Test password placeholder text")
	 public static void password_placeholder_text() throws Exception {
	  
	      String Workdir = System.getProperty("user.dir");
	      String className = new Object(){}.getClass().getName();
	      
	      try {
	    	  
			
	    	  if (Login_Page.input_field_password(driver).getAttribute("placeholder").matches("Password"))
	    	  {
	    		  //Login_Page.link_forgot_password(driver).click();
	    		  Thread.sleep(100);
	    		  System.out.println("\n Password placeholder text is correct"); 
	    	  }
			else {
				
				 System.out.println("\n Password placeholder text is not corect");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			System.out.print("\n'"+Workdir+ " -> "+className +" -> Exception ");
		}
	      
	}*/
	 
	 
}
