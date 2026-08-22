package br.com.impacta.prateleiradigital.testes;

public class TesteArray {

	public static void main(String[] args) {

//		int[] notas = new int[3];
//
//		notas[0] = 7;
//		notas[1] = 9;
//		notas[2] = 10;
//
//		System.out.println(notas[0]);
//		System.out.println(notas[1]);
//		System.out.println(notas[2]);
////		System.out.println(notas[3]);
//
//		Filme[] filme = new Filme[3];
//
//		filme[0] = new Filme();
//		filme[1] = new Filme();
//		filme[2] = new Filme();
//
//		filme[0].setTitulo("Filme1");
//		filme[1].setTitulo("Filme2");
//		filme[2].setTitulo("Filme3");
//
//		System.out.println(filme[0].getTitulo());
//		System.out.println(filme[1].getTitulo());
//		System.out.println(filme[3].getTitulo());

//		int[] arrayNumeros = new int[10];
//
//		for (int x = 0; x < arrayNumeros.length; x++) {
//
//			arrayNumeros[x] = x;
//
//			System.out.println("O array está no indice: " + arrayNumeros[x]);
//
//		}
//
//		int[] notas = new int[10];
//
//		notas[0] = 10;
//		notas[1] = 5;
//		notas[2] = 6;
//		notas[3] = 7;
//		notas[4] = 2;
//		notas[5] = 0;
//		notas[6] = 1;
//		notas[7] = 8;
//		notas[8] = 9;
//		notas[9] = 3;
//
//		for (int nota : notas) {
//			System.out.println("Nota atual : " + nota);
//		}

//		Filme filme = new Filme("Águas Rasas");
//
//		Filme[] filmes = { filme, new Filme("Tubarão3"), new Filme("AlliensNado") };
//
//		for (Filme f : filmes) {
//			System.out.println("Estes títulos foram criados:" + f.getTitulo());
//		}

		String[][] assentos = { { "Maria", "56" }, { "João", "37" }, { "Antonio", "22" } };

		for (int x = 0; x < assentos.length; x++) {

			for (int i = 0; i < assentos[x].length; i++) {
				System.out.print(" [ " + assentos[x][i] + " ]");
			}
			System.out.print("\n");

			System.out.println("O primeiro argumento é :" + args[0]);
			System.out.println("O segundo argumento é :" + args[1]);

		}

	}

}
