package com.newdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.newpackage.NewPerfom;
//import com.perform.PerformLink;

public class NewDemo {
	
 
	

	
	@Test
	
	public void launchDriver()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
	}
	NewPerfom newper=new NewPerfom(driver);
	
	

}
