package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import pages.LoginHome;

import pages.TestLog;

public class TestClass {

    WebDriver driver;
    LoginHome LoginHome= new LoginHome(driver);
   
    //constructor
    
    public TestClass() {
		// TODO Auto-generated constructor stub
    	this.driver=driver;
	}
    
    @Test(priority=0)

    public void test_Home_Page_Appear_Correct(String str1){
    System.out.println("hgf");
   
    	String xy=LoginHome.getHomePageDashboardUserName();
    	System.out.println(xy);
    	
    	
    	System.out.println("printing in test class");
    	System.out.println("test1");
    	Assert.assertTrue(LoginHome.getHomePageDashboardUserName().toLowerCase().contains("manger id : mngr207051"));

    }
    
    public void me(String stringdd) {
    	System.out.println("into ");
    	//String sbc=LoginHome.getHomePageDashboardUserName();
    	//System.out.println(sbc);
    	this.test_Home_Page_Appear_Correct("d");
    	
    }
}