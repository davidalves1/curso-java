package com.cursoloiane.OObasicoExercicios;

public class Fibonacci {
	public static int calcular(int num) {
		if (num < 2 ) {
			return 1;
		}
		
		 return calcular(num - 1) + calcular(num - 2);
	}
}
