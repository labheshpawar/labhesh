package Browseroperation;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class actiTIME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub9
		
		System.setProperty("webdriver.chrome.driver","F:\\JavaWorkspace\\seleniumTraining\\executables\\chromedriver.exe");
        
		 
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		System.out.println(driver.getTitle());
		
		
		Assert.assertEquals(driver.getTitle(), "actiTIME - Login","page login or not");
		
		WebElement userNameInputfield =driver.findElement(By.name("username"));
		userNameInputfield.sendKeys("admin");
		Assert.assertTrue(userNameInputfield.isDisplayed());
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		WebElement checkbox=driver.findElement(By.name("remember"));
		
		Assert.assertTrue(checkbox.isDisplayed());
		Assert.assertFalse(checkbox.isSelected());
		
		driver.findElement(By.id("loginButton")).click();
	
	
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
		
		
		
		
	   
	}

}
