package br.com.impacta.cap17.labN;

import java.util.Random;

public class Piloto extends Thread {
	
	private String nome;
	//private double pose = 0;
	private Random r = new Random();
	
	public Piloto(String nome) {
		this.nome = nome;
	}
	
	public void run() {
//		while(true) {
//			pose += r.nextDouble(0.003);
//
//			System.out.println("Piloto "+nome+" esta no metro: "+pose);
//		}
		
		try {
			for(int i =0; i <= 5; i++) {
				System.out.println("Piloto "+nome+" completou a volta n°: "+i);
				Thread.sleep(r.nextInt(3)*1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
}
