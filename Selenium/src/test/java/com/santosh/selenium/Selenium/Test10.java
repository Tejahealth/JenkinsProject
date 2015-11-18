package com.santosh.selenium.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("first one");
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.close();

	}

}
