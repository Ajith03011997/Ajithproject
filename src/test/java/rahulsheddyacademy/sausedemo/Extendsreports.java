package rahulsheddyacademy.sausedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extendsreports {
	ExtentReports extent;
	
	@BeforeTest
	public void config() {
		

	//create an folder for extend report by giving project path
	String path=System.getProperty("user.dir")+"\\Results\\test.html";
	
	//Create an object first
	ExtentSparkReporter report=new ExtentSparkReporter(path);
	report.config().setReportName("Ajith automation");
	report.config().setDocumentTitle("Test results");
	
	//create object for extent report
	extent=new ExtentReports();
	extent.attachReporter(report);
	extent.setSystemInfo("tester", "guru");
	

	
	}
	
	
	
	
	@Test
	public void invokebrowser() {
		extent.createTest("invoke browser");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.getTitle();
		driver.close();
		extent.flush();
	}
}
