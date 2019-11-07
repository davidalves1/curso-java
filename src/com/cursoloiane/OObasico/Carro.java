/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursoloiane.OObasico;

/**
 *
 * @author David
 */
public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiros, double capacidadeCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }
    
    double obterAutonomia() {
    	return this.capacidadeCombustivel * this.consumoCombustivel; 
    }
    
    double calcularCombustivel(double km) {
    	return km / this.consumoCombustivel;
    }
}


