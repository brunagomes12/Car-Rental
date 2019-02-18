package br.com.carrental.rentcalculation;

/*
 * Classe utilizada para obter efetuar os valores do aluguel, 
 * utilizando os valores/dia para, caso haja necessidade.  
 */

public class PremiumClientCalculation {
	int amount_passenger;
	
	public PremiumClientCalculation(int amount_passenger) { 
		this.amount_passenger = amount_passenger;
	}
	
	//Calcula as taxa da loja SouthCar
	public int calculateSouthCar(int week, int weekend) {
		int finalValue = (week * 150) + (weekend * 90);
		return finalValue;
	} 
	
	//Calcula as taxa da loja WestCar
	public int calculateWestCar(int week, int weekend) {
		int finalValue = (week * 150) + (weekend * 90);
		return finalValue;
	}
	
	//Calcula as taxa da loja NorthCar
	public int calculateNorthCar(int week, int weekend) {
		int finalValue = (week * 580) + (weekend* 590);
		return finalValue;
	}

	//Calcula as taxa da loja loja conforme quantidade de passageiros
	public int checkRentalAgency(int amount_passenger, int week, int weekend){
		int result;
		if((amount_passenger == 1) || (amount_passenger == 2)) {
			result = calculateSouthCar(week, weekend);
		}else if((amount_passenger == 3) || (amount_passenger == 4)) {
			result = calculateWestCar(week , weekend);
		}else
				result = calculateNorthCar(week, weekend);		
		return result;	
	}	
}
