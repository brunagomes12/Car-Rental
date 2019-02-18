package br.com.carrental.rentcalculation;

/*
 * Classe utilizada para obter efetuar os calculos, 
 * utilizando os valores/dia para obter resultado através dos cálculos, caso necessário.  
 */

public class PremiumClientCalculation {
	int amount_passenger, week = 0, weekend = 0, i=0, sizes;
	
	public PremiumClientCalculation(int amount_passenger) { 
		this.amount_passenger = amount_passenger;
	}
	
	public int getAmount_passenger() {
		return amount_passenger;
	}
	
	//Calcula valores conforme categoria
	public int calculateSouthCar(int week, int weekend) {
		int finalValue = (week * 150) + (weekend * 90);
		return finalValue;
	} 
	
	public int calculateWestCar(int week, int weekend) {
		int finalValue = (week * 150) + (weekend * 90);
		return finalValue;
	}
	
	public int calculateNorthCar(int week, int weekend) {
		int finalValue = (week * 580) + (weekend* 590);
		return finalValue;
	}

	public int checkRentalAgency(int amount_passenger, int week, int weekend){
		int result;
		int valueOne = (week * 150) + (weekend * 90);
		int valueTwo = (week * 150) + (weekend * 90);
		int valueThree = (week * 580) + (weekend* 590);
		
		if((amount_passenger == 1) || (amount_passenger == 2)) {
			if( valueOne < valueTwo && valueOne < valueThree){
				result = valueOne;
			}else if (valueTwo < valueOne && valueTwo < valueThree) {
				result = valueTwo;
			}else 				 
				result = valueThree;	
		}else if((amount_passenger == 3) || (amount_passenger == 4)) {
			if(valueTwo < valueThree) {
				result = valueTwo;
			}else
				result = valueThree;		
		} else if((amount_passenger >= 5) && (amount_passenger <= 7)) {
			result = valueThree;
		}else 
			result = 0;
		return result;
	}	
}
