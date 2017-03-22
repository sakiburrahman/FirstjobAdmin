package managementDashboard;

import java.net.URISyntaxException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



import org.openqa.selenium.support.ui.Select;



public class Post_Job extends managementDashboard.BaseClass {
	
	@Test
	public void postNewJob() throws InterruptedException{
		
		WebElement postJob_btn = driver.findElement(By.xpath("//div/div[3]/a[1]"));
		postJob_btn.click();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("job_name")));
		
		//Enter Inputs 
		driver.findElement(By.id("job_name")).sendKeys("Automation Engineer112cfg");
		
		new Select(driver.findElement(By.id("select_salary"))).selectByVisibleText("Negotiable");
		driver.findElement(By.id("job_desc")).sendKeys("Just For Test");
		driver.findElement(By.id("job_skill_exp")).sendKeys("Minimum 4 years Experience ");
		new Select(driver.findElement(By.id("job_city"))).selectByVisibleText("Dhaka");
		new Select(driver.findElement(By.id("job_dist"))).selectByVisibleText("Dhaka");
		
		
		driver.findElement(By.id("cover_photo")).sendKeys("C:\\Users\\ASUS\\workspace\\FirstJob Managment Panel_Automation\\Uploader File\\Selenium.txt");
		Thread.sleep(100);
		driver.findElement(By.xpath("//div[3]/div/div[2]/div[2]/div/div/form/div[8]/div/button[1]")).click();
		//Thread.sleep(1000);
		
		 
	      wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[6]/div[2]/div/div"), "We are publishing, please wait a minutes."));
		
		//Verify Alert Text
		//WebElement alertText = driver.findElement(By.xpath("//div[6]/div[2]/div/div"));
		
		
		
		//Alert Pop up Handling.
		
		  driver.findElement(By.xpath("//div[6]/div[4]/button")).click();
		 // Alert A2 = driver.switchTo().alert();
		  //String Alert2 = A2.getText();
		  //System.out.println(Alert2);
		  Thread.sleep(1000);
		  //To click On cancel button of confirmation box.
		 // A2.dismiss();
		
		
		}

	
		 
}
