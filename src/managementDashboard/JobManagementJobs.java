package managementDashboard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.corba.se.impl.orbutil.threadpool.TimeoutException;

import pageObjects.Header_panel;
import pageObjects.JobApplied_Page;
import pageObjects.Jobs_Page;
import utility.Constant;
import utility.ExcelUtils;

public class JobManagementJobs extends managementDashboard.BaseClass  {
	
	/*@Test(testName = "Test Page Header")
	public static void test_page_header() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output, "Sheet1");

		try {
			// Click on Job Management
			Header_panel.link_job_management(driver).click();
			Thread.sleep(30);
			// Click on Job Applied from Job Management
			Header_panel.link_job_management_jobs(driver).click();
			Thread.sleep(30);
			
			Jobs_Page.jobs_list_logo(driver).isDisplayed();
			Jobs_Page.text_jobs_list(driver).isDisplayed();

			
			String stringJobManagementJob = Jobs_Page.text_jobs_list(driver).getText();
			Assert.assertEquals(stringJobManagementJob, "JOB LIST");

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 22, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 22, 2);
			ExcelUtils.setCellData("PASS", 22, 3);
		}

		catch (TimeoutException toe) {
			toe.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 22, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 22, 2);
			ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 22, 3);
		} catch (NoSuchElementException nfe) {
			nfe.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 22, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 22, 2);
			ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 22, 3);
		}

		catch (ElementNotVisibleException enve) {
			enve.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 22, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 22, 2);
			ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 22, 3);
		}

		catch (Exception e) {
			e.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 22, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 22, 2);
			ExcelUtils.setCellData(e.getClass().getCanonicalName(), 22, 3);
		}

	}
	
	@Test(testName = "Test column name")
	public static void test_column_name() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output, "Sheet1");

		try {
			// Click on Job Management
			Header_panel.link_job_management(driver).click();
			Thread.sleep(30);
			// Click on Job Applied from Job Management
			Header_panel.link_job_management_jobs(driver).click();
			Thread.sleep(30);
						

			String stringJobTitle= Jobs_Page.column_text_job_title(driver).getText();
			String stringCompany = Jobs_Page.column_text_company(driver).getText();
			String stringStatus = Jobs_Page.column_text_status(driver).getText();
			String stringType = Jobs_Page.column_text_type(driver).getText();
			String stringExpireDate = Jobs_Page.column_text_expire_date(driver).getText();
			String stringAction = Jobs_Page.column_text_action(driver).getText();
			// Verify Column Name
			if (stringJobTitle.matches("Job Title")) {
				System.out.println("Column name is correct");
			}

			else {
				throw new Exception("text mismatch error");
			}

			if (stringCompany.matches("Company")) {
				System.out.println("Column name is correct");
			}

			else {
				throw new Exception("text mismatch error");
			}

			if (stringStatus.matches("Status")) {
				System.out.println("Column name is correct");
			}

			else {
				throw new Exception("text mismatch error");
			}

			if (stringType.matches("Type")) {
				System.out.println("Column name is correct");
			}

			else {
				throw new Exception("text mismatch error");
			}

			if (stringExpireDate.matches("Expire Date")) {
				System.out.println("Column name is correct");
			}

			else {
				throw new Exception("text mismatch error");
			}

			if (stringAction.matches("Action")) {
				System.out.println("Column name is correct");
			}

			else {
				throw new Exception("text mismatch error");
			}

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 23, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 23, 2);
			ExcelUtils.setCellData("PASS", 23, 3);
		}

		catch (TimeoutException toe) {
			toe.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 23, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 23, 2);
			ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 23, 3);
		} catch (NoSuchElementException nfe) {
			nfe.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 23, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 23, 2);
			ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 23, 3);
		}

		catch (ElementNotVisibleException enve) {
			enve.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 23, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 23, 2);
			ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 23, 3);
		}

		catch (Exception e) {
			e.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 23, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 23, 2);
			ExcelUtils.setCellData(e.getClass().getCanonicalName(), 23, 3);
		}

	}
	
	@Test(testName = "Test Search option")
	public static void test_search_option() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output, "Sheet1");

		try {
			// Click on Job Management
			Header_panel.link_job_management(driver).click();
			Thread.sleep(30);
			// Click on Job Applied from Job Management
			Header_panel.link_job_management_jobs(driver).click();
			Thread.sleep(30);
			
			Jobs_Page.jobs_list_logo(driver).isDisplayed();
			Jobs_Page.text_jobs_list(driver).isDisplayed();

			//Enter Text in search box
			Jobs_Page.input_field_search(driver).clear();
			Jobs_Page.input_field_search(driver).sendKeys("Sales Executive");
			Thread.sleep(30);
			//Verify Searched element presents in the web page
			WebElement element = driver.findElement(By.tagName("tbody"));
			String BodyText = element.getText();
			//text.contains("Sales Executiveddd");
			if (BodyText.contains("Sales Executive")){
				System.out.println("Inputed Text Found");
			}
			else{
				throw new Exception("Inputed Text not found");
			}
			
			//Verify no matching record found
			//Enter Text in search box
			Jobs_Page.input_field_search(driver).clear();
			Jobs_Page.input_field_search(driver).sendKeys("Sales fsawerweExecutive");
			Thread.sleep(30);
			if (!BodyText.contains("Sales fsawerweExecutive")){
				
				String stringNoRecoed = Jobs_Page.text_No_matching_records_found(driver).getText();
				Assert.assertEquals(stringNoRecoed, "No matching records found");
				System.out.println("Its OK because, searched text not found");
			}
			else{
				throw new Exception("'No matching records found' text not found");
			}
		}

		catch (TimeoutException toe) {
			toe.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 24, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 24, 2);
			ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 24, 3);
		} catch (NoSuchElementException nfe) {
			nfe.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 24, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 24, 2);
			ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 24, 3);
		}

		catch (ElementNotVisibleException enve) {
			enve.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 24, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 24, 2);
			ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 24, 3);
		}

		catch (Exception e) {
			e.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 24, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 24, 2);
			ExcelUtils.setCellData(e.getClass().getCanonicalName(), 24, 3);
		}

	}
	

	@Test(testName = "Test pagination")
	public static void test_pagination() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output, "Sheet1");

		try {
			// Click on Job Management
			Header_panel.link_job_management(driver).click();
			Thread.sleep(30);
			// Click on Job Applied from Job Management
			Header_panel.link_job_management_jobs(driver).click();
			Thread.sleep(30);

			// Test pagination
			List<WebElement> pagination = driver
					.findElements(By.xpath("//div[1]/section/div[3]/div/div/div[3]/div[2]/div/ul/li"));
			int size = pagination.size();
			System.out.println("Pagination size is:" + pagination.size());
			if (size > 0) {
				System.out.println("pagination exists");
				// click on pagination link
				for (int i = 2; i < size; i++) {

					try {
						driver.findElement(
								By.xpath("//div[1]/section/div[3]/div/div/div[3]/div[2]/div/ul/li[" + i + "]/a"))
								.click();
						Thread.sleep(3000);
						System.out.println("Loop " + i);
					} catch (Exception e) {
						// e.printStackTrace();
						// System.out.print

						throw new Exception("page not found error");
					}
				}
			}

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 25, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 25, 2);
			ExcelUtils.setCellData("PASS", 25, 3);
		}

		catch (TimeoutException toe) {
			toe.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 25, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 25, 2);
			ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 25, 3);
		} catch (NoSuchElementException nfe) {
			nfe.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 25, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 25, 2);
			ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 25, 3);
		}

		catch (ElementNotVisibleException enve) {
			enve.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 25, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 25, 2);
			ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 25, 3);
		}

		catch (Exception e) {
			e.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 25, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 25, 2);
			ExcelUtils.setCellData(e.getClass().getCanonicalName(), 25, 3);
		}

	}
	
	
	//Problem ase
	@Test(testName = "Test Total number of applicant & page information")
	public static void test_total_num_of_applicant_and_page_information() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output, "Sheet1");

		try {
			// Click on Job Management
						Header_panel.link_job_management(driver).click();
						Thread.sleep(30);
						// Click on Job Applied from Job Management
						Header_panel.link_job_management_jobs(driver).click();
						Thread.sleep(30);

			// Test total number of applicants

			List<WebElement> pagination = driver
					.findElements(By.xpath("//div[1]/section/div[3]/div/div/div[3]/div[2]/div/ul/li"));
			int size = pagination.size();
			System.out.println("Pagination size is:" + pagination.size());
			if (size > 0) {
				System.out.println("pagination exists");
				int totaltcount = 0;

				// click on pagination link
				for (int i = 2; i < size; i++) {
					try {
						// if(driver.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[3]/div[2]/div/ul/li["+i+"]/a")).isEnabled()){
						driver.findElement(
								By.xpath("//div[1]/section/div[3]/div/div/div[3]/div[2]/div/ul/li[" + i + "]/a"))
								.click();
						Thread.sleep(3000);
						// Getting table
						WebElement mytable = driver
								.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/tbody"));
						List<WebElement> numberOfJob = mytable.findElements(By.tagName("tr"));
						int count = numberOfJob.size();
						totaltcount += count;
					} catch (Exception e) {
						throw new Exception("page not found error");
					}
				}
				System.out.println("The total number of job is :" + totaltcount);
				driver.findElement(
						By.xpath("//div[1]/section/div[2]/div/div/div[3]/div[2]/div/ul/li[2]/a"))
						.click();
				Thread.sleep(20);
				String stringEntriesInfo = Jobs_Page.text_entries_info(driver).getText();
				if(stringEntriesInfo.matches("Showing 1 to 10 of "+ totaltcount + " entries")){
					System.out.println("Text is OK");	
				}
				else{
					throw new Exception("Text mismatch");
				}
				
				//org.openqa.selenium.support.ui.Select dropdown = new org.openqa.selenium.support.ui.Select(driver.findElement(By.name("appliedJobTable_length")));
				//Select 25 from drop down
				//dropdown.selectByVisibleText("25");
				//Thread.sleep(20);
				
				//wait.until(ExpectedConditions.textToBePresentInElement(JobApplied_Page.text_entries_info(driver), "Showing 1 to 25 of " + totaltcount + " entries"));
				
				//Select 50 from drop down
				//dropdown.selectByVisibleText("50");
				//Thread.sleep(20);
				//wait.until(ExpectedConditions.textToBePresentInElement(JobApplied_Page.text_entries_info(driver), "Showing 1 to " + totaltcount + " of " + totaltcount + " entries"));
				
				
			}

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 26, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 26, 2);
			ExcelUtils.setCellData("PASS", 26, 3);
		}

		catch (TimeoutException toe) {
			toe.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 26, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 26, 2);
			ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 26, 3);
		} catch (NoSuchElementException nfe) {
			nfe.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 26, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 26, 2);
			ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 26, 3);
		}

		catch (ElementNotVisibleException enve) {
			enve.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 26, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 26, 2);
			ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 26, 3);
		}

		catch (Exception e) {
			e.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 26, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 26, 2);
			ExcelUtils.setCellData(e.getClass().getCanonicalName(), 26, 3);
		}

	}
	*/
	@Test(testName = "Test Create Job")
	public static void test_create_job() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output, "Sheet1");

		try {
			// Click on Job Management
						Header_panel.link_job_management(driver).click();
						Thread.sleep(30);
						// Click on Job Applied from Job Management
						Header_panel.link_job_management_jobs(driver).click();
						Thread.sleep(30);

			// Click on Create Job button
			Jobs_Page.button_create_job(driver).click();
			Thread.sleep(30);
			Jobs_Page.create_job_logo(driver).isDisplayed();
			Jobs_Page.text_create_job(driver).isDisplayed();
			
			//Verify Create job text
			String stringCreateJob = Jobs_Page.text_create_job(driver).getText();
			Assert.assertEquals(stringCreateJob, "CREATE JOB");
			
			
				
			
	

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 27, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 27, 2);
			ExcelUtils.setCellData("PASS", 27, 3);
		}

		catch (TimeoutException toe) {
			toe.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 27, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 27, 2);
			ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 27, 3);
		} catch (NoSuchElementException nfe) {
			nfe.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 27, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 27, 2);
			ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 27, 3);
		}

		catch (ElementNotVisibleException enve) {
			enve.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 27, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 27, 2);
			ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 27, 3);
		}

		catch (Exception e) {
			e.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 27, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 27, 2);
			ExcelUtils.setCellData(e.getClass().getCanonicalName(), 27, 3);
		}

	}

}
