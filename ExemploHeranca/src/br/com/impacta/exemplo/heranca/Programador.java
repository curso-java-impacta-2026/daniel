package br.com.impacta.exemplo.heranca;

public class Programador extends Funcionario {
	private String linguagem;


	public Programador() {
		super();
	}

	public Programador(String linguagem, String name, double salario) {
		super(name, salario);
		this.linguagem = linguagem;
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
	
	@Override
	public String getName() {
		return "Prog:" + super.getName();
	}
	
	public String retornarSalario() {
		return "R$: " + this.getSalario();
	}
	@Override
	public double getSalario() {
		return super.getSalario();
	}
	
	
	
}
