package managementDashboard;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.List;

import com.sun.corba.se.impl.orbutil.threadpool.TimeoutException;

import pageObjects.Country_Page;
import pageObjects.Header_panel;
import utility.Constant;
import utility.ExcelUtils;

public class SetupCountry extends managementDashboard.BaseClass {

	/*
	 * @Test(testName= "Test add country successfully") public static void
	 * test_add_country() throws Exception{
	 * ExcelUtils.setExcelFile(Constant.Path_Test_Output +
	 * Constant.File_Test_Output,"Sheet1");
	 * 
	 * try{ WebDriverWait wait = new WebDriverWait(driver, 20);
	 * Header_panel.link_setup(driver).click(); Thread.sleep(30);
	 * Header_panel.link_setup_country(driver).click();
	 * wait.until(ExpectedConditions.textToBePresentInElementLocated(By.
	 * xpath("//h3[contains(.,' Country List')]"), "COUNTRY LIST"));
	 * Country_Page.country_list_logo(driver).isDisplayed();
	 * Country_Page.text_country_list(driver).isDisplayed();
	 * Country_Page.button_create_country(driver).isDisplayed();
	 * Country_Page.button_create_country(driver).isEnabled();
	 * Country_Page.button_create_country(driver).click();
	 * wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(
	 * "//div[1]/section/div[3]/div/div/div[1]/h4"), "Create Country"));
	 * 
	 * //Verify text Code Country_Page.text_code(driver).isDisplayed(); String
	 * code = Country_Page.text_code(driver).getText(); if (
	 * code.matches("Code")) {
	 * System.out.println("Input field name is correct"); }
	 * 
	 * else { throw new Exception("text mismatch error");
	 * //System.out.println("New Company text mismatch error"); }
	 * 
	 * //Verify text Name Country_Page.text_name(driver).isDisplayed(); String
	 * name = Country_Page.text_name(driver).getText(); if (
	 * name.matches("Name")) {
	 * System.out.println("Input field name is correct"); }
	 * 
	 * else { throw new Exception("text mismatch error");
	 * //System.out.println("New Company text mismatch error"); }
	 * 
	 * //Enter input into input fields and add country
	 * Country_Page.input_field_code(driver).sendKeys("AAFF");
	 * Country_Page.input_field_name(driver).sendKeys("12345g678Affganistan");
	 * Country_Page.button_save(driver).click(); Thread.sleep(500);
	 * //((JavascriptExecutor) driver).executeScript("arguments[0].click()",
	 * Country_Page.text_alart(driver)); //Alert confirmationAlert =
	 * driver.switchTo().alert();
	 * wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(
	 * "//div[contains(@role,'alert')]"),"Country Successfully Added"));
	 * //wait.until(ExpectedConditions.alertIsPresent());
	 * Country_Page.messagebox_alart(driver).isDisplayed();
	 * 
	 * //Alert alert = driver.switchTo().alert(); //String stringAlert =
	 * alert.getText(); //System.out.println(stringAlert); //alert.accept();
	 * 
	 * //String stringAlert = alert.getText(); String stringAlert =
	 * Country_Page.text_alart(driver).getText();
	 * 
	 * //stringAlert.matches("Country Successfully Added"); if (
	 * stringAlert.matches("Country Successfully Added")) {
	 * System.out.println("Alart message is correct");
	 * //wait.until(ExpectedConditions.stalenessOf(Country_Page.messagebox_alart
	 * (driver))); }
	 * 
	 * else { throw new Exception("text mismatch error");
	 * //System.out.println("New Company text mismatch error"); }
	 * 
	 * 
	 * 
	 * ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(),
	 * 12, 1); ExcelUtils.setCellData(new
	 * Exception().getStackTrace()[0].getMethodName(), 12, 2);
	 * ExcelUtils.setCellData("PASS", 12, 3);
	 * 
	 * } catch (TimeoutException toe){ toe.printStackTrace();
	 * 
	 * ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(),
	 * 12, 1); ExcelUtils.setCellData(new
	 * Exception().getStackTrace()[0].getMethodName(), 12, 2);
	 * ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 12, 3); } catch
	 * ( NoSuchElementException nfe){ nfe.printStackTrace();
	 * 
	 * ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(),
	 * 12, 1); ExcelUtils.setCellData(new
	 * Exception().getStackTrace()[0].getMethodName(), 12, 2);
	 * ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 12, 3); }
	 * 
	 * catch ( ElementNotVisibleException enve){ enve.printStackTrace();
	 * 
	 * ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(),
	 * 12, 1); ExcelUtils.setCellData(new
	 * Exception().getStackTrace()[0].getMethodName(), 12, 2);
	 * ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 12, 3); }
	 * 
	 * catch ( Exception e){ e.printStackTrace();
	 * 
	 * ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(),
	 * 12, 1); ExcelUtils.setCellData(new
	 * Exception().getStackTrace()[0].getMethodName(), 12, 2);
	 * ExcelUtils.setCellData(e.getClass().getCanonicalName(), 12, 3); } }
	 * 
	 * 
	 * @Test(testName= "Test Error alert messages") public static void
	 * test_inputfield_validation() throws Exception{
	 * ExcelUtils.setExcelFile(Constant.Path_Test_Output +
	 * Constant.File_Test_Output,"Sheet1");
	 * 
	 * try{ WebDriverWait wait = new WebDriverWait(driver, 20);
	 * Header_panel.link_setup(driver).click(); Thread.sleep(30);
	 * Header_panel.link_setup_country(driver).click();
	 * wait.until(ExpectedConditions.textToBePresentInElementLocated(By.
	 * xpath("//h3[contains(.,' Country List')]"), "COUNTRY LIST"));
	 * Country_Page.country_list_logo(driver).isDisplayed();
	 * Country_Page.text_country_list(driver).isDisplayed();
	 * Country_Page.button_create_country(driver).isDisplayed();
	 * Country_Page.button_create_country(driver).isEnabled();
	 * Country_Page.button_create_country(driver).click();
	 * wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(
	 * "//div[1]/section/div[3]/div/div/div[1]/h4"), "Create Country"));
	 * 
	 * //Click Save button with out entering input
	 * 
	 * Country_Page.button_save(driver).click(); Thread.sleep(500);
	 * 
	 * 
	 * Alert alert = driver.switchTo().alert(); String stringAlert =
	 * alert.getText(); System.out.println(stringAlert); alert.accept();
	 * 
	 * //stringAlert.matches("Country Successfully Added"); if (
	 * stringAlert.matches("Country Code and Name is required")) {
	 * System.out.println("Error Alart message is correct");
	 * //wait.until(ExpectedConditions.stalenessOf(Country_Page.messagebox_alart
	 * (driver))); }
	 * 
	 * else { throw new Exception("text mismatch error");
	 * //System.out.println("New Company text mismatch error"); }
	 * 
	 * 
	 * 
	 * ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(),
	 * 13, 1); ExcelUtils.setCellData(new
	 * Exception().getStackTrace()[0].getMethodName(), 13, 2);
	 * ExcelUtils.setCellData("PASS", 13, 3);
	 * 
	 * } catch (TimeoutException toe){ toe.printStackTrace();
	 * 
	 * ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(),
	 * 13, 1); ExcelUtils.setCellData(new
	 * Exception().getStackTrace()[0].getMethodName(), 13, 2);
	 * ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 13, 3); } catch
	 * ( NoSuchElementException nfe){ nfe.printStackTrace();
	 * 
	 * ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(),
	 * 13, 1); ExcelUtils.setCellData(new
	 * Exception().getStackTrace()[0].getMethodName(), 13, 2);
	 * ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 13, 3); }
	 * 
	 * catch ( ElementNotVisibleException enve){ enve.printStackTrace();
	 * 
	 * ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(),
	 * 13, 1); ExcelUtils.setCellData(new
	 * Exception().getStackTrace()[0].getMethodName(), 13, 2);
	 * ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 13, 3); }
	 * 
	 * catch ( Exception e){ e.printStackTrace();
	 * 
	 * ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(),
	 * 13, 1); ExcelUtils.setCellData(new
	 * Exception().getStackTrace()[0].getMethodName(), 13, 2);
	 * ExcelUtils.setCellData(e.getClass().getCanonicalName(), 13, 3); } }
	 * 
	 * 
	 * @Test(testName= "Test Close Button") public static void
	 * test_close_button() throws Exception{
	 * ExcelUtils.setExcelFile(Constant.Path_Test_Output +
	 * Constant.File_Test_Output,"Sheet1");
	 * 
	 * try{ WebDriverWait wait = new WebDriverWait(driver, 20);
	 * Header_panel.link_setup(driver).click(); Thread.sleep(30);
	 * Header_panel.link_setup_country(driver).click();
	 * wait.until(ExpectedConditions.textToBePresentInElementLocated(By.
	 * xpath("//h3[contains(.,' Country List')]"), "COUNTRY LIST"));
	 * Country_Page.country_list_logo(driver).isDisplayed();
	 * Country_Page.text_country_list(driver).isDisplayed();
	 * Country_Page.button_create_country(driver).isDisplayed();
	 * Country_Page.button_create_country(driver).isEnabled();
	 * Country_Page.button_create_country(driver).click();
	 * wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(
	 * "//div[1]/section/div[3]/div/div/div[1]/h4"), "Create Country"));
	 * 
	 * //Test Close button doesn not save any data
	 * Country_Page.input_field_code(driver).sendKeys("BD123");
	 * Country_Page.input_field_name(driver).sendKeys("Bangladesh123");
	 * Country_Page.button_close(driver).click(); Thread.sleep(500);
	 * Country_Page.country_list_logo(driver).isDisplayed();
	 * Country_Page.text_country_list(driver).isDisplayed();
	 * Country_Page.button_create_country(driver).isDisplayed();
	 * 
	 * //Again click Create Country
	 * Country_Page.button_create_country(driver).click();
	 * wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(
	 * "//div[1]/section/div[3]/div/div/div[1]/h4"), "Create Country")); //Now
	 * click on (X) icon Country_Page.icon_close(driver).click();
	 * Thread.sleep(500); Country_Page.country_list_logo(driver).isDisplayed();
	 * Country_Page.text_country_list(driver).isDisplayed();
	 * Country_Page.button_create_country(driver).isDisplayed();
	 * 
	 * 
	 * ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(),
	 * 14, 1); ExcelUtils.setCellData(new
	 * Exception().getStackTrace()[0].getMethodName(), 14, 2);
	 * ExcelUtils.setCellData("PASS", 14, 3);
	 * 
	 * } catch (TimeoutException toe){ toe.printStackTrace();
	 * 
	 * ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(),
	 * 14, 1); ExcelUtils.setCellData(new
	 * Exception().getStackTrace()[0].getMethodName(), 14, 2);
	 * ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 14, 3); } catch
	 * ( NoSuchElementException nfe){ nfe.printStackTrace();
	 * 
	 * ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(),
	 * 14, 1); ExcelUtils.setCellData(new
	 * Exception().getStackTrace()[0].getMethodName(), 14, 2);
	 * ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 14, 3); }
	 * 
	 * catch ( ElementNotVisibleException enve){ enve.printStackTrace();
	 * 
	 * ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(),
	 * 14, 1); ExcelUtils.setCellData(new
	 * Exception().getStackTrace()[0].getMethodName(), 14, 2);
	 * ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 14, 3); }
	 * 
	 * catch ( Exception e){ e.printStackTrace();
	 * 
	 * ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(),
	 * 14, 1); ExcelUtils.setCellData(new
	 * Exception().getStackTrace()[0].getMethodName(), 14, 2);
	 * ExcelUtils.setCellData(e.getClass().getCanonicalName(), 14, 3); } }
	 * 
	 * @Test(testName= "Test Column Name") public static void test_column_name()
	 * throws Exception{ ExcelUtils.setExcelFile(Constant.Path_Test_Output +
	 * Constant.File_Test_Output,"Sheet1");
	 * 
	 * try{ WebDriverWait wait = new WebDriverWait(driver, 20);
	 * Header_panel.link_setup(driver).click(); Thread.sleep(30);
	 * Header_panel.link_setup_country(driver).click();
	 * wait.until(ExpectedConditions.textToBePresentInElementLocated(By.
	 * xpath("//h3[contains(.,' Country List')]"), "COUNTRY LIST"));
	 * 
	 * //Test Column name Country_Page.column_text_code(driver).isDisplayed();
	 * Country_Page.column_text_name(driver).isDisplayed();
	 * Country_Page.column_text_actions(driver).isDisplayed();
	 * 
	 * String stringCode = Country_Page.column_text_code(driver).getText();
	 * String stringName = Country_Page.column_text_name(driver).getText();
	 * String stringActions =
	 * Country_Page.column_text_actions(driver).getText();
	 * 
	 * if ( stringCode.matches("Code")) {
	 * System.out.println("Column name is correct");
	 * //wait.until(ExpectedConditions.stalenessOf(Country_Page.messagebox_alart
	 * (driver))); }
	 * 
	 * else { throw new Exception("text mismatch error");
	 * //System.out.println("New Company text mismatch error"); }
	 * 
	 * if ( stringName.matches("Name")) {
	 * System.out.println("Column name is correct");
	 * //wait.until(ExpectedConditions.stalenessOf(Country_Page.messagebox_alart
	 * (driver))); }
	 * 
	 * else { throw new Exception("text mismatch error");
	 * //System.out.println("New Company text mismatch error"); } if (
	 * stringActions.matches("Actions")) {
	 * System.out.println("Column name is correct");
	 * //wait.until(ExpectedConditions.stalenessOf(Country_Page.messagebox_alart
	 * (driver))); }
	 * 
	 * else { throw new Exception("text mismatch error");
	 * //System.out.println("New Company text mismatch error"); }
	 * 
	 * 
	 * ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(),
	 * 15, 1); ExcelUtils.setCellData(new
	 * Exception().getStackTrace()[0].getMethodName(), 15, 2);
	 * ExcelUtils.setCellData("PASS", 15, 3);
	 * 
	 * } catch (TimeoutException toe){ toe.printStackTrace();
	 * 
	 * ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(),
	 * 15, 1); ExcelUtils.setCellData(new
	 * Exception().getStackTrace()[0].getMethodName(), 15, 2);
	 * ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 15, 3); } catch
	 * ( NoSuchElementException nfe){ nfe.printStackTrace();
	 * 
	 * ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(),
	 * 15, 1); ExcelUtils.setCellData(new
	 * Exception().getStackTrace()[0].getMethodName(), 15, 2);
	 * ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 15, 3); }
	 * 
	 * catch ( ElementNotVisibleException enve){ enve.printStackTrace();
	 * 
	 * ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(),
	 * 15, 1); ExcelUtils.setCellData(new
	 * Exception().getStackTrace()[0].getMethodName(), 15, 2);
	 * ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 15, 3); }
	 * 
	 * catch ( Exception e){ e.printStackTrace();
	 * 
	 * ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(),
	 * 15, 1); ExcelUtils.setCellData(new
	 * Exception().getStackTrace()[0].getMethodName(), 15, 2);
	 * ExcelUtils.setCellData(e.getClass().getCanonicalName(), 15, 3); } }
	

	@Test(testName= "Test read data from row and column")
	public static void test_read_data() throws Exception{
		ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output,"Sheet1");
		
		try{
			WebDriverWait wait = new WebDriverWait(driver, 20);
			Header_panel.link_setup(driver).click();
			Thread.sleep(30);
			Header_panel.link_setup_country(driver).click();
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h3[contains(.,' Country List')]"), "COUNTRY LIST"));
			
			//Test read data
			
			//To locate table.
			 WebElement mytable = driver.findElement(By.xpath("//div[1]/section/div[2]/div[2]/table/tbody"));
			  //To locate rows of table.
			  List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
			  //To calculate no of rows In table.
			  //int rows_count = rows_table.size();
			  //System.out.print("Total Number of row is:" + rows_count );
			  
			  //Loop will execute till the last row of table.
			 for (int row=0; row<rows_count; row++){
			   //To locate columns(cells) of that specific row.
			   List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName("td"));
			   //To calculate no of columns(cells) In that specific row.
			   int columns_count = Columns_row.size();
			   System.out.println("Number of cells In Row "+row+" are "+columns_count);
			   
			   //Loop will execute till the last cell of that specific row.
			   for (int column=0; column<columns_count; column++){
			    //To retrieve text from that specific cell.
			    String celtext = Columns_row.get(column).getText();
			    System.out.println("Cell Value Of row number "+row+" and column number "+column+" Is "+celtext);
			   }
			   System.out.println("--------------------------------------------------");
			  }  
		 
			
	
					
			  String sRow = "1";
			  String sCol = "2";
					
			  //Here we are locating the xpath by passing variables in the xpath
			  //String sCellValue = driver.findElement(By.xpath("//div[1]/section/div[2]/div[2]/table/tbody/tr[" + sRow + "]/td[" + sCol + "]")).getText();
			 // System.out.println(sCellValue);
			 // String sRowValue = "VN";
			 
			 
			
			  WebElement mytable1 = driver.findElement(By.xpath("//div[1]/section/div[2]/div[2]/table/tbody"));
			  List<WebElement> rows_table1 = mytable1.findElements(By.tagName("tr"));
			  List<WebElement> column_table1 = mytable1.findElements(By.tagName("td"));
			 // List<WebElement> mytable = (List<WebElement>) driver.findElement(By.xpath("//div[1]/section/div[2]/div[2]/table/tbody/"));
			  //List<WebElement> rows_table = driver.findElements(By.tagName("tr"));
			  int rows_count = rows_table1.size();
			  int column_count = column_table1.size();
			  System.out.println("total number of row is:" + rows_count);
			  System.out.println("total number of column is:" + column_count);
			  
			  for (int i=1;i<=rows_count;i++){
				  for (int j=1;j<=3;j++){
				 
				  String sCellValue = driver.findElement(By.xpath("//div[1]/section/div[2]/div[2]/table/tbody/tr[" + i + "]/td[" + j + "]")).getText();
				  System.out.println(sCellValue);
				  }
				 
				  //System.out.println(sCellValue);
			  }
			  
			 // System.out.println(sCellValue);
				
			  //First loop will find the 'ClOCK TWER HOTEL' in the first column
			  for (int i=1;i<=5;i++){
				  String sValue = null;
				  sValue = driver.findElement(By.xpath("//div[1]/section/div[2]/div[2]/table/tbody/tr[" + i + "]/td")).getText();
				  if(sValue.equalsIgnoreCase(sRowValue)){
					  // If the sValue match with the description, it will initiate one more inner loop for all the columns of 'i' row 
					  for (int j=1;j<=2;j++){
						  String sColumnValue= driver.findElement(By.xpath("//div[1]/section/div[2]/div[2]/table/tbody[" + i + "]/td["+ j +"]")).getText();
						  System.out.println(sColumnValue);
					  }
					  break;
				  }
			  }
				

	ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(),16,1);ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(),16,2);ExcelUtils.setCellData("PASS",16,3);

	}catch(

	TimeoutException toe)
	{
		toe.printStackTrace();

		ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 16, 1);
		ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 16, 2);
		ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 16, 3);
	}catch(
	NoSuchElementException nfe)
	{
		nfe.printStackTrace();

		ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 16, 1);
		ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 16, 2);
		ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 16, 3);
	}

	catch(
	ElementNotVisibleException enve)
	{
		enve.printStackTrace();

		ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 16, 1);
		ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 16, 2);
		ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 16, 3);
	}

	catch(
	Exception e)
	{
	    	 	e.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 16, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 16, 2);
		    	ExcelUtils.setCellData(e.getClass().getCanonicalName(), 16, 3);
		    	}
		}

		 */
	@Test(testName= "Test pagination")
	public static void test_pagination() throws Exception{
		ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output,"Sheet1");
		
