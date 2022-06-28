package in.co.zebraDomain.Utilities;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import in.co.zebraDomain.PageObject.calenderIcon;

public class ExtentReporterNG {
	private ExtentReports extent;
	
	public void generateReport(List<XmlSuite> xmlSuite , List<ISuite> suites,
			String OutputDictionry) {
			
		extent=new ExtentReports(OutputDictionry+File.separator+"Extent.html",true);
		
		for (ISuite suite:suites) {
			Map<String ,ISuiteResult>result=suite.getResults();
			
			for (ISuiteResult r:result.values()) {
				ITestContext context=r.getTestContext();
				
				buildTestNodes(context.getPassedTests(),LogStatus.PASS);
				buildTestNodes(context.getPassedTests(),LogStatus.FAIL);
				buildTestNodes(context.getPassedTests(),LogStatus.SKIP);
			}
			
		}
		
		extent.flush();
		extent.close();
			
	}

	private void buildTestNodes(IResultMap tests, LogStatus status) {
		// TODO Auto-generated method stub
		ExtentTest test;
		
		if(tests.size()>0) {
			for(ITestResult result: tests.getAllResults()) {
				test=extent.startTest(result.getMethod().getMethodName());
				
				test.setStartedTime(getTime(result.getStartMillis()));
				test.setEndedTime(getTime(result.getEndMillis()));
				
				for (String group : result.getMethod().getGroups())	
					test.assignCategory(group);
				
				if (result.getThrowable()!=null) {
					test.log(status,result.getThrowable());
				}else {
					test.log(status, "Test "+status.toString().toLowerCase()+"ed");
				}
				extent.endTest(test);
			}
		}
		
	}

	private Date getTime(long endMillis) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		calendar.setTimeInMillis(endMillis);
		return calendar.getTime();
				
	}

}
