package in.co.zebraDomain.Utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreesnShots {
	public  WebDriver odriver;
	public String FileName_1;
	public String FileName_2;
	public String ab;
	public  void takeSnapShot(WebDriver odriver2,String TC_Name) throws IOException {
		// TODO Auto-generated method stub
		 Date date = Calendar.getInstance().getTime();  
         DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
         String FileName_1 = dateFormat.format(date);  
         FileName_2=FileName_1.toString().replace(":", "_").replace("-","_").replace(" ","_");
		 TakesScreenshot scrShot =((TakesScreenshot)odriver2);
		 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
         File DestFile=new File("D://SHubham//Java//WorkSpace//zebraDomain//Screenshot//"+TC_Name+"_"+FileName_2+".png");
         FileUtils.copyFile(SrcFile, DestFile);
         
	}
}
