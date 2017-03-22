package automationFramework;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import managementDashboard.Login;

import utility.*;


public class AutomationFramework extends appModules.BaseClass{
	
	@Test
	public static void mainTest() throws Exception {
		
		DOMConfigurator.configure("log4j.xml");
		//ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output,"Sheet1");
		
		//Login.firstjoblogo();
		
		
		//Login.email_placeholder_text();
		//Login.password_placeholder_text();
		//Login.test_display_checkbox_remember_me();
		//Login.test_clickable_checkbox_remember_me();
		//Login.test_display_link_forgot_password();
		//Login.test_clickable_link_forgot_password();
		//Login.test_Unsuccessful_Login_correct_email_wrong_password();
		Login.test_Successful_Login();
		//Login.test_Unsuccessful_Login_correct_email_wrong_password();
		
		
		
		
	}

}

