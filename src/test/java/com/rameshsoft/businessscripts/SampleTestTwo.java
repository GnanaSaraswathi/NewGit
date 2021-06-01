package com.rameshsoft.businessscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTestTwo {

	@Test
	public static void testTwo() throws InterruptedException {
		System.out.println("Person 2 modifications...");
		System.out.println("Person 1 modifications...");
		System.out.println("Person 1 modifications...");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser launched successfully");
		driver.manage().window().maximize();
		System.out.println("Maximised the browser");
		driver.get("https://www.flipkart.com");
		System.out.println("Navigated to : " +driver.getCurrentUrl());
		Thread.sleep(4000);
		driver.close();
		
	}
	
	
}
