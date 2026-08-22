package br.com.impacta.exemplo.heranca.teste;

import br.com.impacta.exemplo.heranca.Programador;

public class Teste {

	public static void main(String[] args) {
		Programador p = new Programador();
		
		p.setName("José");
		p.setSalario(0.69);
		p.setLinguagem("Java");
		
		System.out.println(p.getName());
		System.out.println(p.getSalario());
		System.out.println(p.getLinguagem());

	}

}
