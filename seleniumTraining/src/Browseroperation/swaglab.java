package Browseroperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swaglab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\JavaWorkspace\\seleniumTraining\\executables\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");
        
        
        WebElement userInputfield=driver.findElement(By.id("user-name"));
        userInputfield.sendKeys("admin12344");
        userInputfield.clear();
        userInputfield.sendKeys("standard_user");
        
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        
        driver.findElement(By.id("login-button")).click();
        driver.navigate().back();
        driver.close();
        
	}

}
