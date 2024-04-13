package rahulsheddyacademy.sausedemo;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] listofitems= {"Sauce Labs Backpack","Sauce Labs Bike Light","Sauce Labs Bolt T-Shirt","Sauce Labs Bike Light"};
		
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("user-name"));
		username.click();
		username.sendKeys("standard_user");
		WebElement password=driver.findElement(By.id("password"));
		password.click();
		password.sendKeys("secret_sauce");
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();
		driver.findElements(By.id("inventory_container"));
		List<WebElement> products=driver.findElements(By.cssSelector("div.inventory_item_name"));
		
		for(int i=0;i<products.size();i++) {
			String itemslist=products.get(i).getText();
			List itemsneeded=Arrays.asList(listofitems);
		if(itemsneeded.contains(itemslist)){
			driver.findElements(By.xpath("//button[@class='btn_primary btn_inventory']")).get(i).click();
			Thread.sleep(4000);
			
			
		}
		}
		
		
		
    }
}
