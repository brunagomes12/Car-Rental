package br.com.carrental.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.carrental.rentcalculation.NormalClientCalculation;


class NormalClientCalculationTest {

	@Test
	void textCheckRentalAgency() {
		int results = NormalClientCalculation.checkRentalAgency(4, 4, 1);
		assertEquals(2320, results);
	}

}
