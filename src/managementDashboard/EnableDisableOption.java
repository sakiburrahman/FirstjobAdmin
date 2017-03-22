package managementDashboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LocalLogs;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class EnableDisableOption extends managementDashboard.Login {

	@Test
	public void enableOption (){
		WebElement columnText = driver.findElement(By.xpath("//div/div/table/thead/tr/th[2]"));
		//WebElement columnText = driver.findElement(By.xpath("//body/div[3]/div/div[2]/div[2]/div/div/table/tbody/tr[1]/td[6]/a[2]"));
		String text = columnText.getText();
		System.out.println("\nThe text is " + text);
		
		driver.findElement(By.xpath("//a[@onclick='updateJobStatus(50,1)']")).click();
	}

	
	@Test
	public void columnTextVerification (){
		//driver.manage().timeouts().pageLoadTimeout(10, SECONDS);
	
		//WebDriverWait wait = new WebDriverWait(driver, 15);
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	   //wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("li > a > span"), "List of Jobs & Applicant"));
		//wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div/table/tbody/tr[1]/td[6]/a[2]"), "Disable"));
		WebElement element = driver.findElement(By.xpath("//th[@colspan='1']"));
		String buttonText = element.getText();
		System.out.println("The First Column name is" + buttonText);
		//WebDriverWait wait = new WebDriverWait(driver, 15);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body/div[3]/div/div[2]/div[2]/div/div/table/tbody/tr[1]/td[6]/a[2]']")));
	}
}
		 
		 
		
