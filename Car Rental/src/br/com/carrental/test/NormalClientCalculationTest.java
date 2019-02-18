package br.com.carrental.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.carrental.rentcalculation.NormalClientCalculation;
import br.com.carrental.rentcalculation.PremiumClientCalculation;

class NormalClientCalculationTest {
	
	@Test
	void testNormalClientCalculation() {
		NormalClientCalculation client = new NormalClientCalculation(5);
	}

	@Test
	void testCalculateSouthCar() {
		NormalClientCalculation client = new NormalClientCalculation(5);
		assertEquals(1030,client.calculateSouthCar(3, 2));
	}

	@Test
	void testCalculateWestCar() {
		NormalClientCalculation client = new NormalClientCalculation(5);
		assertEquals(4510,client.calculateWestCar(7, 4));
	} 

	@Test
	void testCalculateNorthCar() {
		NormalClientCalculation client = new NormalClientCalculation(5);
		assertEquals(3060,client.calculateNorthCar(2, 3));
	}

	@Test
	void testCheckRentalAgency() {
		NormalClientCalculation client = new NormalClientCalculation(5);
		
		assertEquals(1030,client.calculateSouthCar(3, 2));
		
		assertEquals(4510,client.calculateWestCar(7, 4));
		
		assertEquals(3060,client.calculateNorthCar(2, 3));		
	}

}
