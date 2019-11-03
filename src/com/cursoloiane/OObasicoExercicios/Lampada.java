package com.cursoloiane.OObasicoExercicios;

public class Lampada {
	String modelo;
	String tensao;
	int potencia;
	int garantia;
	boolean ligada;
	
	public Lampada(String modelo, String tensao, int potencia, int garantia) {
		super();
		this.modelo = modelo;
		this.tensao = tensao;
		this.potencia = potencia;
		this.garantia = garantia;
	}

	public Lampada() {
		super();
	}
	
	public void ligar() {
		this.ligada = true;
	}
	
	public void desligar() {
		this.ligada = false;
	}
	
	public void mostrarEstado() {
		String resultado = this.ligada ? "A lâmpada está ligada" : "A lâmpada está desligada";
		System.out.print(resultado + "\n");
	}
}
