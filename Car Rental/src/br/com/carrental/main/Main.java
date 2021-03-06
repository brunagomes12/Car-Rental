package br.com.carrental.main;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import br.com.carrental.model.*;
import br.com.carrental.rentcalculation.*;

public class Main {
	public static void main(String[] args) {
		Scanner readInput = new Scanner(System.in);
		String line, nameFile;
		int option, op;

		System.out.printf("Informe 1 para entrar com os dados diretamente ou 2 para ler de um arquivo de texto:\n");
	    option = new Scanner(System.in).nextInt();
	    
	    while(option < 1 || option > 2) {
			System.out.println("Op��o inv�lida. Informe 1 para entrar com os dados diretamente ou 2 para ler de um arquivo de texto:");
			option = new Scanner(System.in).nextInt();
		}
		   
	    if(option == 1) {
			System.out.println("Entre com os dados: \n");
			line = readInput.nextLine();

			OrganizeData organize = new OrganizeData(line);
			organize.organizedData(line);
			
			
			//Verifica se a quatidade de passageiros est� entro o aceit�vel
			while(organize.amount_passenger < 1 || organize.amount_passenger > 7 ) {
				System.out.println("Dados inv�lidos. Entre com os dados novamente: \n");
				line = readInput.nextLine();
				organize.organizedData(line);
			}
			if(organize.client_type.equalsIgnoreCase("normal")) {
				
				NormalClient client = new NormalClient(organize.amount_passenger);			
				System.out.println(client.checkRentalAgency(organize.amount_passenger));
				
				System.out.println("Pressione 1 para exibir valor ou 2 para sair");	
				option = readInput.nextInt();
				
				if(option == 1) {
					NormalClientCalculation clientTwo = new NormalClientCalculation(organize.amount_passenger);
					System.out.println("R$" + clientTwo.checkRentalAgency(organize.amount_passenger, organize.calculateRatesWeek(organize.days), organize.calculateRatesWeekend(organize.days)) + ",00");				
				}
			}else if(organize.client_type.equalsIgnoreCase("premium")) {
				
				PremiumClient client = new PremiumClient(organize.amount_passenger);			
				System.out.println(client.checkRentalAgency(organize.amount_passenger)); 
				
				System.out.println("Pressione 1 para exibir valor das taxas ou 2 para sair");	
				option = readInput.nextInt();
				
				if(option == 1) {
					PremiumClientCalculation clientTwo = new PremiumClientCalculation(organize.amount_passenger);
					System.out.println("R$" + clientTwo.checkRentalAgency(organize.amount_passenger, organize.calculateRatesWeek(organize.days), organize.calculateRatesWeekend(organize.days)) + ",00");
				}
			}else 
				System.out.println("Tipo de cliente inv�lido.");
		}else if(option == 2)  {
			System.out.printf("Informe o nome de arquivo texto:\n");
			nameFile = readInput.nextLine(); 
	    
			try {
				FileReader file = new FileReader(nameFile);
				BufferedReader  readFile = new BufferedReader(file);
	 
				line = readFile.readLine(); 
				file.close();
				
				OrganizeData organize = new OrganizeData(line);
				organize.organizedData(line);
				
				//Verifica se a quatidade de passageiros est� entro o aceit�vel
				while(organize.amount_passenger < 1 || organize.amount_passenger > 7) {
					System.out.println("Dados inv�lidos. Entre com os dados novamente: \n");
					line = readFile.readLine(); 
					file.close();
					organize.organizedData(line);
				}
				
			
				if(organize.client_type.equalsIgnoreCase("normal")) {
					
					NormalClient client = new NormalClient(organize.amount_passenger);
					System.out.println(client.checkRentalAgency(organize.amount_passenger));
					
					System.out.println("Pressione 1 para exibir valor das taxas ou 2 para sair");	
					option = readInput.nextInt();
					
					if(option == 1) {						
						NormalClientCalculation clientTwo = new NormalClientCalculation(organize.amount_passenger);
						System.out.println("R$" + clientTwo.checkRentalAgency(organize.amount_passenger, organize.calculateRatesWeek(organize.days), organize.calculateRatesWeekend(organize.days)) + ",00");
					}				
				}else if(organize.client_type.equalsIgnoreCase("premium")) {
					
					PremiumClient client = new PremiumClient(organize.amount_passenger);
					System.out.println(client.checkRentalAgency(organize.amount_passenger));
					
					System.out.println("Pressione 1 para exibir valor ou 2 para sair");	
					option = readInput.nextInt();
					
					if(option == 1) {						
						PremiumClientCalculation clientTwo = new PremiumClientCalculation(organize.amount_passenger);						
						System.out.println("R$" + clientTwo.checkRentalAgency(organize.amount_passenger, organize.calculateRatesWeek(organize.days), organize.calculateRatesWeekend(organize.days)) + ",00");
					}
				}else 
					System.out.println("Tipo de cliente inv�lido.");
			}catch (IOException e){
				System.err.printf("Erro na abertura do arquivo: %s.\n",
				e.getMessage());
			}
		}				
	}
}

