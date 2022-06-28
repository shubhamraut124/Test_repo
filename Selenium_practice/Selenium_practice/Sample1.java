package Selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class Sample1 {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubham\\eclipse-workspace\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("www.facebook.com");
		String str=driver.getTitle();
		System.out.println(str);
	}
}
