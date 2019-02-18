package br.com.carrental.test;

import java.util.ArrayList;

import org.junit.*;

import br.com.carrental.rentcalculation.OrganizeData;

public class OrganizeDataTest {
	
	@Test
	public void stestSplitData() {
		String[] infos;
	
		infos =  OrganizeData.splitData("a:b:c:d");
		Assert.assertEquals("a", infos[0]);
		Assert.assertEquals("b", infos[1]);
		Assert.assertEquals("c", infos[2]);
		Assert.assertEquals("d", infos[3]);
		
	}
	
	@Test
	public void testCalculateRatesWeekend() {
		ArrayList<String> days = new ArrayList<String>();
		
		days.add("saba");
		days.add("sab");
		days.add("dom");
		days.add("domi");
		days.add("seg");
		
		int n = OrganizeData.calculateRatesWeekend(days);
		Assert.assertEquals(n == 2 , days);
	}
	

}
