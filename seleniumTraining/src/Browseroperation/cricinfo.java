package Browseroperation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricinfo {

	public static void main(String[] args) {
     
		System.setProperty("webdriver.chrome.driver","F:\\JavaWorkspace\\seleniumTraining\\executables\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.gsmarena.com/");
		
		driver.findElement(By.cssSelector("div.brandmenu-v2>ul>:first-child>a")).click();
		
		WebElement samphone=driver.findElement(By.cssSelector("div.makers>ul>:first-child>a>strong"));
		
		List <WebElement> samsungphone=driver.findElements(By.cssSelector(".makers>ul strong"));
		
		System.out.println("Total Number of Samsung Phones :"+samsungphone.size());
		
         for(int i =0;i<samsungphone.size();i++) {
			
			WebElement samsung = samsungphone.get(i);
			
		    String phoneName = samsung.getText();
	}
         driver.navigate().back();

	}
}
