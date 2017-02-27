package ci_test.ci_test;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
  @Test
  public void f() {
	  System.out.println("Test");
	  System.setProperty("webdriver.chrome.driver", "//C://Users//Artur_Mkrtchyan//workspace//SeleniumDrivers//chrome//chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://google.com");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Start Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("End Method");
  }

}

