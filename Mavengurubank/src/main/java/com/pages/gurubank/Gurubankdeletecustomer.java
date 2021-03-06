package com.pages.gurubank;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.gurubank.Autoconstant;
import com.generics.gurubank.Basepage;
import com.generics.gurubank.Excellibrary;

public class Gurubankdeletecustomer extends Basepage implements Autoconstant
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='cusid']")
	private WebElement customeridtext;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement submitbutton;
	
	@FindBy(xpath="//input[@value='Reset']")
	private WebElement resetbutton;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	private WebElement homelink;
	
	public Gurubankdeletecustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public void deletecustomer() throws IOException, InterruptedException
	{
		customeridtext.sendKeys(Excellibrary.getcellvalue(gurubankexcelpath, sheetnewcustomer, 1, 9));
		javascriptexecuterclick(driver, submitbutton);
		Thread.sleep(3000);
		alertaccept(driver);
		alertaccept(driver);
		javascriptexecuterclick(driver, homelink);
	}
	
}
