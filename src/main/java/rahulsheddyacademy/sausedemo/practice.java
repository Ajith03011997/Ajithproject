package rahulsheddyacademy.sausedemo;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] list= {"Cucumber","Tomato"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        List<WebElement> productslist=driver.findElements(By.cssSelector("h4.product-name"));
        
        
         for(int i=0;i<productslist.size();i++)
       {
    	   String[] items=productslist.get(i).getText().split("-");
    	   String inthelist=items[0].trim();
    	   List itemsneed=Arrays.asList(list);
    	   if(itemsneed.contains(inthelist))
    	   {
    		   driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
    	   }
       }
        
        
       // all products=(//div[@class='product'])
        		
        	//	add to button //button[text()='ADD TO CART']
        
	
	}

}
