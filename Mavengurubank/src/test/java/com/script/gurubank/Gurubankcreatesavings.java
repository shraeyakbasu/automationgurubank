package com.script.gurubank;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.gurubank.Basetest;
import com.pages.gurubank.Gurubankaddnewsavingsaccount;
import com.pages.gurubank.Gurubankhome;

public class Gurubankcreatesavings extends Basetest
{

	@Test
	public void gurubankcreatesavings() throws IOException, AWTException, InterruptedException
	{
		Gurubankhome gbhp=new Gurubankhome(driver);
		gbhp.newaccount();
		Gurubankaddnewsavingsaccount gbsa=new Gurubankaddnewsavingsaccount(driver);
		gbsa.createsavingsaccount();
	}
	
}
