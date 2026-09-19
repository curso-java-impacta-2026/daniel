package br.com.cap11.lab1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExercicioGravacao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		try {
			String texto = scan.nextLine();
			PrintWriter writer = new PrintWriter("C:\\doc1.txt");
			writer.println(texto);
			writer.close();
		} catch (IOException e) {
			System.out.println("Falha ao gravar as informações digitadas"); 
		} finally {
			scan.close();
		}
	}
}
