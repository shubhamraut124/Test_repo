package zebraDomain.zebraDomain.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import in.co.zebraDomain.PageObject.Grantt_calendar_message;

public class TC_Grantt_004 extends TC_smartSearch_003 {
	
	@Test(priority = 4)
	public void Grantt_1() {
	Grantt_calendar_message gcm=new Grantt_calendar_message(driver);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
//	gcm.TaskManagerIco();
	//gcm.ValidateGrant();
	gcm.ClickGrantt();
		
	}
	
	

}
