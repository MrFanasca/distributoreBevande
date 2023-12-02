package org.generation.italy;

import java.util.HashMap;

public class Distributore {
	
	private float  credito, resto;
	String nomeBevanda;
	private boolean presente;
	
	/* Bevande disponibili nel distributore*/
	private HashMap<Integer, Bevanda> bevande =new HashMap<>(); 
	/*I metodo inserendo direttamente tutte  le variabili nel HashMap -- Versione 1
	{{
			put("caffè", 1.0f);
			put("decaffeinato",1.0f);
			put("caffè macchiato",1.2f);
			put("cappuccino",1.5f);
			put("tè al limone",1.5f);
	}};*/
			
	/* II metodo utilizzando il costruttore -- Versione 2*/ 
	public Distributore() 
	{
		bevande.put(1, new Bevanda (1, "caffè", 1.0f));
		bevande.put(2, new Bevanda (2, "decaffeinato", 1.0f));
		bevande.put(3, new Bevanda (3, "caffè macchiato", 1.2f));
		bevande.put(4, new Bevanda (4, "cappuccino", 1.5f));
		bevande.put(5, new Bevanda (5, "tè al limone", 1.5f));
		credito=0;
	}

	/* Stampo tutte le bevande disponibili nella macchina */
	public void visualizzaDisponibilità ()
	{
		for(Integer t:bevande.keySet())					// nella Versione 1 ci si riferiva a t come una stringa
		{
			System.out.println("Codice bevanda: " + t + "\tBevanda: " + bevande.get(t).getNome() + "Prezzo bevanda: " + bevande.get(t).getPrezzo() + "\tQuantità disponibile: " + bevande.get(t).getQuantitàDisponibile());
		}
	}
	
	/* Una volta selezionata la bevanda, viene controllata se è presente e il relativo costo. Il ciclo esce solo 
	 * quando si inserisce una bevanda esistente */
	public void sceltaBevanda (Integer codice)
	{
		presente=false;
		if (bevande.containsKey(codice))
		{
			presente=true;
			if (bevande.get(codice).getQuantitàDisponibile()>0)
			{
			System.out.println("L'importo da pagare è di " + bevande.get(codice).getPrezzo() + " euro");
			}
			else
				System.out.println("Prodotto non disponibile");
		}
		else 
			System.out.println("Bevanda non è disponibile");
	}


	/* inserimento delle monete valide e reminder del credito*/
	public void inserisciMoneta(Float moneta)
	{
		if (moneta==0.1f || moneta==0.2f || moneta==0.5f || moneta==1.0f || moneta==2.0f)
			credito+=moneta;
		else
			System.out.println("Moneta non accettata");
		System.out.println("Euro inseriti " + credito);
	}
	
	/* calcolo del resto ed erogazione del prodotto */
	public void erogaBevanda(Integer codice)
	{
		resto=credito-bevande.get(codice).getPrezzo();
		System.out.println("Ritira la bevanda e il tuo resto di " + String.format("%.2f", resto) + " euro");
		bevande.get(codice).eroga();	
	}
	
	/* caricare una specifica bevanda*/
	public void caricaBevanda(Integer codice, Integer quantità)
	{
		if (bevande.containsKey(codice))
			bevande.get(codice).carica(quantità);
		else
			System.out.println("Codice non valido");
	}
	
	 
	public boolean isPresente() 
	{
		return presente;
	}
}
