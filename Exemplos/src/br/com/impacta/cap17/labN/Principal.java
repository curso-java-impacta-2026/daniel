package br.com.impacta.cap17.labN;

public class Principal {
	public static void main(String[] args) {
		Piloto p1 = new Piloto("Sonic");
		Piloto p2 = new Piloto("Tails");
		
		p1.start();
		p2.start();
	}
}
