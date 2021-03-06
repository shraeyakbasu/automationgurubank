package com.pages.gurubank;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.gurubank.Autoconstant;
import com.generics.gurubank.Basepage;
import com.generics.gurubank.Excellibrary;

public class Gurubankdeleteaccount extends Basepage implements Autoconstant
{

	WebDriver driver;
	
	@FindBy(xpath="//input[@name='accountno']")
	private WebElement accountnotext;
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	private WebElement submitbutton;
	
	@FindBy(xpath="//input[@name='res']")
	private WebElement resetbutton;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	private WebElement homelink;
	
	public Gurubankdeleteaccount(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void deleteaccount() throws IOException
	{
		accountnotext.sendKeys(Excellibrary.getcellvalue(gurubankexcelpath, sheetsavingsaccoount, 1, 1));
		submitbutton.click();
		alertaccept(driver);
		homelink.click();
	}
	
}
