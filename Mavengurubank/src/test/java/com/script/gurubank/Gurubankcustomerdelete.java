package com.script.gurubank;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.gurubank.Basetest;
import com.pages.gurubank.Gurubankdeletecustomer;
import com.pages.gurubank.Gurubankhome;

public class Gurubankcustomerdelete extends Basetest
{
	@Test
	public void deletecustomer() throws IOException, InterruptedException
	{
		Gurubankhome gbhp=new Gurubankhome(driver);
		gbhp.deletecustomer();
		Gurubankdeletecustomer gbdcp= new Gurubankdeletecustomer(driver);
		gbdcp.deletecustomer();
	}

	

	

}
