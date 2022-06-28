package zebraDomain.zebraDomain.TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import in.co.zebraDomain.PageObject.calenderIcon;

public class TC_CalendarIcon_005 extends TC_Grantt_004  {
	@Test(priority = 5)
	public void ActionCalendar() {
		calenderIcon ci=new calenderIcon(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		ci.ClickCalendar();
	}
	

}
