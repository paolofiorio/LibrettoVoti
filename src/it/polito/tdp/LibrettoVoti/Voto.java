package it.polito.tdp.LibrettoVoti;

import java.time.LocalDate;

public class Voto {
	private int punti;
	private String corso;
	private LocalDate data;
	public Voto(int voto, String corso, LocalDate data) {
		this.punti=voto;
		this.corso=corso;
		this.data=data;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return String.format("Voto [punti=%s, corso=%s, data=%s]", punti, corso, data);
	}
	public int getPunti() {
		return punti;
	}
	public void setPunti(int voto) {
		this.punti = voto;
	}
	public String getCorso() {
		return corso;
	}
	public void setCorso(String corso) {
		this.corso = corso;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	
	
}
