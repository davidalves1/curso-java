/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursoloiane.aula54;

/**
 *
 * @author david
 */
public enum DiaSemana {
    SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), 
    SEXTA(5), SABADO(6), DOMINGO(7);
    
    private int valor;
    
    DiaSemana (int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
