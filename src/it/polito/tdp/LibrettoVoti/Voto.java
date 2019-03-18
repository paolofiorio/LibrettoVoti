package it.polito.tdp.LibrettoVoti;

import java.time.LocalDate;

public class Voto {
	private int voto;
	private String corso;
	private LocalDate data;
	public Voto(int voto, String corso, LocalDate data) {
		this.voto=voto;
		this.corso=corso;
		this.data=data;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return String.format("Voto [voto=%s, corso=%s, data=%s]", voto, corso, data);
	}
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
