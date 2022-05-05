package Browseroperation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonpay {

	private static int i;

	//private static final int i = 0;

	public static void main(String[] args) {
	 
		System.setProperty("webdriver.chrome.driver","F:\\JavaWorkspace\\seleniumTraining\\executables\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> alloptions=driver.findElements(By.cssSelector("#nav-xshop>a"));
		//driver.findElement(By.linkText("Mobiles")).click();
		//driver.navigate().back();
		
		System.out.println("total elements:"+alloptions.size());
		//List<String> l1=new ArrayList<String>();
	//	l1.add("Best Sellers");
		//l1.add("Mobiles");
		for(int i=0;i<alloptions.size();i++);{
			
		}
			WebElement option=alloptions.get(i);
			
			String name=option.getText();
			System.out.println("option name:"+name);
			
			if(name.equals(" Mobiles ")){
				option.click();
				
			}else
			{
				System.out.println("not matched");
			}
			
			driver.navigate().back();
	}
}
			
			
			
				
			
		
	
				
		
		
		
		
		

	


