package br.com.impacta.cap15.lab2;

import java.util.ArrayList;

public class Cap15_Lab2 {
	public static void main(String[] args) {
		ArrayList<Estudante> estudanteList = new ArrayList<>();
		
		estudanteList.add(new Estudante("Joana",8.5,8.5));
		estudanteList.add(new Estudante("Antônio",6,9));
		estudanteList.add(new Estudante("Mariana",7.5,9));
		estudanteList.add(new Estudante("Ricardo",7.0,6));
		estudanteList.add(new Estudante("Gustavo",9.5,10));
		
		estudanteList.forEach(s -> s.setMedia((s.getNotaMatematica()+s.getNotaPortugues())/2));
		estudanteList.forEach(s -> System.out.println(s.getNome() +": "+s.getMedia() ));
	}
}
