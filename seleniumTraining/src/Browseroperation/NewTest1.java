package Browseroperation;

import org.testng.annotations.Test;

public class NewTest1 {
  @Test(priority=1)
  public void login() {
	  System.out.println("hello labhesh pawar");
	  
  }
  
  @Test(priority=2)
  public void sendemail() {
	  System.out.println("hello i m labhesh");
  }
  
  @Test(priority=3)
  public void logout() {
	  System.out.println("hello i m labhesh");
  }
}
