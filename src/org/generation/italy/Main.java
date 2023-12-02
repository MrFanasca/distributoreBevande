package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Scrivere una classe DistributoreBevande con i seguenti attributi:
			bevande: HashMap<String,> che contiene un elenco di bevande, per ognuna bevanda il nome e il 
			prezzo credito: float che indica il denaro inserito nel distributore
		   e i seguenti metodi:
			inserisciMoneta(float moneta)       (inserisce una moneta nel ditributore incrementando il 
												 credito)
			erogaBevanda(String nomeBevanda)    (se esiste la bevanda e il credito è sufficiente mostra un 
												 messaggio "bevanda erogata. Il tuo resto è: ....")
		   Nel Main dichiarare un'istanza di DistributoreBevande (inizializzare opportunamente gli attributi 
		   tramite il costruttore), e chiamare i metodi inserisciMoneta e erogaBevanda*/
		
	
		
		Distributore bevande = new Distributore();
		Scanner sc = new Scanner(System.in);
		
		String risposta;

		System.out.println("Salve, queste sono le bevande disponibili");
		bevande.visualizzaDisponibilità();
		
		System.out.println("Gradisci una bevanda? (s/n)");
		risposta = sc.nextLine();
		
		if (risposta.toLowerCase().equals("s"))
		{
			bevande.sceltaBevanda();
			
			bevande.inserisciMoneta();
			
			bevande.erogaBevanda();
		}
		else
			System.out.println("Arrivederci");
		
		sc.close();
	}

}
