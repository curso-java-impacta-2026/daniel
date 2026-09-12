package br.com.impacta;

public class UwU {
	public static void main(String[] args) {
		try {
			int i = 10/0;
			i = 2;
			System.out.println(i);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
