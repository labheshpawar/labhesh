package Browseroperation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricinfoipl {

	public static void main(String[] args) {
	  
		System.setProperty("webdriver.chrome.driver", "F:\\JavaWorkspace\\seleniumTraining\\executables\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.espncricinfo.com/");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		List <WebElement> alloptions=driver.findElements(By.cssSelector("div.ds-popper-wrapper>a"));
		
		System.out.println("TOTAL ELEMENTS:"+alloptions.size());
		
		for(int i=0;i<alloptions.size();i++) {
			WebElement option=alloptions.get(i);
			String name=option.getText();
			System.out.println("option name:"+name);
			
		if(name.equals("Stats")) {
			System.out.println("matched");
			option.click();
			
			break;
		}
		else {
			System.out.println("NOT MATCHED.....");
		}
		}
		driver.navigate().back();
		
		driver.close();

	}

}
