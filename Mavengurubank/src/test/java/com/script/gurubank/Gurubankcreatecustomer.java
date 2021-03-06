package com.script.gurubank;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.gurubank.Basetest;
import com.pages.gurubank.Gurubankaddnewcustomer;
import com.pages.gurubank.Gurubankhome;

public class Gurubankcreatecustomer extends Basetest

{
	@Test
	public void createcustomer() throws IOException, InterruptedException, AWTException
	{
		Gurubankhome gbhp=new Gurubankhome(driver);
		gbhp.newcustomer();
		Gurubankaddnewcustomer gbacp=new Gurubankaddnewcustomer(driver);
		gbacp.newcustomer();
	}

}
