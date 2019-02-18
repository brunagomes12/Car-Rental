package br.com.carrental.rentcalculation;
import java.util.ArrayList;

public class OrganizeData {
	
	public ArrayList<String> days = new ArrayList<String>();
	public String client_type, line, fileName, date;
	static String[] infos;
	String[] dates;
	static int i, j, week, weekend, sizes;
	public static int amount_passenger;
	
	public OrganizeData(String line) {
		this.line = line;
	} 
	
	public String clientType (String[] Infos) {
		client_type = infos[0];		
		return infos[0];		
	}
	
	public int amountPassenger(String[] Infos) {
		amount_passenger =  Integer.parseInt(infos[1]);
		return amount_passenger;
	}
	
	public ArrayList<String> separateDates (String[] Infos) {
		date = infos[2];
		
		//Sepra as datas, colocando os dias da semana em uma lista
		dates = date.split("\\(|\\)");
		i = dates.length;
		j=1;
		while(j<i) {
			days.add(dates[j]);
			j+=2;
		}   
		return days;
	}
	
	//verifica se é dia da semana
	public int calculateRatesWeek(ArrayList<String> days) {
		sizes = days.size();
		for(i = 0; i < sizes; i++) {
			if((days.get(i).equalsIgnoreCase("seg"))||
				(days.get(i).equalsIgnoreCase("ter"))||
				(days.get(i).equalsIgnoreCase("qua"))||
				(days.get(i).equalsIgnoreCase("qui"))||
				(days.get(i).equalsIgnoreCase("sex"))) {
				week++;
			}
		}
		return week; 
	}
		
	//verifica se é final semana 
	public static int calculateRatesWeekend(ArrayList<String> days) {
		sizes = days.size();
		for(i = 0; i < sizes; i++) {
			if((days.get(i).equalsIgnoreCase("sab"))||
				(days.get(i).equalsIgnoreCase("dom"))) {
					weekend++;
			}
		}
		return weekend;
	}
	
	public static String[] splitData(String line) {
		infos = line.split(":");
		return infos;
	} 
	
	public void organizedData(String line) {
		splitData(line);
		clientType(infos);
		amountPassenger(infos);
		separateDates(infos);
	}
}
