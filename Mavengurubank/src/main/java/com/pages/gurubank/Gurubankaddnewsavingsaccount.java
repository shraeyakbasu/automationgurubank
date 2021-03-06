package com.pages.gurubank;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.gurubank.Autoconstant;
import com.generics.gurubank.Basepage;
import com.generics.gurubank.Excellibrary;

public class Gurubankaddnewsavingsaccount extends Basepage implements Autoconstant
{

	WebDriver driver;
	
	@FindBy(xpath="//input[@name='cusid']")
	private WebElement cusidtext;
	
	@FindBy(xpath="//select[@name='selaccount']")
	private WebElement accounttypedropdown;
	
	@FindBy(xpath="//input[@name='inideposit']")
	private WebElement initialdeposittext;
	
	@FindBy(xpath="//input[@name='button2']")
	private WebElement submitbutton;
	
	@FindBy(xpath="//input[@name='reset']")
	private WebElement resetbutton;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	private WebElement homelink;
	
	public Gurubankaddnewsavingsaccount(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void createsavingsaccount() throws IOException
	{
		cusidtext.sendKeys(Excellibrary.getcellvalue(gurubankexcelpath, sheetsavingsaccoount, 1, 0));
		selectbytext(accounttypedropdown, "Savings");
		initialdeposittext.sendKeys("3000");
		javascriptexecuterclick(driver, submitbutton);
		javascriptexecuterclick(driver, homelink);
	}
	
	
	
	
	
	
	
}
