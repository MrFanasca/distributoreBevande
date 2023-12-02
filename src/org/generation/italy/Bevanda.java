package org.generation.italy;

public class Bevanda {
	/* Versione 2: aggiungere una classe Bevanda con i seguenti attributi
	 * - codice(int)
	 * - nome (String)
	 * - prezzo (float)
	 * - quantitàDisponibile (int)
	 * Scrivere per la classe Bevanda un costruttore con i parametri: codice, nome, prezzo. La 
	 * quantitàDisponibile sarà sempre 5 per tutte le nuove bevande.
	 * Gli attributi di Bevanda sono tutti public (per il momento). I metodi della classe Bevanda sono:
	 * - eroga() decrementa la quantità disponibile di 1
	 * - carica(int quantità) incrementa la quantità disponibile del valore quantità
	 * Nella classe distributore modificare l'hashmap bevande in un HashMapp<Integer, Bevanda> (chiave:
	 * codice bevanda; valore: tutto l'oggetto bevanda), e modificare la classe distributore di 
	 * conseguenza */
	
	private Integer codice, quantitàDisponibile;
	private String nome;
	private Float prezzo;
	
	// costruttore per i parametri della classe Bevanda
	public Bevanda(Integer codice, String nome, Float prezzo) 
	{
		this.codice = codice;
		this.nome = nome;
		this.prezzo = prezzo;
		quantitàDisponibile=5;
	}
	
	// metodo eroga che toglie 1 alla quantità disponibile della bevanda
	public void eroga()
	{
		if (quantitàDisponibile>0)
			quantitàDisponibile-=1;
	}
	
	// metodo eroga che aggiunge alla quantità disponibile della bevanda il valore assegnato a 'quantità'
	public void carica(int quantità)
	{
		if (quantità>0 && quantità< 50 - quantitàDisponibile)
			quantitàDisponibile+=quantità;
	}
	
	
}
