package it.polito.tdp.LibrettoVoti;

import java.time.LocalDate;

public class Voto {
	private int voto;
	private String corso;
	private LocalDate data;
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
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
