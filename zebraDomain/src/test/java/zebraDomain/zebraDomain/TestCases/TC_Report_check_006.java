package zebraDomain.zebraDomain.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import in.co.zebraDomain.PageObject.calenderIcon;
import in.co.zebraDomain.PageObject.report_ICON_check;

public class TC_Report_check_006 extends TC_CalendarIcon_005    {
	@Test(priority = 5)
	public void ActionreportICON() {
		report_ICON_check reIcon=new report_ICON_check(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		reIcon.ClickreportICon();
		reIcon.ClickReportName();
	}
}