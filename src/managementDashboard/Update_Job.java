package managementDashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Update_Job extends managementDashboard.Login {

	@Test
	public void jobEdit(){
		WebElement edit_btn = driver.findElement(By.xpath("//div/table/tbody/tr[1]/td[6]/a[1]"));
		edit_btn.click();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("job_name")));
	}
}
