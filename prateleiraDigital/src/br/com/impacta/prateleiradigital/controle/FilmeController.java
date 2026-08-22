package br.com.impacta.prateleiradigital.controle;

import br.com.impacta.prateleiradigital.negocio.Filme;
import br.com.impacta.prateleiradigital.persistencia.FilmeDAO;

public class FilmeController {

	public Filme criarFilme(String titulo, String diretores, double nota, int duracao, int ano, String generos,
			int numDeVotos, String url) {

		Filme filme = new Filme(titulo, diretores, nota, duracao, ano, generos, numDeVotos, url);

		System.out.println("Filme criado com sucesso!");

		return filme;

	}

	public Filme criarFilme(Filme filme) {

		FilmeDAO fd = new FilmeDAO();

		if (fd.insert(filme)) {
			System.out.println("Filme criado com SUCESSO!");
			return filme;
		}

		System.out.println("Ocorreu um erro ao tentar criar o FILME!");
		return null;

	}

}
