package it.polito.tdp.LibrettoVoti;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libretto libr= new Libretto();
		libr.add(new Voto(30,"Analisi I", LocalDate.of(2017, 1, 14)));
		libr.add(new Voto(25,"Fisica I", LocalDate.of(2018, 1, 24)));
		}

}
