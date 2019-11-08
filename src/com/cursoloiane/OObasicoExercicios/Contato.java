package com.cursoloiane.OObasicoExercicios;

public class Contato {
	String nome;
	Endereco endereco;
	Telefone[] telefones;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Telefone[] getTelefones() {
		return telefones;
	}
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}
	
	
}
