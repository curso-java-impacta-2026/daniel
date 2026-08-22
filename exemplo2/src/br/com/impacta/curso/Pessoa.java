package br.com.impacta.curso;

import java.util.Date;

public class Pessoa {

	private String nome;
	private Date dtNasc;
	private char genero;
	private long telefone;
	private String endereco;
	private double salario;
	private boolean casado;

	public Pessoa() {
		super();
	}

	// Construtor FULL
	// Cada informação desta dentro dos parâmetros será colocada em um atributo da
	// classe.
	public Pessoa(String nome, Date dtnasc, char genero, int telefone, String endereco, double salario,
			boolean casado) {

		this.nome = nome;
		this.dtNasc = dtnasc;
		this.genero = genero;
		this.telefone = telefone;
		this.endereco = endereco;
		this.salario = salario;
		this.casado = casado;
	}

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public Pessoa(boolean casado) {
		this.casado = casado;
	}

	@Override
	public String toString() {

		return ("O \"sr.\"" + this.nome + " mora na " + this.endereco + "\n" + "Seu estado civil atual é " + this.casado
				+ " e seu telefone é " + this.telefone + "\r");
	}

	public static void main(String[] args) {

//		// Instanciar a classe Pessoa;
//		Pessoa pessoa;// << Aqui só existe a instância
//
//		// Construindo o objeto Pessoa;
//		pessoa = new Pessoa("João", (Calendar.getInstance().getTime()), 'm', 978653344, "Rua da verdade", 1789.90,
//				true);// << Aqui já existe o objeto concreto
//
//		// Declarando um variável do tipo String
//		String valorPessoa = pessoa.toString();
//
//		System.out.println(valorPessoa);
//
//		// Declarando uma CONSTANTE
//
//		final String DIA_DA_SEMANA = "SEGUNDA-FEIRA";
//
//		String nome = "José";
//
//		System.out.println("Imprimindo a constante : " + DIA_DA_SEMANA);
//
//		nome = "Joaquim";
//
//		System.out.println(nome.replace("a", "M"));
//
//		int nr = 10;
//
//		Integer nr2 = 100;

		// Atribuição reduzida

//		int x = 10;
//
////		x = x + 3;
//
//		x += 3;
//
//		System.out.println(x);

		String nome = "Joaquim";

		int nr1 = 1952;
		int nr2 = 2022;
//		int nr3 = 10;
//		int nr4 = 5;
//
//		if ((!(nr1 == nr2)) || nr3 == nr4) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}

//		boolean resultado = (nr1 >= nr2) ? true : false;
//		
//		System.out.println(resultado);
//		
		// Criem um ternário onde o retorno é uma STRING:
		String retorno = (nr1 == nr2) ? "São iguais!" : "São diferentes";
		System.out.println(retorno);
//
//		double x = 1;
//
//		x /= 3;
//		System.out.println(x);

		// System.out.println(3 < 5 && 6 <= 7 ? "TRUE" : "FALSE");

//		int i = 0;

//		while (key) {
//			System.out.println(3 < 5 && 6 <= 7 ? "TRUE" : "FALSE");
//		}

//		do {
//			System.out.print();
//			System.out.println( 3 < 5 && 6 <= 7 ? "TRUE" : "FALSE");
//			i++;
//		} while (i <= 10);

		int nr = 0;
		instrucao1:

		for (int x = 0; x <= 10; x++) {

			if (x == 5) {
				break instrucao1;
//				continue;
			}
			System.out.println("Valor de x : " + x);
		}

//		System.out.println("Valor de nr : " + nr);

		for (int i = 5; i <= 10; i++) {
			System.out.println(i);
		}

	}

}
