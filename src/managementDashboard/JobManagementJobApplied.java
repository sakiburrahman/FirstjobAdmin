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
import com.sun.org.apache.bcel.internal.generic.Select;

import pageObjects.Header_panel;
import pageObjects.JobApplied_Page;
import pageObjects.Jobs_Page;
import pageObjects.Users_Page;
import utility.Constant;
import utility.ExcelUtils;

public class JobManagementJobApplied extends managementDashboard.BaseClass {

	@Test(testName = "Test Page Header")
	public static void test_page_header() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output, "Sheet1");

		try {
			// Click on Job Management
			Header_panel.link_job_management(driver).click();
			Thread.sleep(30);
			// Click on Job Applied from Job Management
			Header_panel.link_job_management_job_applied(driver).click();
			Thread.sleep(30);

			JobApplied_Page.job_applied_logo(driver).isDisplayed();
			JobApplied_Page.text_job_applied(driver).isDisplayed();

			String stringJobManagementJobApplied = JobApplied_Page.text_job_applied(driver).getText();
			Assert.assertEquals(stringJobManagementJobApplied, "JOB APPLIED LIST");

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 18, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 18, 2);
			ExcelUtils.setCellData("PASS", 18, 3);
		}

		catch (TimeoutException toe) {
			toe.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 18, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 18, 2);
			ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 18, 3);
		} catch (NoSuchElementException nfe) {
			nfe.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 18, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 18, 2);
			ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 18, 3);
		}

		catch (ElementNotVisibleException enve) {
			enve.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 18, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 18, 2);
			ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 18, 3);
		}

		catch (Exception e) {
			e.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 18, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 18, 2);
			ExcelUtils.setCellData(e.getClass().getCanonicalName(), 18, 3);
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
			Header_panel.link_job_management_job_applied(driver).click();
			Thread.sleep(30);

			String stringApplicantName = JobApplied_Page.column_text_applicant_name(driver).getText();
			String stringJobName = JobApplied_Page.column_text_job_name(driver).getText();
			String stringCompanyName = JobApplied_Page.column_text_company_name(driver).getText();
			String stringChatPage = JobApplied_Page.column_text_chat_page(driver).getText();
			String stringAppliedDate = JobApplied_Page.column_text_applied_date(driver).getText();
			String stringCV = JobApplied_Page.column_text_CV(driver).getText();
			// Verify Column Name
			if (stringApplicantName.matches("Applicant Name")) {
				System.out.println("Column name is correct");
			}

			else {
				throw new Exception("text mismatch error");
			}

			if (stringJobName.matches("Job Name")) {
				System.out.println("Column name is correct");
			}

			else {
				throw new Exception("text mismatch error");
			}

			if (stringCompanyName.matches("Company Name")) {
				System.out.println("Column name is correct");
			}

			else {
				throw new Exception("text mismatch error");
			}

			if (stringChatPage.matches("Chat Page")) {
				System.out.println("Column name is correct");
			}

			else {
				throw new Exception("text mismatch error");
			}

			if (stringAppliedDate.matches("Applied Date")) {
				System.out.println("Column name is correct");
			}

			else {
				throw new Exception("text mismatch error");
			}

			if (stringCV.matches("CV")) {
				System.out.println("Column name is correct");
			}

			else {
				throw new Exception("text mismatch error");
			}

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 19, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 19, 2);
			ExcelUtils.setCellData("PASS", 19, 3);
		}

		catch (TimeoutException toe) {
			toe.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 19, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 19, 2);
			ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 19, 3);
		} catch (NoSuchElementException nfe) {
			nfe.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 19, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 19, 2);
			ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 19, 3);
		}

		catch (ElementNotVisibleException enve) {
			enve.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 19, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 19, 2);
			ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 19, 3);
		}

		catch (Exception e) {
			e.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 19, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 19, 2);
			ExcelUtils.setCellData(e.getClass().getCanonicalName(), 19, 3);
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
			Header_panel.link_job_management_job_applied(driver).click();
			Thread.sleep(30);

			// Test pagination

			List<WebElement> pagination = driver
					.findElements(By.xpath("//div[1]/section/div[2]/div/div/div[3]/div[2]/div/ul/li"));
			int size = pagination.size();
			System.out.println("Pagination size is:" + pagination.size());
			if (size > 0) {
				System.out.println("pagination exists");
				// click on pagination link
				for (int i = 1; i < size; i++) {

					try {
						driver.findElement(
								By.xpath("//div[1]/section/div[2]/div/div/div[3]/div[2]/div/ul/li[" + i + "]/a"))
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

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 20, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 20, 2);
			ExcelUtils.setCellData("PASS", 20, 3);
		}

		catch (TimeoutException toe) {
			toe.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 20, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 20, 2);
			ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 20, 3);
		} catch (NoSuchElementException nfe) {
			nfe.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 20, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 20, 2);
			ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 20, 3);
		}

		catch (ElementNotVisibleException enve) {
			enve.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 20, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 20, 2);
			ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 20, 3);
		}

		catch (Exception e) {
			e.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 20, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 20, 2);
			ExcelUtils.setCellData(e.getClass().getCanonicalName(), 20, 3);
		}

	}

	@Test(testName = "Test Total number of applicant & page information")
	public static void test_total_num_of_applicant_and_page_information() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output, "Sheet1");

		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			// Click on Job Management
			Header_panel.link_job_management(driver).click();
			Thread.sleep(30);
			// Click on Job Applied from Job Management
			Header_panel.link_job_management_job_applied(driver).click();
			Thread.sleep(30);

			// Test total number of applicants

			List<WebElement> pagination = driver
					.findElements(By.xpath("//div[1]/section/div[2]/div/div/div[3]/div[2]/div/ul/li"));
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
								By.xpath("//div[1]/section/div[2]/div/div/div[3]/div[2]/div/ul/li[" + i + "]/a"))
								.click();
						Thread.sleep(3000);
						// Getting table
						WebElement mytable = driver
								.findElement(By.xpath("//div[1]/section/div[2]/div/div/div[2]/div/table/tbody"));
						List<WebElement> applicant = mytable.findElements(By.tagName("tr"));
						int count = applicant.size();
						totaltcount += count;
					} catch (Exception e) {
						throw new Exception("page not found error");
					}
				}
				System.out.println("The total number of applicant is :" + totaltcount);
				driver.findElement(
						By.xpath("//div[1]/section/div[2]/div/div/div[3]/div[2]/div/ul/li[2]/a"))
						.click();
				Thread.sleep(20);
				String stringEntriesInfo = JobApplied_Page.text_entries_info(driver).getText();
				if(stringEntriesInfo.matches("Showing 1 to 10 of "+ totaltcount + " entries")){
					System.out.println("Text is OK");	
				}
				else{
					throw new Exception("Text mismatch");
				}
				
				org.openqa.selenium.support.ui.Select dropdown = new org.openqa.selenium.support.ui.Select(driver.findElement(By.name("appliedJobTable_length")));
				//Select 25 from drop down
				dropdown.selectByVisibleText("25");
				Thread.sleep(20);
				
				wait.until(ExpectedConditions.textToBePresentInElement(JobApplied_Page.text_entries_info(driver), "Showing 1 to 25 of " + totaltcount + " entries"));
				
				//Select 50 from drop down
				dropdown.selectByVisibleText("50");
				Thread.sleep(20);
				wait.until(ExpectedConditions.textToBePresentInElement(JobApplied_Page.text_entries_info(driver), "Showing 1 to " + totaltcount + " of " + totaltcount + " entries"));
				
				
			}

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 21, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 21, 2);
			ExcelUtils.setCellData("PASS", 21, 3);
		}

		catch (TimeoutException toe) {
			toe.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 21, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 21, 2);
			ExcelUtils.setCellData(toe.getClass().getCanonicalName(), 21, 3);
		} catch (NoSuchElementException nfe) {
			nfe.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 21, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 21, 2);
			ExcelUtils.setCellData(nfe.getClass().getCanonicalName(), 21, 3);
		}

		catch (ElementNotVisibleException enve) {
			enve.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 21, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 21, 2);
			ExcelUtils.setCellData(enve.getClass().getCanonicalName(), 21, 3);
		}

		catch (Exception e) {
			e.printStackTrace();

			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 21, 1);
			ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 21, 2);
			ExcelUtils.setCellData(e.getClass().getCanonicalName(), 21, 3);
		}

	}

}
