package Browseroperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	public static void main(String[] args) {
     
		System.setProperty("webdriver.chrome.driver", "F:\\JavaWorkspace\\seleniumTraining\\executables\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.linkText("Mobiles")).click();
		
		System.out.println("Mobiles");
		
		driver.navigate().back();
		
		driver.quit();
	}

}
