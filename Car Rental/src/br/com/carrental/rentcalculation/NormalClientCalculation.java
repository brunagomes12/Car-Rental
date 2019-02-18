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
	
	//Calcula as taxa da loja SouthCar
	public static int calculateSouthCar(int week, int weekend) {
		int finalValue = (week * 210) + (weekend * 200);
		return finalValue;
	} 
	
	//Calcula as taxa da loja WestCar
	public static int calculateWestCar(int week, int weekend) {
		int finalValue = (week * 530) + (weekend * 200);
		return finalValue;
	}
	
	//Calcula as taxa da loja NorthCar
	public static int calculateNorthCar(int week, int weekend) {
		int finalValue = (week * 630) + (weekend* 600);
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
