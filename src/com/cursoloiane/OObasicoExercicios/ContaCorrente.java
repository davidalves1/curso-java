package com.cursoloiane.OObasicoExercicios;

import java.util.ArrayList;

public class ContaCorrente {
	String numero;
	String agencia;
	double saldo;
	boolean especial;
	double limiteEspecial;
	ArrayList<String> extrato;
	
	public ContaCorrente(String numero, String agencia, double saldo, boolean especial, double limiteEspecial) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.especial = especial;
		this.limiteEspecial = limiteEspecial;
		this.extrato = new ArrayList<String>();
	}

	double consultarSaldoTotal() {
		return this.saldo + this.limiteEspecial;
	}
	
	void exibirSaldo() {
		System.out.println("O saldo total atual é de: R$" + consultarSaldoTotal());
	}
	
	void incrementarExtrato(String valor) {
		extrato.add(valor);
	}
	
	void exibirExtrato() {
		System.out.println("\n### Extrato da conta " + numero + " ###\n--------------------");
		int i = 1;
		for (String item : extrato) {
			System.out.println(i + ". " + item);
			i++;
		}
		System.out.println("--------------------");
		System.out.println("Saldo: R$" + consultarSaldoTotal());
	}
	
	boolean realizarSaque(double valorSacar) {
		if (saldo >= valorSacar) {
			saldo -= valorSacar;
			incrementarExtrato("D R$" + valorSacar);
			return true;
		} else if (especial && saldo + limiteEspecial >= valorSacar) {
			limiteEspecial -= valorSacar - saldo;
			saldo = 0;
			incrementarExtrato("D R$" + valorSacar);
			return true;
		} else {	
			return false;
		}
	}
	
	void realizarDeposito(double valorDepositado) {
		incrementarExtrato("C R$" + valorDepositado);
		saldo += valorDepositado;
	}
}
