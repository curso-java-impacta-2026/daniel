package br.com.impacta.cap14.lab1;

public class DescontoSalarial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] salariosBrutos = {1350.00,4320.15,8235.25,2500.55,1830.00,850.26,3614.29};
		double[] salariosLiquidos = {};
		
		salariosLiquidos = DoubleArrayUtils.transformaValores(salariosBrutos,(s)-> s*0.1);
		
		for (double i : salariosLiquidos) {
			System.out.println(i);
		}
		
		
	}

}
