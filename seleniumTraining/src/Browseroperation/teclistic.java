package Browseroperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class teclistic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\JavaWorkspace\\seleniumTraining\\executables\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.techlistic.com/");
		
		driver.getTitle();
		
		driver.findElement(By.linkText("JAVA")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("SELENIUM")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("BDD")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("TESTING")).click();
		driver.navigate().back();
		
		driver.close();
		

	}

}
