package laboratorios.impacta.cap6;

//1. Abra a classe Calculadora;
public class Calculadora {

	private int teclas;
	private String tipo;

	// Constructor padrão
	public Calculadora() {
	}

	// Constructor com apenas um atributo teclas
	public Calculadora(int teclas) {
		this.teclas = teclas;
	}

	// Crie um construtor só com o atributo tipo
	public Calculadora(String tipo) {
		this.tipo = tipo;
	}

	// Constructor full
	public int somar(int nr1, int nr2) {
		return (nr1 + nr2);
	}

	public Calculadora(int teclas, String tipo) {
		this.teclas = teclas;
		this.tipo = tipo;
	}

//	2. Crie um método público que retorne o tipo int, com
// o nome subtrair e que receba dois parâmetros do tipo int;
	public int subtrair(int nr1, int nr2) {
//3. Dentro do método, retorne a diferença entre o primeiro parâmetro e o 
//	segundo parâmetro;
		return (nr1 - nr2);
	}

//4. Crie os métodos públicos multiplicar e dividir, retornando, 
	// respectivamente, a multiplicação e divisão dos parâmetros;
	public int multiplicar(int nr1, int nr2) {
		return (nr1 * nr2);
	}

	public int dividir(int nr1, int nr2) {
		return (nr1 / nr2);
	}

	public int operacoes(int nr1, int nr2, char op) {

		switch (op) {
		case '+':
//			return (nr1 + nr2);
			somar(nr1, nr2);
		case '-':
			return (nr1 - nr2);
		case '/':
			return (nr1 / nr2);
		case '*':
			return (nr1 * nr2);
		default:
			System.out.println("Operação inválida!");
			return 0;
		}

	}

	/**
	 * @return the teclas
	 */
	public int getTeclas() {
		return teclas;
	}

	/**
	 * @param teclas the teclas to set
	 */
	public void setTeclas(int teclas) {
		this.teclas = teclas;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
