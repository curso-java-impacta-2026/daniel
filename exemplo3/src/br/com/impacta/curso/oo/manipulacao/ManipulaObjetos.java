package br.com.impacta.curso.oo.manipulacao;

import java.util.Date;

import br.com.impacta.curso.oo.ExemploPessoa;

public class ManipulaObjetos {

	public static void main(String[] args) {

		Date dataNascimento;

//		ExemploPessoa ep = new ExemploPessoa();
		ExemploPessoa ep = new ExemploPessoa();

		// Utilizando o set para adicionar dados aos atributos da classe.
		ep.setNome("José");
		ep.setIdade(50);

		// Utilizando o método get para pegar o dado da classe.
		System.out.println("NOME : " + ep.getNome());
		System.out.println("IDADE : " + ep.getIdade());

	}

}
