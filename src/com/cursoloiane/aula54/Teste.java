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
public class Teste {
    public static void main(String[] args) {
        Data data = new Data(10, 4, 2019, DiaSemana.QUINTA);
        
        System.out.println(data.getDia() + "/" + data.getMes() + "/" + data.getAno() + " - " + data.getDiaSemana());
    }
}
