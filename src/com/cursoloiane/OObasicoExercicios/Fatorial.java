package com.cursoloiane.OObasicoExercicios;

public class Fatorial {
	public static int calcular(int num) {
		if (num == 0) {
			return 1;
		}
		
		return num * calcular(num - 1);
	}
}