		try{
			WebDriverWait wait = new WebDriverWait(driver, 20);
			Header_panel.link_setup(driver).click();
			Thread.sleep(30);
			Header_panel.link_setup_country(driver).click();
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h3[contains(.,' Country List')]"), "COUNTRY LIST"));
			
			//Test pagination
			
			List<WebElement> pagination =driver.findElements(By.xpath("//div[1]/section/div[2]/div[2]/ul/li")); 
			int size= pagination.size(); 
			System.out.println("Pagination size is:" + pagination.size()); 
			if(size>0)
			{ 
			System.out.println("pagination exists");
			// click on pagination link
			for(int i=1; i<size; i++){ 

			try{ 
			driver.findElement(By.xpath("//div[1]/section/div[2]/div[2]/ul/li["+i+"]/a")).click() ;
			Thread.sleep(3000); 
			System.out.println("Loop "+i);
			}
			catch(Exception e){ 
			//e.printStackTrace();
			//System.out.print
			
			throw new Exception("page not found error");
			} 
			} 
			}
			
			
			

	ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(),17,1);
	ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(),17,2);
	ExcelUtils.setCellData("PASS",17,3);

	}catch(

	TimeoutException toe)
	{
		toe.printStackTrace();

		ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 17, 1);
		ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 17, 2);
		ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 17, 3);
	}catch(
	NoSuchElementException nfe)
	{
		nfe.printStackTrace();

		ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 17, 1);
		ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 17, 2);
		ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 17, 3);
	}

	catch(
	ElementNotVisibleException enve)
	{
		enve.printStackTrace();

		ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 17, 1);
		ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 17, 2);
		ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 17, 3);
	}

	catch(
	Exception e)
	{
	    	 	e.printStackTrace();
	    	 	
			    ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 17, 1);
				ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 17, 2);
		    	ExcelUtils.setCellData(e.getClass().getCanonicalName(), 17, 3);
		    	}
		}
	
}
