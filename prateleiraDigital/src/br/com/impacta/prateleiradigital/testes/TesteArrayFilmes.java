package br.com.impacta.prateleiradigital.testes;

import br.com.impacta.prateleiradigital.negocio.Filme;

public class TesteArrayFilmes {

	public static void main(String[] args) {

		Filme[] filmes = new Filme[3];

		System.out.println("Tamanho : " + filmes.length);
		System.out.println("Posição inicial : " + filmes[0]);

		filmes[0] = new Filme("Matrix", "Lana Wachowski, Lilly Wachowski", 8.7, 137, 1999, "Ação, Ficção científicia",
				2000000, "https://exemplo.com/matrix");

		filmes[1] = new Filme("Interestelar", "Christopher Nolar", 8.7, 169, 2014, "Ficção científicia", 2000000,
				"https://exemplo.com/interestelar");

		filmes[2] = new Filme("Poderoso Chefão", "Francis Ford Coppola", 9.2, 175, 1972, "Drama", 1900000,
				"https://exemplo.com/poderoso-chefao");

		/// Chamar o método de apresentação dos filmes e
		/// passar o parâmetro

		mostrarFilmes(filmes);

	}// <<--FIM DO METODO MAIN

	public static void mostrarFilmes(Filme[] filmes) {

		for (Filme filme : filmes) {

			System.out.println("----------------------");
			System.out.println("Título : " + filme.getTitulo());
			System.out.println("Diretores : " + filme.getDiretores());
			System.out.println("Ano : " + filme.getAno());
			System.out.println("Nota : " + filme.getNota());

		} // <<FIM DO FOR EACH DO METODO MOSTRAR FILME

	}// <<FIM DO METODO MOSTRAR FILME

}// <<FIM DA CLASSE TESTEARRAY FILMES
