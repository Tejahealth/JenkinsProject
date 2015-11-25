package com.santosh.selenium.Selenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataDriveCsv  {
	private WebDriver driver;
	private String baseUrl;
	private WebDriverWait wait;
	 private String strGambleware;


	@Before
	public void setUp() throws Exception {

		// Set the Base URL - Initialise the driver to be a FF Driver
		// Set the Implicit (default) wait to be 30 Seconds

		baseUrl = "http://sports.williamhill.com/bet/en-gb/";
		driver = new FirefoxDriver();

		// Manage the Browser Properties
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Set Explicit Wait Time Globally
		wait = new WebDriverWait(driver, 30);
	}
		
	@Test
	public void sportsBettingTest(String sport, String value){
		
		driver.get(baseUrl);
		
		driver.findElement(By.id(sport)).click();
		
		String emptySlip = driver.findElement(By.id(value)).getText();
		System.out.println(emptySlip);
		Assert.assertTrue(1 < 2);
		assertEquals(emptySlip, "Your bet slip is currently empty");
		
		
				strGambleware = driver.findElement(By.xpath("//img[contains(@src,'http://secdn.williamhill.com/content/content/gamble-aware.gif')]")).getAttribute(
						"href");
				System.out.println(strGambleware);
				assertEquals("Gableware link Not found",
						"Hello ", strGambleware);
				System.out.println(strGambleware + " Link exists");
		
		String Pagetitle = driver.getTitle();
		System.out.println(Pagetitle);
		try {
			assertEquals(Pagetitle, "Football betting at William Hill – Come and have a bet");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		
		
		
		
		
		
	}


}
