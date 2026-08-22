package br.com.impacta.curso.lab;

public class Laboratorios {

	public static void main(String[] args) {

//		int valor1 = 10, valor2 = 20, resultado = 0;
//
//		resultado = valor1 + valor2;
//
//		System.out.println(valor1 + " + " + valor2 + " = " + resultado);

		int valor = 6;
		String resultado = "";

		resultado = (valor % 2 == 0) ? "PAR" : "IMPAR";

		System.out.println("O valor digitado é : " + resultado);
		System.out.printf("O valor digitado é : %s ", resultado);

	}

}
