package br.com.impacta.cap11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
//		ExemploThrows exth = new ExemploThrows();
//		
//		try {
//			exth.metodo1();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Scanner scan = new Scanner(System.in);
		
		
		int n1=0;
		int n2=0;
		boolean chave = false;
		
		try {
			do{
				System.out.println("n1:");
				n1 = scan.nextInt();
				System.out.println("n2:");
				n2 = scan.nextInt();
				System.out.println(n1+n2);				
			}while(chave);
			
			chave = (n1+n2) > 0 ? false : true;
			
		} catch (InputMismatchException e) {
			System.out.println("Apenas numeros!!");
		} finally {
			scan.close();			
		}
		
	}
}
