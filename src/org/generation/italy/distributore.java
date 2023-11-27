package org.generation.italy;

import java.util.HashMap;
import java.util.Scanner;

public class distributore {
	
	private float moneta, credito, resto, costo;
	String nomeBevanda;
	private boolean presente;
	Scanner sc = new Scanner (System.in);
	
	/* Bevande disponibili nel distributore*/
	private HashMap<String, Float> bevande =new HashMap<>(); 
	/*I metodo inserendo direttamente tuttel le variabili nel HashMap
	{{
			put("caffè", 1.0f);
			put("decaffeinato",1.0f);
			put("caffè macchiato",1.2f);
			put("cappuccino",1.5f);
			put("tè al limone",1.5f);
	}};*/
			
	/* II metodo utilizzando il costruttore */
	public distributore() 
	{
		bevande.put("caffè", 1.0f);
		bevande.put("decaffeinato",1.0f);
		bevande.put("caffè macchiato",1.2f);
		bevande.put("cappuccino",1.5f);
		bevande.put("tè al limone",1.5f);
		credito=0;
	}

	/* Stampo tutte le bevande disponibili nella macchina */
	public void visualizzaDisponibilità ()
	{
		for(String t:bevande.keySet())
			System.out.println(t);
	}
	
	/* Una volta selezionata la bevanda, viene controllata se è presente e il relativo costo. Il ciclo esce solo 
	 * quando si inserisce una bevanda esistente */
	public void sceltaBevanda ()
	{
		presente=false;
		do
		{
			System.out.println("\n\nSeleziona una bevanda: ");
			nomeBevanda=sc.nextLine();
			if (bevande.containsKey(nomeBevanda))
			{
				costo=bevande.get(nomeBevanda);
				System.out.println("L'importo da pagare è di " + costo + " euro");
				presente=true;
			}
			else 
				System.out.println("Bevanda non è disponibile");
		}	while(!presente);
		
	}
	 
	/* inserimento delle monete valide e reminder del credito. Si esce solo una volta arrivato al costo del prodotto */
	public void inserisciMoneta()
	{
		do
		{
			System.out.println("Inserisci la moneta");
			moneta=Float.parseFloat(sc.nextLine());
			if (moneta==0.1f || moneta==0.2f || moneta==0.5f || moneta==1.0f || moneta==2.0f)
				credito+=moneta;
			else
				System.out.println("Moneta non accettata");
			System.out.println("Euro inseriti " + credito);
		}	while (credito<=costo);
	}
	
	/* calcolo del resto ed erogazione del prodotto */
	public void erogaBevanda()
	{
		resto=credito-costo;
		System.out.println("Ritira la bevanda e il tuo resto di " + String.format("%.2f", resto) + " euro");
	}
	
}
