package com.generics.gurubank;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.pages.gurubank.Gurubankhome;
import com.pages.gurubank.Gurubanksignup;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest implements Autoconstant
{

	public WebDriver driver;
	
	@BeforeClass
	public void openbrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(gurubankurl);
	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		Gurubanksignup gbsp=new Gurubanksignup(driver);
		gbsp.login();
				
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		Gurubankhome gbhp=new Gurubankhome(driver);
		gbhp.logout();
		
	}
	
	@AfterClass
	public void quit()
	{
		driver.quit();
	}
}
