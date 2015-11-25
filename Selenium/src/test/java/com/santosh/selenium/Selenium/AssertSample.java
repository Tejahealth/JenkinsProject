package com.santosh.selenium.Selenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class AssertSample {

	private WebDriver driver;
	private String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		
		baseUrl = "http://sports.williamhill.com/bet/en-gb/";
		driver = new HtmlUnitDriver();

		// Manage the Browser Properties
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void sportsbookBrowserTest() {

		driver.get(baseUrl);
		WebElement element =  driver.findElement(
				By.xpath(".//*[@id='footerSub']/div/ul/li/a[3]"));
		System.out.println(element.getAttribute("href"));
		assertEquals("Gamble link not found", element.getAttribute("href"), "http://www.gambleaware.co.uk/");
		
		WebElement title = driver.findElement(By.id("slipEmpty"));
		title.getText();
		System.out.println(title.getText());
		Assert.assertTrue(1<2);
		assertEquals(title.getText(), " ");
		
		
		
}
}