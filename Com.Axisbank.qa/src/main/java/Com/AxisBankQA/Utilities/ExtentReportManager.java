package Com.AxisBankQA.Utilities;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
	public ExtentSparkReporter sparkReporter; // UI of the report
	public ExtentReports extent; //populate common info on the report
	public ExtentTest test; // creating test case entries in the report and update status of the test methods
	
	public void onStart(ITestContext context) {
	
	Date d = new Date();
	String CurrentDate = d.toString().replace(" ", "").replace(":", "_");
	
	sparkReporter=new ExtentSparkReporter (System.getProperty("user.dir")+"/reports/TestReport.html-"+CurrentDate);//spec
	sparkReporter.config().setDocumentTitle("Automation Report"); // TiTle of report
	sparkReporter.config().setReportName("Functional Testing"); // name of the report
	sparkReporter.config().setTheme(Theme.DARK);
	
	extent=new ExtentReports();
	extent.attachReporter (sparkReporter);
	

	extent.setSystemInfo("Computer Name", "localhost");
	extent.setSystemInfo("Environment", "QA");
	extent.setSystemInfo("Tester Name", "Shyam Narwade");
	extent.setSystemInfo("os", "Windows10");
	extent.setSystemInfo("Browser name", "Chrome");

	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		test= extent.createTest(result.getName()); // create a new enty in the report
		test.log(Status.PASS, "Test case PASSED is:" + result.getName()); // update status p/f/s
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case FAILED is:" + result.getName());
		test.log(Status.FAIL, "Test Case FAILED cause is:" + result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test= extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case SKIPPED is:" + result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
		
	}

	@Override
	public void onTestStart(ITestResult result) {
	
		
	}



}
