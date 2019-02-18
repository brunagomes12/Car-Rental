package br.com.carrental.main;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.carrental.model.*;
import br.com.carrental.rentcalculation.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> daysTwo = new ArrayList<String>();
		Scanner read = new Scanner(System.in);
		String line, nameFile;
		int option, week, weekend, value=0, op;
		
		System.out.printf("Informe 1 para entrar com os dados diretamente ou 2 para ler de um arquivo de texto:\n");
	    option = new Scanner(System.in).nextInt();
	    
	    while(option < 1 || option > 2) {
			System.out.println("Opção inválida.\"Informe 1 para entrar com os dados diretamente ou 2 para ler de um arquivo de texto:");
			option = new Scanner(System.in).nextInt();
		}
		 
	    if(option == 1) {
			System.out.println("Entre com os dados: \n");
			line = read.nextLine();

			OrganizeData organize = new OrganizeData(line);
			organize.organizedData(line);
			
			if(organize.client_type.equalsIgnoreCase("normal")) {
				
				NormalClient client = new NormalClient(organize.amount_passenger);			
				System.out.println(client.checkRentalAgency(organize.amount_passenger));
				
				System.out.println("Pressione 1 para exibir valor ou 2 para sair");	
				op = new Scanner(System.in).nextInt();
				if(op == 1) {
					NormalClientCalculation clientTwo = new NormalClientCalculation(organize.amount_passenger);
				  
					week = organize.calculateRatesWeek(organize.days);
					weekend = organize.calculateRatesWeekend(organize.days);
					value = clientTwo.checkRentalAgency(organize.amount_passenger, week , weekend);
					System.out.println("Valor: R$" + value + ",00");
				}else {
					System.out.println("");
				}
			}else if(organize.client_type.equalsIgnoreCase("premium")) {
				
				PremiumClient client = new PremiumClient(organize.amount_passenger);			
				System.out.println(client.checkRentalAgency(organize.amount_passenger));
				
				System.out.println("Pressione 1 para exibir valor ou 2 para sair");	
				op = new Scanner(System.in).nextInt();
				if(op == 1) {
					PremiumClientCalculation clientTwo = new PremiumClientCalculation(organize.amount_passenger);
				  
					week = organize.calculateRatesWeek(organize.days);
					weekend = organize.calculateRatesWeekend(organize.days);
					value = clientTwo.checkRentalAgency(organize.amount_passenger, week , weekend);
					System.out.println("Valor: R$" + value + ",00");
				}else {
					System.out.println("");
				}
			}
		}else if(option == 2)  {
			System.out.printf("Informe o nome de arquivo texto:\n");
			nameFile = read.nextLine();
	    
			try {
				FileReader file = new FileReader(nameFile);
				BufferedReader  readFile = new BufferedReader(file);
	 
				line = readFile.readLine(); 
				file.close();
				
				OrganizeData organize = new OrganizeData(line);
				organize.organizedData(line);
				
				if(organize.client_type.equalsIgnoreCase("normal")) {
					NormalClient client = new NormalClient(organize.amount_passenger);
					System.out.println(client.checkRentalAgency(organize.amount_passenger));
					
					System.out.println("Pressione 1 para exibir valor ou 2 para sair");	
					op = new Scanner(System.in).nextInt();
					if(op == 1) {
						NormalClientCalculation clientTwo = new NormalClientCalculation(organize.amount_passenger);

						week = organize.calculateRatesWeek(organize.days);
						weekend = organize.calculateRatesWeekend(organize.days);
						value = clientTwo.checkRentalAgency(organize.amount_passenger, week , weekend);
						System.out.println("Valor: R$" + value + ",00");
					}else {
						System.out.println("");
					}					
				}else if(organize.client_type.equalsIgnoreCase("premium")) {
					PremiumClient client = new PremiumClient(organize.amount_passenger);
					System.out.println(client.checkRentalAgency(organize.amount_passenger));
					
					System.out.println("Pressione 1 para exibir valor ou 2 para sair");	
					op = new Scanner(System.in).nextInt();
					if(op == 1) {
						PremiumClientCalculation clientTwo = new PremiumClientCalculation(organize.amount_passenger);						
						week = organize.calculateRatesWeek(organize.days);
						weekend = organize.calculateRatesWeekend(organize.days);
						value = clientTwo.checkRentalAgency(organize.amount_passenger, week , weekend);
						System.out.println("Valor: R$" + value + ",00");
					}else { 
						System.out.println("");
					}
				}
			}catch (IOException e){
				System.err.printf("Erro na abertura do arquivo: %s.\n",
				e.getMessage());
			}
		}				
	}
}

