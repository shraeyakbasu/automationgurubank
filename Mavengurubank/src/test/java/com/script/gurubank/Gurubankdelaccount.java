package com.script.gurubank;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.gurubank.Basetest;
import com.pages.gurubank.Gurubankdeleteaccount;
import com.pages.gurubank.Gurubankhome;

public class Gurubankdelaccount extends Basetest
{
	@Test
	public void deleteaccount() throws IOException
	{
		Gurubankhome gbhp=new Gurubankhome(driver);
		gbhp.deleteaccount();
		Gurubankdeleteaccount gbdac=new Gurubankdeleteaccount(driver);
		gbdac.deleteaccount();
	}

}
