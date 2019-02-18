package br.com.carrental.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.carrental.model.NormalClient;

class NormalClientTest {

	@Test
	void testNormalClient() {
		NormalClient client = new NormalClient(5);
	}
 
	@Test 
	void testCheckRentalAgency() {
		NormalClient client = new NormalClient(8);
		assertEquals("Dados inválidos",client.checkRentalAgency(8));
		
		NormalClient client2 = new NormalClient(2);
		assertEquals("FERRARI:WestCar",client2.checkRentalAgency(2));
		
		NormalClient client3 = new NormalClient(3);
		assertEquals("CHEVROLET:SouthCar",client3.checkRentalAgency(3));
		
		NormalClient client4 = new NormalClient(5);
		assertEquals("NAVIGATOR:NorthCar",client4.checkRentalAgency(5));
	}

}
 