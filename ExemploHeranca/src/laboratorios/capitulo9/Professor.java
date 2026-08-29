package laboratorios.capitulo9;

public class Professor extends Pessoa {
	
	private float salario;
	private String disciplina;
	
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	
	
	public Professor(String nome, int idade, char sexo, int numeroRG, String dataNasc, float salario, String disciplina) {
		super(nome, idade, sexo, new RG(numeroRG, dataNasc));
		this.salario = salario;
		this.disciplina = disciplina;
	}

	
	
	public void falar(String fala) {
		System.out.println(super.getNome()+": "+fala);
		
	}

	public void mostrarDados() {
		System.out.println("\n---- Professor: "+super.getNome());
		System.out.println("Idade: "+super.getIdade());
		System.out.println("Sexo: "+super.getSexo());
		System.out.println("Salario: "+getSalario());
		System.out.println("Disciplina: "+getDisciplina());
		System.out.println("Numero RG: "+super.getRg().getNumero());
		System.out.println("Data de Nascimento: "+super.getRg().getDataNasc());		
	}
	
}
