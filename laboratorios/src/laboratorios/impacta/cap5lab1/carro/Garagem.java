package laboratorios.impacta.cap5lab1.carro;

public class Garagem {

	public Carro carroPasseio;
	public Carro carroUtilitario;
	public Carro carroEsportivo;

	public static void main(String[] args) {

		Garagem g = new Garagem();

		g.carroPasseio = new Carro();
		g.carroPasseio.cor = "vermelho";
		g.carroPasseio.modelo = "VW Jetta";
		g.carroPasseio.potencia = 2.3;

		g.carroUtilitario = new Carro();
		g.carroUtilitario.cor = "branco";
		g.carroUtilitario.modelo = "Renault Boxer";
		g.carroUtilitario.potencia = 3.8;

		g.carroEsportivo = new Carro();
		g.carroEsportivo.cor = "Vermelho";
		g.carroEsportivo.modelo = "Bugatti";
		g.carroEsportivo.potencia = 3000;

		System.out.println("Carro de Passeio: ");
		System.out.println("Cor: " + g.carroPasseio.cor);
		System.out.println("Modelo: " + g.carroPasseio.modelo);
		System.out.println("Potência: " + g.carroPasseio.potencia);

		System.out.println("---------------------------------------");

		System.out.println("Carro Utilitário: ");
		System.out.println("Cor: " + g.carroUtilitario.cor);
		System.out.println("Modelo: " + g.carroUtilitario.modelo);
		System.out.println("Potência: " + g.carroUtilitario.potencia);

		System.out.println("---------------------------------------");

		System.out.println("Carro Esportivo: ");
		System.out.println("Cor: " + g.carroEsportivo.cor);
		System.out.println("Modelo: " + g.carroEsportivo.modelo);
		System.out.println("Potência: " + g.carroEsportivo.potencia);

	}

}