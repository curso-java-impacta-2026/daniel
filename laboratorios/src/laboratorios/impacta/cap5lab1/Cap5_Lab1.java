package laboratorios.impacta.cap5lab1;

public class Cap5_Lab1 {

	public static void main(String args[]) {

		// Instanciando a classe
		Funcionario joao = new Funcionario();

		// Atribuindo valores aos atributos da classe.
		joao.nome = "João";
		joao.sobrenome = "Pedro";
		joao.cargo = "Programador";
		joao.salario = 4000;

		// Imprimindo os atributos na tela
		System.out.println("Nome: " + joao.nome);
		System.out.println("Sobrenome: " + joao.sobrenome);
		System.out.println("Cargo: " + joao.cargo);
		System.out.println("Salário: " + joao.salario);
	}

}
