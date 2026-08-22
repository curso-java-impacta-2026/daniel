package br.com.impacta.curso;

public class OlaMundo {

	// Primeiro atributo da classe OlaMundo
	private String mensagem;
	// Segundo atributo da classe OlaMundo
	private int numero;

	public String falar(String mensagem) {
		return mensagem;

	}

	public static void main(String args[]) {

		// Comentário de linha
		/*
		 * Comentário de Bloco
		 */

		// Vamos criar uma saída de dados, através de uma função
		// interna do JAVA de nome System.out.println()

		System.out.println("Olá mundo!");

		// Instanciando a classe OlaMundo
		OlaMundo olaMundo = new OlaMundo();

		// Chamando o método falar da classe OlaMundo;
		olaMundo.falar("Deu o horário!");

		// Colocando o retorno do método dentro do System.out
		System.out.println(olaMundo.falar("Deu o horário!"));

	}
}
