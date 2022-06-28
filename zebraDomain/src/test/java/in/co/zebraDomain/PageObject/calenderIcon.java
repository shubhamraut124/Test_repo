package in.co.zebraDomain.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class calenderIcon {
	 WebDriver driver;

		public calenderIcon(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);

		}
		
		@FindBy(xpath = "//i[@class='icon-timeline']")
		WebElement calenderIcon1;
		
		
		public void ClickCalendar() {
			calenderIcon1.click();
		}
}
