package com.datadrive.selenium;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class SimpleTest {
	@Test
	public void testPage() throws InterruptedException
	{ 

	WebDriver driver;

	driver = new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

	driver.get("http://www.vpl.ca");

	WebElement searchField;
	searchField = driver.findElement(By.xpath("//input[@id='globalQuery']"));

	searchField.click();

	searchField.sendKeys("java");

	WebElement searchButton;
	searchButton = driver.findElement(By.xpath("//input[@class='search_button']"));

	searchButton.click();
	Thread.sleep(5000);

	String resultsPageUrl = "t=keyword";

	assertTrue("this is not the results page", driver.getCurrentUrl().indexOf(resultsPageUrl) >= 0);

	driver.quit(); 

	} 
}