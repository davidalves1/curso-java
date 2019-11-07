package com.cursoloiane.OObasico;

public class MainCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro gol = new Carro("VW", "Gol", 5, 45, 14);
		
		double km = 100;
		
		System.out.println("A autonomia do carro é " + gol.obterAutonomia() + " KM");
		System.out.println("Para andar " + km + "KM serão necessários " + gol.calcularCombustivel(km) + " Litros de combustível)" );
	}

}
