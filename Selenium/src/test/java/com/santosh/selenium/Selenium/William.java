package com.santosh.selenium.Selenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;

public class William {
	
	WebDriver driver;
	private String strGambleware;
	

	@Test
	public void test() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://sports.williamhill.com/bet/en-gb");
		driver.findElement(By.linkText("In-Play Betting")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		try {
			assertEquals(title, "All Events");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String emptySlip = driver.findElement(By.id("betslip_count")).getText();
		System.out.println(emptySlip);
		
		
		
		//driver.findElement(By.linkText("Live In-Play")).click();
		
		/*driver.findElement(By.linkText("Responsible Gambling")).getAttribute(
				"href");
		
		System.out.println(strGambleware + " Link exists");
		
		String emptySlip = driver.findElement(By.id("slipEmpty")).getText();
		System.out.println(emptySlip);
		//Assert.assertTrue(1 > 2);
		assertEquals(emptySlip, "Your bet slip is currently empty");*/
		
	/*	strGambleware = driver.findElement(
				By.xpath("//*[@id="footerSub"]/div/ul/li/a[3]")).getAttribute(
				"href");
		assertEquals("Gableware link Not found",
				"http://www.gambleaware.co.uk/", strGambleware);
		System.out.println(strGambleware + " Link exists");*/
		
		/*strGambleware = driver.findElement(
				By.xpath(".//*[@id='footerSub']/div/ul/li/a[3]")).getAttribute(
				"href");
		assertEquals("Gableware link is Not found",
				"http://www.gambleaware.co.uk/", strGambleware);
		System.out.println(strGambleware + " Link exists");
*/
		
		
		
		
	}

}
