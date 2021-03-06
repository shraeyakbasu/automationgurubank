package com.pages.gurubank;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.gurubank.Autoconstant;
import com.generics.gurubank.Basepage;

public class Gurubankhome extends Basepage implements Autoconstant
{
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	private WebElement newcustomerbutton;
	
	@FindBy(xpath="//a[contains(text(),'Edit Customer')]")
	private WebElement editcustomerbutton;
	
	@FindBy(xpath="(//a[contains(text(),'Delete Customer')])[2]")
	private WebElement deletecustomerbutton;
	
	@FindBy(xpath="//a[contains(text(),'New Account')]")
	private WebElement newaccountbutton;
	
	@FindBy(xpath="//a[contains(text(),'Edit Account')]")
	private WebElement editaccountbutton;
	
	@FindBy(xpath="//a[contains(text(),'Delete Account')]")
	private WebElement deleteaccountbutton;
	
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	private WebElement logoutbutton;
	
	
	public Gurubankhome(WebDriver driver) 
	 {
		    this.driver=driver;
			PageFactory.initElements(driver, this);
	}
	
		
	
	
	public void newcustomer() throws AWTException, InterruptedException
	{
		openinnewtab(driver, newcustomerbutton);
		//newcustomerbutton.click();
	}

	public void editcustomer()
	{
		editcustomerbutton.click();
	}
	
	public void deletecustomer()
	{
		deletecustomerbutton.click();
	}
	
	public void newaccount() throws AWTException, InterruptedException
	{
		openinnewwindow(driver, newaccountbutton);
		//newaccountbutton.click();
	}
	
	public void editaccount()
	{
		editaccountbutton.click();
	}
	
	public void deleteaccount()
	{
		deleteaccountbutton.click();
	}
	
	public void logout() throws InterruptedException
	{
		
		logoutbutton.click();
		
	}
}
