package in.co.zebraDomain.PageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class report_ICON_check {
	 WebDriver driver;

		public report_ICON_check(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);

		}
		
		@FindBy(xpath = "//i[@class='icon-rar module-menu-icon ng-star-inserted']")
		WebElement reportICON_;
		
		
		
		public void ClickreportICon() {
			reportICON_.click();
		}
		
		public void ClickReportName() {
			List<WebElement> list1=driver.findElements(By.xpath("//div[@class='ps']//div[@class='ps-content']//mat-expansion-panel"));
			System.out.println(list1.size());
			
			
			
			  for (int i = 0; i < list1.size(); i++) {
					
					  if(list1.get(i).getText().contains("Reporting")) {
					  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					  list1.get(i).click(); 
					  break;
					  
					  }
					  
				  }
			  
			  // selecting the report from the reporting page 
			  
			  
			  List<WebElement> list=driver.findElements(By.xpath("//div[@class='mat-list-item-content']//span"));
				System.out.println(list.size());
			  /*
				 * for(int i=0; i<list.size();i++) { System.out.println(list.get(i).getText());
				 * }
				 */
		
			  
			 
		}
}

