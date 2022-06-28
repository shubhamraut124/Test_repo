package zebraDomain.zebraDomain.TestCases;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import in.co.zebraDomain.PageObject.LoginPage;
import in.co.zebraDomain.PageObject.howDoILink;
import in.co.zebraDomain.Utilities.ScreesnShots;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_howDoI_002 extends TC_login_001{
	
	
	@Test (priority = 2)
	public void howdoLink() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		howDoILink hw=new howDoILink(driver);
		
		hw.ClickarrOw();
		//hw.clickProjectInboxLink();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		   List<WebElement> list=driver.findElements(By.xpath("//div[@class='ps-content']//ul[@class='list-unstyled']//li//a"));
		   for (int i = 0; i < list.size(); i++) {
			   if (list.get(i).getText().contains("Field View")) {
				   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
				   list.get(i).click();
				   
				 
				   break;
				
			}
			   
			  
		}
		   Thread.sleep(40000);
			/*
			 * WebDriverWait wait = new WebDriverWait(driver,60);
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
			 * xpath("//img[@title='View in HTML Format']")));
			 */
		   ScreesnShots ss=new ScreesnShots();
		   try {
			ss.takeSnapShot(driver,className);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			hw.CloseFVicon();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	
	
	

}
