package com.cursoloiane.OObasicoExercicios;

public class Lista2 {

	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.setRua("Rua dos Bobos");
		endereco.setNumero(0);
		endereco.setCep("29100000");
		
		Telefone tel1 = new Telefone();
		tel1.setDdd("27");
		tel1.setNumero("999998888");
		
		Telefone tel2 = new Telefone();
		tel2.setDdd("27");
		tel2.setNumero("777776666");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel1;
		telefones[1] = tel2;
		
		Contato contato = new Contato();
		contato.setNome("David Alves");
		contato.setEndereco(endereco);
		contato.setTelefones(telefones);
		
		System.out.println("Nome: " + contato.getNome());
		
		if (contato != null && contato.getEndereco() != null) {
			System.out.println("Endereço: " + contato.getEndereco().getRua() + ", " + contato.getEndereco().getNumero());
		}
		
		if (contato != null && contato.getTelefones() != null) {
			System.out.println("Telefones:");
			for (Telefone t : telefones) {
				System.out.println("-> (" + t.getDdd() + ") " + t.getNumero());
			}
		}
	}

}
