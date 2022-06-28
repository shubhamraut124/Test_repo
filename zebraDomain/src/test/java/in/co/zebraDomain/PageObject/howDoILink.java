package in.co.zebraDomain.PageObject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class howDoILink {

	WebDriver udriver;

	public howDoILink(WebDriver driver) {
		this.udriver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div/app-quick-links/button/span/i")
	WebElement arrow;
	
	@FindBy(xpath="//i[@class='icon-close cross-icon']")
	WebElement closeFV;
	

	public void ClickarrOw() {
		arrow.click();
		
	}

	public void CloseFVicon() {
		WebDriverWait wait = new WebDriverWait(udriver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='icon-close cross-icon']")));
		closeFV.click();
	}
	
	
	@FindBy(linkText ="(//li[@class='ng-star-inserted'][16]/a")
	WebElement projectInboxLink;
	
	public void clickProjectInboxLink() {
		udriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	ewait.until(ExpectedConditions.visibilityOf(projectInboxLink));
		projectInboxLink.click();
	}

}
