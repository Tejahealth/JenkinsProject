package com.santosh.selenium.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("http://www.gmail.com");
	  driver.manage().window().maximize();
	  driver.close();
  }

 /* @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
  }
*/
}
