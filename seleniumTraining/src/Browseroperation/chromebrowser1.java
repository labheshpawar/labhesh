package Browseroperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\JavaWorkspace\\seleniumTraining\\executables\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://crmaccess.vtiger.com/log-in/");
        
        WebElement userinputfield=driver.findElement(By.name("username"));
        userinputfield.sendKeys("admin1234");
        userinputfield.clear();
        userinputfield.sendKeys("admin");
        
        WebElement passwordinputfield=driver.findElement(By.name("password"));
        passwordinputfield.sendKeys("manager");
        
        driver.findElement(By.name("signinButton")).click();
       
	}

}
