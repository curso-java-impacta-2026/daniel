package br.com.impacta.curso.oo;

public class ExemploPessoa {

	// Atributos da classe
	private String nome;
	private int idade;

	// Método construtor padrão:
	public ExemploPessoa() {

	}

	// Método construtor full:
	public ExemploPessoa(String nome, int idade) {

		this.nome = nome;
		this.idade = idade;
	}

	// Métodos get and setters
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
