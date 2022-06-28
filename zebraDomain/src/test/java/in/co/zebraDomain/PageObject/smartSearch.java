package in.co.zebraDomain.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import zebraDomain.zebraDomain.TestCases.BaseClass;

public class smartSearch {
	WebDriver driver;
	
	
	//WebDriverWait ewait=new WebDriverWait(driver, 20);
	public smartSearch(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	@FindBy(xpath = "//div/div/div[2]/button/span")
	WebElement arrowDown;
	
	@FindBy(xpath = "//input[@formcontrolname='smText']")
	WebElement searchstrip;
	
	@FindBy(xpath = "(.//*[contains(text(),\"Search\")])[2]")
	WebElement searchButton;
	
	
	@FindBy(xpath = "//div/div[2]/div/ul/li//i[@class='icon-mywork module-menu-icon ng-star-inserted']")
	WebElement MyWorkIcon;
	
	public void ClickArrowDown() {
		//ewait.until(ExpectedConditions.visibilityOf(arrowDown));
		System.out.println("again waiting for smart search to appear");	
		arrowDown.click();
	}
	
	public void ClickSearchStrip() {
		searchstrip.click();
		searchstrip.sendKeys("a");
	}
	
	public void searchButton() {
	//	ewait.until(ExpectedConditions.visibilityOf(searchButton));
		searchButton.click();
	}
	
	public void Mywork_icon() {
		//ewait.until(ExpectedConditions.visibilityOf(MyWorkIcon));
		System.out.println("again waiting for mywork to appear");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/div[2]/div/ul/li//i[@class='icon-mywork module-menu-icon ng-star-inserted']")));
		MyWorkIcon.click();
	}
}