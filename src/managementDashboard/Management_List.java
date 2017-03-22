package managementDashboard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Management_List extends managementDashboard.Login{
 
 //@Test annotation describes this method as a test method

    @Test
    public void login() {
      String title = driver.getTitle();
      System.out.print("\nCurrent page title is : "+title);
      String Workdir = System.getProperty("user.dir");
      
      WebElement email = driver.findElement(By.id("login_email"));
      email.sendKeys("jobtowndev+1@gmail.com");
      
      WebElement password = driver.findElement(By.id("login_pwd"));
      password.sendKeys("12345678");
      
      WebElement signInButton = driver.findElement(By.className("btn-signin-hd"));
      signInButton.click();
      
      WebDriverWait wait = new WebDriverWait(driver, 15);
      wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("li > a > span"), "List of Jobs & Applicant"));
      
      WebElement listOfJobs = driver.findElement(By.cssSelector("li > a > span"));
      String text1 = listOfJobs.getText();
      System.out.println("\nThe First List is " +  text1);
      Assert.assertEquals(text1, "List of Jobs & Applicant");
      
     

      
      String Classpackname = this.getClass().getName();
      System.out.print("\n'"+Workdir+" -> "+Classpackname+" -> testmethodone' has been executed successfully");
    }
    
 
 
 	@Test
 	public void linkTest () throws InterruptedException 
 	{
 		
 		try {
 		List<WebElement> no = driver.findElements(By.tagName("a"));
 			int nooflinks = no.size(); 
 			System.out.println(nooflinks);
 			for (WebElement pagelink : no)
 			{
 				String linktext = pagelink.getText();
 				String link = pagelink.getAttribute("href"); 
 				System.out.println(linktext+" ->");
 				System.out.println(link);
 			}
 		}catch (Exception e){
            System.out.println("error "+e);
        }
          
 	}
 	
 	/*@Test
 	 public void textField() throws InterruptedException{
 	 
 	  //find all input fields where type = text or password and store them In array list txtfields.
 	  List<WebElement> txtfields = driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
 	  
 	  //for loop to send text In all text box one by one.
 	  for(int a=0; a<txtfields.size();a++){   
 	   txtfields.get(a).sendKeys("Text"+(a+1));  
 	  }
 	  Thread.sleep(3000);
 	 }*/
 	
}