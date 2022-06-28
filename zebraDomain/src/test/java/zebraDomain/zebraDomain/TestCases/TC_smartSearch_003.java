package zebraDomain.zebraDomain.TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import in.co.zebraDomain.PageObject.smartSearch;

public class TC_smartSearch_003 extends TC_howDoI_002 {

	
	@Test(priority = 3)
public void smartSearch_1() {
		System.out.println("test in smart search");
		smartSearch searchSmart=new smartSearch(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		searchSmart.ClickArrowDown();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		searchSmart.ClickSearchStrip();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		searchSmart.searchButton();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		searchSmart.Mywork_icon();
	}
	
}
