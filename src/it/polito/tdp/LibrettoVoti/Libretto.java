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
	/**
	 * Ricerca un voto relativo al corso di cui � specificato il nome
	 * @param nomeEsame nome del corso da cercare
	 * @return voto corrispondente oppure null se non esiste
	 */
	public Voto cercaEsame(String nomeEsame) {
		for(Voto v:this.voti) {
			// con == confronto la posizione in memoria di due oggetti, vale solo con int e char
			// con equals confronto i contenuti dei vari oggetti
			// compareTo si basa sull'ordinamento degli oggetti ritornando se � < , > o =
			if(v.getCorso().equals(nomeEsame))
				return v;
		}
		return null;
	}
	/**
	 * dato un {@link Voto} determina se esiste gi� un voto con uguale corso e uguale punteggio
	 * @param v
	 * @return {@code true} se ha trovato un corso e punteggio uguale,
	 *  {@code false }se non ha trovato un corso oppure lo ha trovato con un corso diverso
	 */
	public boolean esisteGiaVoto(Voto v) {
		Voto trovato= this.cercaEsame(v.getCorso());
		if(trovato==null) {
			return false;
		}
		if(trovato.getPunti()==v.getPunti()) {
			return true;
		}else {
			return false;
		}
		
		
	}
}
