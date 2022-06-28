package zebraDomain.zebraDomain.TestCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Function;

import in.co.zebraDomain.PageObject.LoginPage;
import in.co.zebraDomain.Utilities.FluentWait_Class;
import in.co.zebraDomain.Utilities.ScreesnShots;
import junit.framework.Assert;

public class TC_login_001 extends BaseClass {
//variable declaration 	
	String className;
//	FluentWait_Class Fc=new FluentWait_Class();	 creating the object of flientwait class 
	
	/*  here we created the constructor and passing the name of class to screenshot class	*/
	public TC_login_001() {
		// TODO Auto-generated constructor stub
		className = this.getClass().getSimpleName();
		System.out.println(className);
	}

	@Test(priority = 1)
	public void login() {
		driver.get(baseURL);

		LoginPage lp = new LoginPage(driver);
		lp.sendUserName(username);
		logger.info("entered the username ");
		lp.sendPasswor(pwd);
		lp.ClickCubmit();
		ScreesnShots ss = new ScreesnShots();

		
		
			
			
		/*
		 * Wait<WebDriver> gwait = new FluentWait<WebDriver>(driver)
		 * .withTimeout(Duration.ofSeconds(60)) .pollingEvery(Duration.ofMillis(5))
		 * .ignoring(NoSuchElementException.class);
		 * 
		 * WebElement foo1 = gwait.until(new Function<WebDriver, WebElement>() { public
		 * WebElement apply(WebDriver driver) { return
		 * driver.findElement(By.xpath("//div/app-quick-links/button/span/i"));
		 * 
		 * } });
		 * 
		 * try { ss.takeSnapShot(driver, className); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * System.out.println(driver.getTitle());
		 */
		
		SoftAssert softAssertion= new SoftAssert();
			if(driver.getTitle().
					
					equals("Authentication successful. Please wait while the page loads.")) {
				softAssertion.assertTrue(true); logger.info("Successfully login to application");
					System.out.println("login "); 
			}else { softAssertion.assertTrue(false);
					logger.info("failed to login in application");
		 
		 
		}
			 softAssertion.assertAll();
		 }
}
