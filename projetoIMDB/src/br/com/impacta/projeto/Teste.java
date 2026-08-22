package br.com.impacta.projeto;

import br.com.impacta.projeto.filme.Filme;

public class Teste {

	public static void main(String[] args) {

		Filme filme = new Filme();
		filme.ativado = true;
		System.out.println(filme);
		System.out.println(filme.ativado);

		Filme f = new Filme();
		f.ativado = false;
		System.out.println(f);
		System.out.println(filme.ativado);

		filme.mostrar(50);
		filme.mostrar("Alexandre");
		filme.mostrar();

	}

}
