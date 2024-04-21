package rahulsheddyacademy.sausedemo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Extendsreports  {
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
	
	@Parameters({"URL"})
	@Test
	public void invokebrowser(String appURL) throws InterruptedException {
		extent.createTest("invoke browser");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(appURL);
		driver.getTitle();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	//user.sendKeys("standard_user");
		Locators locators=new Locators(driver);
		locators.useremail.sendKeys("standard_user");
		locators.pass.sendKeys("secret_sauce");
		
		//pass.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		extent.flush();

	}

	@Test
	public void testcase2()
	{
		System.out.println("This is my test2");
		}
}
