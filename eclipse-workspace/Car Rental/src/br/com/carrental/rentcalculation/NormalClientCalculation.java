package br.com.carrental.rentcalculation;

/*
 * Classe utilizada para obter efetuar os calculos, 
 * utilizando os valores/dia para obter resultado através dos cálculos, caso necessário.  
 */

public class NormalClientCalculation{
int amount_passenger, week = 0, weekend = 0, i=0, sizes;
	
	public NormalClientCalculation(int amount_passenger) {
		this.amount_passenger = amount_passenger;
	}
	
	public int getAmount_passenger() {
		return amount_passenger;
	}
		
	public int checkRentalAgency(int amount_passenger, int week, int weekend){
		int result;
		int valueOne = (week * 210) + (weekend * 200);
		int valueTwo = (week * 530) + (weekend * 200);
		int valueThree = (week * 630) + (weekend* 600);
		
		if((amount_passenger == 1) || (amount_passenger == 2)) {
			if( valueOne < valueTwo && valueOne < valueThree){
				result = valueOne;
			}else if (valueTwo < valueOne && valueTwo < valueThree) {
				result = valueTwo;
			}else 				
				result = valueThree;	
		}else if(amount_passenger ==3 || (amount_passenger == 4)) {
			if(valueTwo < valueThree) {
				result = valueTwo;
			}else
				result = valueThree;		
		} else  
			result = valueThree;
		return result;
	}	
}
