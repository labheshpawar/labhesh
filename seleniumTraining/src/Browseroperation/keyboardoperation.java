package Browseroperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboardoperation {

	public static void main(String[] args) {
		
		  
				System.setProperty("webdriver.chrome.driver", "F:\\JavaWorkspace\\seleniumTraining\\executables\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				driver.get("https://demo.actitime.com/login.do");
				
				WebElement username=driver.findElement(By.id("username"));
				
				username.sendKeys("admin");
				
				username.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
				
				driver.findElement(By.name("pwd")).sendKeys(Keys.chord(Keys.CONTROL,"v"),Keys.ENTER  );
				

	}

}
