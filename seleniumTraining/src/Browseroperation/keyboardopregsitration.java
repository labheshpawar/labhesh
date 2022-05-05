package Browseroperation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class keyboardopregsitration {

	public static void main(String[] args) {
	  
		SeleniumUtility s1=new SeleniumUtility();
		
		WebDriver driver=s1.setUp("chrome","http://demo.automationtesting.in/Register.html");
		
		Actions act = new Actions(driver);
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Selenium");
		//act.sendKeys(Keys.ENTER).perform();
		act.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(1))
		.sendKeys("Webdriver")
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(1))
        .sendKeys("At.beed")
        .sendKeys(Keys.TAB)
        .pause(Duration.ofSeconds(1))
        .sendKeys("asdasdasd")
        .sendKeys(Keys.TAB)
        .build().perform();
		
		
      
		
	
		
	
		
	
	}
	

}
