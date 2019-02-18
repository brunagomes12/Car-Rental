package br.com.carrental.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.carrental.model.NormalClient;
import br.com.carrental.rentcalculation.PremiumClientCalculation;

class PremiumClienteCalculationTest {

	@Test
	void testPremiumClientCalculation() {
		PremiumClientCalculation client = new PremiumClientCalculation(5);
	}

	@Test
	void testCalculateSouthCar() {
		PremiumClientCalculation client = new PremiumClientCalculation(5);
		assertEquals(630,client.calculateSouthCar(3, 2));
	}

	@Test
	void testCalculateWestCar() {
		PremiumClientCalculation client = new PremiumClientCalculation(5);
		assertEquals(1410,client.calculateWestCar(7, 4));
	}

	@Test
	void testCalculateNorthCar() {
		PremiumClientCalculation client = new PremiumClientCalculation(5);
		assertEquals(2930,client.calculateNorthCar(2, 3));
	}

	@Test
	void testCheckRentalAgency() {
		PremiumClientCalculation client = new PremiumClientCalculation(5);
		
		assertEquals(630,client.calculateSouthCar(3, 2));
		
		assertEquals(1410,client.calculateWestCar(7, 4));
		
		assertEquals(2930,client.calculateNorthCar(2, 3));		
	}

}
