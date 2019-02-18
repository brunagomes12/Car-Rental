package br.com.carrental.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;;
import br.com.carrental.rentcalculation.OrganizeData;

class OrganizeDataTest {
	
	//Teste para verificar se os dados inseridos estão no formato e sendo separados de maneira correta
	@Test
	void testOrganizeData() {
		String line = "normal:4:16Mar2015(ter),17Mar2015(qua),18Marc2015(qui),19Mar2015(sex),20Mar2015(sab)";
		OrganizeData organize = new OrganizeData(line);
		organize.organizedData(line);
		
		//verifica se o tipo do cliente é normal
		assertEquals("normal",organize.client_type);
		
		//verifica se a quantidade de passageiros é 4
		assertEquals(4,organize.amount_passenger);
	
		//verifica se os dias inseridos estão sendo separados de maneira correta
		List<String> days = Arrays.asList("ter", "qua", "qui", "sex", "sab");
		assertEquals(days, organize.days);
		
		//verifica se a quantidade de dias da semana inseridos é 4
		assertEquals(4 , organize.calculateRatesWeek(organize.days));
		
		//verifica se a quantidade de dias de final de semana inseridos é 1
		assertEquals(1 , organize.calculateRatesWeekend(organize.days));
	}
}
