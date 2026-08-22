package br.com.impacta.exemplo.heranca;

public class Programador extends Funcionario {
	private String linguagem;


	public Programador() {
		super();
	}

	public Programador(String name, double salario) {
		super(name, salario);
	}

	public Programador(String linguagem) {
		super();
		this.linguagem = linguagem;
	}
	
	
	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

	
	
	
}
