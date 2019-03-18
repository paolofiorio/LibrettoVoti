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
	/**
	 * Seleziona il sottoinsieme di voti che hanno il punteggio specificato
	 * @param punti punteggio
	 * @return lista di voti con stesso punteggio dato
	 */
	public List<Voto> cercaVoti(int punti) {
		List<Voto>result = new ArrayList<Voto>();
		for(Voto v:this.voti) {
			if(v.getPunti()==punti) {
				result.add(v);
			}
		}
		return result;
	}
	
}
