package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReportfirst {
	
	static ExtentReports extent = new ExtentReports();	
	
		
		public static ExtentReports ExtentReportObject()
		{
			String path = System.getProperty("user.dir")+"\\reports\\index.html";
			ExtentSparkReporter reporter =new ExtentSparkReporter(path);
			reporter.config().setDocumentTitle("Test Results");
			reporter.config().setReportName("Web Automation Framework.revised Results");
			
			extent.attachReporter(reporter);
			extent.setSystemInfo("Tester", "Rasika Chaudhari");
			return extent;
		}
		
	


	}


