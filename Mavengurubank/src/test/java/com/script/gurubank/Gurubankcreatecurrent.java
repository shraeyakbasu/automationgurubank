package com.script.gurubank;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.gurubank.Basetest;
import com.pages.gurubank.Gurubankhome;
import com.pages.gurubank.Gurubanknewcurrentaccount;

public class Gurubankcreatecurrent extends Basetest 
{
	
@Test
public void burubankcreatecurrent() throws IOException, AWTException, InterruptedException
{
	Gurubankhome gbhp=new Gurubankhome(driver);
	gbhp.newaccount();
	Gurubanknewcurrentaccount gbca=new Gurubanknewcurrentaccount(driver);
	gbca.createcurrentaccount();
}

}
