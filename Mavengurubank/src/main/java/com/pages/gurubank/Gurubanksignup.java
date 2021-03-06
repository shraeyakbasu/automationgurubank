package com.pages.gurubank;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.gurubank.Autoconstant;
import com.generics.gurubank.Basepage;
import com.generics.gurubank.Excellibrary;

public class Gurubanksignup extends Basepage implements Autoconstant
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='uid']")
	private WebElement useridtextfield;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordtextfield;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	private WebElement loginbutton;
	
	@FindBy(xpath="//input[@name='btnReset']")
	private WebElement resetbutton;
	
	public Gurubanksignup(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void login() throws IOException
	{
		useridtextfield.sendKeys(Excellibrary.getcellvalue(gurubankexcelpath, sheetlogin, 1, 0));
		passwordtextfield.sendKeys(Excellibrary.getcellvalue(gurubankexcelpath, sheetlogin, 1, 1));
		loginbutton.click();
	}
	
	public void reset()
	{
		resetbutton.click();
	}
	
		
	

}
