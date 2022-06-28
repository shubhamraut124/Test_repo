package pages;

import java.util.concurrent.TimeUnit;
import pages.*;
import test.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class baseClass {
	 WebDriver driver;
	
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\seleniium_jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/v4/");
		driver.manage().window().maximize();
		
		TestLog TestLog=new TestLog(driver);
		TestClass TC=new TestClass();
		System.out.println("providing the values");
		TestLog.loginToDemoUK("mngr207051","mymUgah");
		System.out.println("shubham login zala");
		System.out.println("testNG");
		TC.me("d");
		System.out.println("vishay khop ata stdy kara");
//		LoginHome l= new LoginHome(driver);
//		String str=l.getHomePageDashboardUserName();
//		System.out.println(str);
//		
	}

	
}
