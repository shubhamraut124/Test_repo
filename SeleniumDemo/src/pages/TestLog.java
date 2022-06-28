package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.*;
@SuppressWarnings("unused")
public class TestLog {
	WebDriver driver;
	   By user99GuruName = By.name("uid");

	    By password99Guru = By.name("password");

	    By titleText =By.className("barone");

	    By login = By.name("btnLogin");//		declaring the xpaths
	    
		public String strUserName;	

public TestLog(WebDriver driver) {
	this.driver=driver;
	}
	    

	
		public void setUserName(String strUserName){
			 
			driver.findElement(user99GuruName).sendKeys(strUserName);
	    
	}
		
		public void setPassword(String strPassword){

	         driver.findElement(password99Guru).sendKeys(strPassword);

	    }
	    public void clickLogin(){

            driver.findElement(login).click();

    }
	    public void loginToDemoUK(String strUserName,String strPasword){

	    
	    	
	    	//Fill user name

	        this.setUserName(strUserName);

	        //Fill password

	        this.setPassword(strPasword);

	        //Click Login button

	        this.clickLogin();        

	    }
}
