package it.polito.tdp.LibrettoVoti;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libretto libr= new Libretto();
		libr.add(new Voto(30,"Analisi I", LocalDate.of(2017, 1, 14)));
		libr.add(new Voto(25,"Fisica I", LocalDate.of(2018, 1, 24)));
		libr.add(new Voto(18,"Analisi II", LocalDate.of(2018, 6, 30)));
		libr.add(new Voto(20,"Fisica I", LocalDate.of(2018, 9, 14)));
		libr.add(new Voto(25,"Basi di Dati", LocalDate.of(2018, 2, 24)));
		libr.add(new Voto(30,"Ricerca Operativa", LocalDate.of(2019, 1, 30)));
		libr.add(new Voto(24,"Informatica", LocalDate.of(2017, 7, 4)));
		List<Voto>venticinque= libr.cercaVoti(25);
		System.out.println(venticinque);
		Voto a1=libr.cercaEsame("Analisi I");
		Voto a3=libr.cercaEsame("Analisi III");
		System.out.println(a1);
		System.out.println(a3);
		
		Voto giusto=new Voto(25,"Fisica I",LocalDate.now());
		Voto sbagliato= new Voto(27, "Fisica I", LocalDate.now());
		System.out.format("Il voto %s � %s\n",giusto.toString(),libr.esisteGiaVoto(giusto));
		System.out.format("Il voto %s � %s\n",sbagliato.toString(),libr.esisteGiaVoto(sbagliato));
		}

}
