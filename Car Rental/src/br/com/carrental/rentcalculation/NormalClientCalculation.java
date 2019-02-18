package br.com.carrental.rentcalculation;

/*
 * Classe utilizada para obter efetuar os valores do aluguel, 
 * utilizando os valores/dia para, caso haja necessidade.  
 */

public class NormalClientCalculation{
	int amount_passenger;
	
	public NormalClientCalculation(int amount_passenger) {
		this.amount_passenger = amount_passenger;
	} 
	
	//Calcula valores conforme categoria
	public static int calculateSouthCar(int week, int weekend) {
		int finalValue = (week * 210) + (weekend * 200);
		return finalValue;
	} 
	
	public static int calculateWestCar(int week, int weekend) {
		int finalValue = (week * 530) + (weekend * 200);
		return finalValue;
	}
	
	public static int calculateNorthCar(int week, int weekend) {
		int finalValue = (week * 630) + (weekend* 600);
		return finalValue;
	}
	 

	public static int checkRentalAgency(int amount_passenger, int week, int weekend){
		int result;
		int valueOne = calculateSouthCar(week, weekend);
		int valueTwo = calculateWestCar(week , weekend);
		int valueThree = calculateNorthCar(week, weekend);
		
		if((amount_passenger == 1) || (amount_passenger == 2)) {
			result = valueOne;
		}else if((amount_passenger == 3) || (amount_passenger == 4)) {
			result = valueTwo;
		}else
				result = valueThree;		
		return result;	
	}	
}
