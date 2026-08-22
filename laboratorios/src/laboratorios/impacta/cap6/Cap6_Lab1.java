package laboratorios.impacta.cap6;

public class Cap6_Lab1 {

//	1. Crie uma classe chamada Cap6_Lab1 e insira a estrutura básica de um 
//	programa Java;
//	3. Use os métodos somar, subtrair, multiplicar e dividir. Imprima os 
//	resultados na tela;
//	4. Compile e execute o programa.

	public static void main(String[] args) {

		// Instanciando a classe Calculadora
		Calculadora calc = new Calculadora(100, "Cientifica");

		// Acessando os atributos da calculador que foram
		// inicializados no constructor
		System.out.printf("Número de teclas" +
		" da calculadora: %d\n", calc.getTeclas());
		System.out.printf("Tipo da " +
		"calculadora: %s\n", calc.getTipo());

//		int resultado = calc.operacoes(60, 2, 'j');
//
//		System.out.printf("O resultado da operação : %d\n", resultado);

//		int soma = calc.somar(10, 30);
//		System.out.printf("O resultado da operação : %d\n", soma);
//
//		int subtrair = calc.subtrair(100, 50);
//		System.out.printf("O resultado da operação : %d\n", subtrair);
//
//		int dividir = calc.dividir(6, 2);
//		System.out.printf("O resultado da operação : %d\n", dividir);
//
//		int multiplicar = calc.multiplicar(10, 30);
//		System.out.printf("O resultado da operação : %d", multiplicar);

	}

}
