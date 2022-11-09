package Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporting {

	ExtentReports extent;

	@BeforeTest
	public void config()
	{
	// ExtentReports , ExtentSparkReporter
	String path =System.getProperty("user.dir")+"\\reports\\index.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setReportName("Web Automation Results");
	reporter.config().setDocumentTitle("Test Results");
	extent =new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "USA SATYA");
	}
	@Test
	public void initialDemo()
	{
	ExtentTest test= extent.createTest("Initial Demo");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\003MWK744\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://rahulshettyacademy.com");
	System.out.println(driver.getTitle());
	driver.close();
	//test.fail("Result do not match");
	extent.flush();
	}

}
