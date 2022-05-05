package Browseroperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\JavaWorkspace\\seleniumTraining\\executables\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.linkText("Mobiles")).click();
		
		//driver.findElement(By.id("ap_email")).sendKeys("manager");
		
		//driver.findElement(By.id("continue")).click();
		
		driver.navigate().back();
		
		driver.close();
		
		
		

	}

}
