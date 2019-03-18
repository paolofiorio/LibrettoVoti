package it.polito.tdp.LibrettoVoti;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti;
	
	
	public Libretto() {
		this.voti= new ArrayList<Voto>();
	}
	/**
	 * Aggiungi un nuovo voto al libretto
	 * @param v il {@link Voto} da aggiungere
	 */
	public void add(Voto v) {
		//soluzione migliore
		voti.add(v); //in ordine di inserimento
	}
	
	
}
