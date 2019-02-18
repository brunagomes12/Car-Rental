package br.com.carrental.model;
/*
 * Classe utilizada para obter o resultado de forma mais objetiva,
 * utilizando apenas a lógica dos assentos solicitados, 
 * pois calculando os valores/dia, obtem-se o mesmo resultado.
 */
 
public class NormalClient { 
	int amount_passenger;
	
	public NormalClient(int amount_passenger) {
		this.amount_passenger = amount_passenger;
	} 
	
	public String checkRentalAgency(int amount_passenger){
		String result;				
		if((amount_passenger == 1) || (amount_passenger == 2)) {
			result = "FERRARI:WestCar";
		} else if((amount_passenger == 3) || (amount_passenger == 4)) {
			result = "CHEVROLET:SouthCar";
		} else if((amount_passenger >= 5) && (amount_passenger <= 7)) {
			result = "NAVIGATOR:NorthCar";
		}else 
			result = "Dados inválidos";		
		return result;
	}
}
