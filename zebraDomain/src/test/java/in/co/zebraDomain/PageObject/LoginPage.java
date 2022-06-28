package in.co.zebraDomain.PageObject;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import zebraDomain.zebraDomain.TestCases.BaseClass;

public class LoginPage {

	//WebDriverWait ewait=new WebDriverWait(bc.driver, 20);
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	// writing the page inputs 
	
	@FindBy(xpath = ("//input[@type='text' and @placeholder='Enter username']"))
	public
	WebElement txtUserName;
	
	@FindBy(xpath="//input[@type='password' and @placeholder='Enter password']")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//span[@class='login-big-font login-button-fix']")
	public
	WebElement btnLogin;
	
	public void sendUserName(String UserName) 
	{
		
		txtUserName.sendKeys(UserName);
	}
	
	public void sendPasswor(String pwd) 
	{
		txtPassword.sendKeys(pwd);
	}

	public void ClickCubmit() 
	{
		
		//ewait.until(ExpectedConditions.visibilityOf(btnLogin));
			btnLogin.click();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
}
