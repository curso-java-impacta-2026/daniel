package laboratorios.capitulo9;

public class Aluno extends Pessoa {
	private float mensalidade;
	private String curso;
	
	
	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}


	public Aluno(String nome, int idade, char sexo, int numeroRG, String dataNasc, float mensalidade, String curso) {
		super(nome, idade, sexo, new RG(numeroRG, dataNasc));
		this.mensalidade = mensalidade;
		this.curso = curso;
	}

	public void falar(String fala) {
		System.out.println(super.getNome()+": "+fala);
		
	}

	public void mostrarDados() {
		System.out.println("\n---- Professor: "+super.getNome());
		System.out.println("Idade: "+super.getIdade());
		System.out.println("Sexo: "+super.getSexo());
		System.out.println("Mensalidade: "+getMensalidade());
		System.out.println("Curso: "+getCurso());
		System.out.println("Numero RG: "+super.getRg().getNumero());
		System.out.println("Data de Nascimento: "+super.getRg().getDataNasc());
		
	}

}
