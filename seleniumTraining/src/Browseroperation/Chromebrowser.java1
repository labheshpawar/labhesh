package Browseroperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","F:\\JavaWorkspace\\seleniumTraining\\executables\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https:\\demo.actitime.com/login.do");
	
	/*String expectedtitle="actiTIME-login";
	
	String actualTitle=driver.getTitle();
	if(actualTitle.contentEquals(expectedtitle)) {
		System.out.println("login page opened successfully");
		
	}
	else{
		System.out.println("either login or page not fopund");
	}*/
		
		WebElement userinputfield =driver.findElement(By.id("username"));
		userinputfield.sendKeys("admin12334");
	
		userinputfield .clear();
		userinputfield.sendKeys("admin");
		
	     
		
		
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
	   
		
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.id("logoutLink")).click();
		
		
		
	}
	
	
	

	}


