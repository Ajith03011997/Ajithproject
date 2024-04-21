package rahulsheddyacademy.sausedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators  {
	
	WebDriver driver;
	public Locators(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//WebElement nameofuser=driver.findElement(By.id("user-name"));
	@FindBy(id="user-name")
	WebElement useremail;
	@FindBy(id="password")
	WebElement pass;
	
	public void loginpage(String name ,String password)
	{
	   useremail.sendKeys(name);
	  pass.sendKeys(password);
	  
	   
	}
	
	

	

	
}


       //driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");