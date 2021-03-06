package com.pages.gurubank;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.gurubank.Autoconstant;
import com.generics.gurubank.Basepage;
import com.generics.gurubank.Excellibrary;

public class Gurubankaddnewcustomer extends Basepage implements Autoconstant
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement customernametext;
	
	@FindBy(xpath="(//input[@name='rad1'])[1]")
	private WebElement maleradiobutton;
	
	@FindBy(xpath="(//input[@name='rad1'])[2]")
	private WebElement femaleradiobutton;
	
	@FindBy(xpath="//input[@id='dob']")
	private WebElement dateofbirthtextfield;
	
	@FindBy(xpath="//textarea[@name='addr']")
	private WebElement addresstextfield;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement citytextfield;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement statetextfield;
	
	@FindBy(xpath="//input[@name='pinno']")
	private WebElement pinnotextfield;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	private WebElement telephonenotextfield;
	
	@FindBy(xpath="//input[@name='emailid']")
	private WebElement emailidtextfield;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordtextfield;
	
	@FindBy(xpath="//input[@name='sub']")
	private WebElement submitbutton;
	
	@FindBy(xpath="//input[@name='res']")
	private WebElement resetbutton;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	private WebElement homebutton;
	
	public Gurubankaddnewcustomer(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void newcustomer() throws IOException, InterruptedException
	{
		customernametext.sendKeys(Excellibrary.getcellvalue( gurubankexcelpath,sheetnewcustomer , 1, 0));
		maleradiobutton.click();
		femaleradiobutton.click();
		dateofbirthtextfield.sendKeys(Excellibrary.getcellvalue(gurubankexcelpath, sheetnewcustomer, 1, 1));
		addresstextfield.sendKeys(Excellibrary.getcellvalue(gurubankexcelpath, sheetnewcustomer, 1, 2));
		citytextfield.sendKeys(Excellibrary.getcellvalue(gurubankexcelpath, sheetnewcustomer, 1, 3));
		statetextfield.sendKeys(Excellibrary.getcellvalue(gurubankexcelpath, sheetnewcustomer, 1, 4));
		pinnotextfield.sendKeys(Excellibrary.getcellvalue(gurubankexcelpath, sheetnewcustomer, 1, 5));
		telephonenotextfield.sendKeys(Excellibrary.getcellvalue(gurubankexcelpath, sheetnewcustomer, 1, 6));
		emailidtextfield.sendKeys(Excellibrary.getcellvalue(gurubankexcelpath, sheetnewcustomer, 1, 7));
		passwordtextfield.sendKeys(Excellibrary.getcellvalue(gurubankexcelpath, sheetnewcustomer, 1, 8));
		submitbutton.click();
		Thread.sleep(4000);
		alertaccept(driver);
		homebutton.click();
		//resetbutton.click();
	}
	
	

}
