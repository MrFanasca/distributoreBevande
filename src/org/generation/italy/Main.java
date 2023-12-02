package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* VERSIONE 1
		 * Scrivere una classe DistributoreBevande con i seguenti attributi:
			bevande: HashMap<String,> che contiene un elenco di bevande, per ognuna bevanda il nome e il 
			prezzo credito: float che indica il denaro inserito nel distributore
		   e i seguenti metodi:
			inserisciMoneta(float moneta)       (inserisce una moneta nel ditributore incrementando il 
												 credito)
			erogaBevanda(String nomeBevanda)    (se esiste la bevanda e il credito è sufficiente mostra un 
												 messaggio "bevanda erogata. Il tuo resto è: ....")
		   Nel Main dichiarare un'istanza di DistributoreBevande (inizializzare opportunamente gli attributi 
		   tramite il costruttore), e chiamare i metodi inserisciMoneta e erogaBevanda*/
		
		/*VERSIONE 3
		 * Modificare la classe Main facendo in modo che venga visualizzato un menu di scelta con queste opzioni:

		1) Inserisci moneta
		2) Scegli bevanda
		3) Carica bevanda
		4) Esci
		
		Ogni volta che si visualizza il menu bisogna visualizzare l'elenco delle bevande disponibili (per ogni bevanda visualizzare: codice, nome, prezzo).
		La voce 3 (carica bevanda) è accessibile solo inserendo la password "12345"*/
		
		Distributore bevande = new Distributore();
		Scanner sc = new Scanner(System.in);
		
		String risposta;
		Float moneta, credito=0f;
		boolean uscita=false;

		do
		{
			System.out.println("\n\n\n\n\n*****EROGATRICE DI BEVANDE AUTOMATICA*****\n");
			System.out.println("1 - Inserisci moneta\n2 - Scegli bevanda\n3 - Carica bevanda\n4 - Esci\nBenvenuto, seleziona un' opzione");
			risposta=sc.nextLine();
			
			switch (risposta)
			{
			case "1":	// Inserimento delle monete
				do
				{
					System.out.println("Monete accettate: 0.10€ 0.20€ 0.5€ 1€ 2€\nInserisci la moneta");
					moneta=Float.parseFloat(sc.nextLine());
					bevande.inserisciMoneta(moneta);
					System.out.println("Vuoi inserire altre monete? (s/n)");
					risposta=sc.nextLine();
				}	while (risposta.equalsIgnoreCase("s"));
				break;
				
			case "2":	// Selezionare una bevanda
				break;
				
			case "3":	// Cariicare una bevanda 
				break;
				
			case "4":	// Uscire
				uscita=true;
				break;
				
			default:
				System.out.println("\nOpzione non valida");
				break;
			}
			
			if (uscita==false)
			{
				System.out.println("Gradisci altro? (s/n)");
				risposta=sc.nextLine();
			}
			
		}	while (risposta.equalsIgnoreCase("s") || uscita==false);
		
		sc.close();
	}

}
