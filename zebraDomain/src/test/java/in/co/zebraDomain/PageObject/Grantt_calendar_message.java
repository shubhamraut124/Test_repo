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

public class Grantt_calendar_message {
	
	
	//WebDriverWait ewait=new WebDriverWait(bc.driver, 20);

	 WebDriver driver;

	public Grantt_calendar_message(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//div/div[2]/div/ul/li[2]//i[@class='icon-qdocs-1 module-menu-icon ng-star-inserted']")
	WebElement TaskManagerIcon;
	
	@FindBy(xpath ="//h3[@text='Event']" )
	WebElement 	validat_1;
	
	@FindBy(xpath = "//i[@class='icon-calendar-view']")
	WebElement Grantt;
	
	//	String ValidateGrantt=udriver.findElement(By.xpath("//h3[@text='Event']")).getText();
	
	/*
	 * public void TaskManagerIco() { TaskManagerIcon.click();
	 * 
	 * }
	 */
	
	public void ClickGrantt() {
		//ewait.until(ExpectedConditions.visibilityOf(Grantt));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	//	WebDriverWait Wait =new WebDriverWait(driver, 30)
		Grantt.click();
	}
	
	/*public void ValidateGrant() {
		System.out.println(ValidateGrantt);
		if (ValidateGrantt.equals("Events")) {
			System.out.println("pass");
		} else {
// take scrn shot
			System.out.println("fail");
		}*/
	//}
}
