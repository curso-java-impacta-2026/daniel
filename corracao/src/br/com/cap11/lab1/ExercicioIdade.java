package br.com.cap11.lab1;

import java.util.Scanner;

public class ExercicioIdade {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Ano de nascimento: ");
		
		try {
			String ano = scan.nextLine();
			int i = Integer.parseInt(ano);
			System.out.println(2026 - i);
		} catch (NumberFormatException e) {
			System.out.println("Valor digitado inválido");
		} finally {
			scan.close();
		}
		
	}
	
}
