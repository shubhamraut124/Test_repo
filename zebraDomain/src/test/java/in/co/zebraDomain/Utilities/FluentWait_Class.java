package in.co.zebraDomain.Utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWait_Class {
	
	WebDriver driver=new ChromeDriver();
	
	public void fluentwaitmethod(final WebElement xpathOfElement) {
		
	
	  try {
			
			
		    Wait<WebDriver> gwait = new FluentWait<WebDriver>(driver)
		    	       .withTimeout(Duration.ofSeconds(60))
		    	       .pollingEvery(Duration.ofMillis(5))
		    	       .ignoring(NoSuchElementException.class);

		    	   WebElement foo = gwait.until(new Function<WebDriver, WebElement>() {
		    	     public WebElement apply(WebDriver driver) {
		    	       return xpathOfElement;
		    	     }
		    	   });
		   } 
		    	   catch (Exception e) {
		    			// TODO: handle exception
		    		}
}
}
