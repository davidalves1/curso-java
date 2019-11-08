package com.cursoloiane.OObasicoExercicios;

public class Lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício 1:
		// Criar métodos para ligar e desligar a lâmpada
		// Lampada lampada = new Lampada();
		
		/*lampada.mostrarEstado();
		lampada.ligar();
		lampada.mostrarEstado();
		lampada.desligar();
		lampada.mostrarEstado();*/
		
		// Exercício 2
		// Criar uma classe que representa uma conta corrente com número, saldo, limite e se é especial ou não.
		// Nesta classe também deve ter os métodos para visualizar o saldo, realizar saque e depósito, verificar
		// se está usando cheque especial ou não
		ContaCorrente conta = new ContaCorrente("1122", "0212", 100, true, 100);
		
		conta.exibirSaldo();
		
		boolean saque = conta.realizarSaque(120);
		
		if (saque) {
			System.out.println("Saque realizado com sucesso!");
		} else {
			System.out.println("Não foi possível realizar saque");
		}
		
		conta.realizarDeposito(100);
		conta.realizarDeposito(200);
		conta.realizarDeposito(100);
		conta.realizarDeposito(50);
		conta.realizarSaque(300);
		conta.realizarDeposito(200);
		conta.realizarSaque(400);
		
		conta.exibirExtrato();
		
		int calcular = Fatorial.calcular(6);
		
		System.out.println("Fatorial = " + calcular);
	}

}
