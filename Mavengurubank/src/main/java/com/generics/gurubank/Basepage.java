package com.generics.gurubank;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Basepage 
{
	public void alertaccept(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	
	public void alertdismiss(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
	}
	
	public void javascriptexecuterclick(WebDriver driver,WebElement element)
	{
	
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	public void javascriptexecutersendvalue(WebDriver driver,WebElement element,String value1)
	{
	
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value="+ value1, element);
	}
	
	
	
	public void selectbytext(WebElement element,String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void selectbyvalue(WebElement element,String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void openinnewtab(WebDriver driver,WebElement element) throws AWTException, InterruptedException
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_RIGHT);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		Set<String> windowhandles=driver.getWindowHandles();
		ArrayList<String> a1=new ArrayList<String>(windowhandles);
		driver.switchTo().window(a1.get(1));
		
	}
	
	public void openinnewwindow(WebDriver driver,WebElement element) throws AWTException, InterruptedException
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_RIGHT);
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		Set<String> windowhandles=driver.getWindowHandles();
		ArrayList<String> a1=new ArrayList<String>(windowhandles);
		driver.switchTo().window(a1.get(1));
		
	}
	

}
