package appModules;


//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.sun.corba.se.impl.orbutil.threadpool.TimeoutException;

import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

//import jdk.internal.dynalink.linker.LinkerServices.Implementation;
import pageObjects.Login_Page;

public class BaseClass {
    //Declared as public static to use same webdriver instance publicly
	static String driverPath = "C:\\Selenium Webdriver/";
	public static WebDriver driver;

    //@BeforeSuite annotation describes this method has to run before all suites
    @BeforeTest
    public void setup() throws Exception { 
    	
    	System.out.println("*******************");
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Log.info("Chrome Browser Started successfully");
		driver.get(Constant.URL);
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		Log.info("First Job Admin page open successfully");
		
    } 
    

	@Test(testName ="Always login before a test start")
	 public static void Login() throws Exception {
	     
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
			driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
			//WebDriverWait wait = new WebDriverWait(driver, 20);
		    //wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h3[contains(.,' Dashboard')]"), "DASHBOARD"));
		    driver.findElement(By.xpath("//h3[contains(.,' Dashboard')]")).isDisplayed();
		    //ExcelUtils.setCellData(new Exception().getStackTrace()[0].getClassName(), 2, 1);
			//ExcelUtils.setCellData(new Exception().getStackTrace()[0].getMethodName(), 2, 2);
	    	//ExcelUtils.setCellData("PASS", 2, 3);
			
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
    //@AfterSuite annotation describes this method has to run after execution of all suites
    @AfterTest
         public void tearDown() throws Exception { 
         driver.quit(); 
    } 
    
    
}