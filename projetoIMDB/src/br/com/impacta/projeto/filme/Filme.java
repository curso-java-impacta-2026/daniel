package br.com.impacta.projeto.filme;

public class Filme {

	private String titulo;
	private String diretores;
	private double nota;
	private int duracao;
	private int ano;
	private String generos;
	private int numDeVotos;
	private String url;
	public static boolean ativado;

	public void mostrar(int nr) {
		System.out.println("O valor do número é : " + nr);
	}

	public void mostrar(String nome) {
		System.out.println("O nome é : " + nome);
	}

	public void mostrar() {
		System.out.println("Sem valor!");
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the diretores
	 */
	public String getDiretores() {
		return diretores;
	}

	/**
	 * @param diretores the diretores to set
	 */
	public void setDiretores(String diretores) {
		this.diretores = diretores;
	}

	/**
	 * @return the nota
	 */
	public double getNota() {
		return nota;
	}

	/**
	 * @param nota the nota to set
	 */
	public void setNota(double nota) {
		this.nota = nota;
	}

	/**
	 * @return the duracao
	 */
	public int getDuracao() {
		return duracao;
	}

	/**
	 * @param duracao the duracao to set
	 */
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	/**
	 * @return the ano
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * @param ano the ano to set
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
	 * @return the generos
	 */
	public String getGeneros() {
		return generos;
	}

	/**
	 * @param generos the generos to set
	 */
	public void setGeneros(String generos) {
		this.generos = generos;
	}

	/**
	 * @return the numDeVotos
	 */
	public int getNumDeVotos() {
		return numDeVotos;
	}

	/**
	 * @param numDeVotos the numDeVotos to set
	 */
	public void setNumDeVotos(int numDeVotos) {
		this.numDeVotos = numDeVotos;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

}

//Exemplos
//
//public void setTitulo(String titulo) {
//	this.titulo = titulo.toUpperCase();
//}
//
//public String getTitulo() {
//	return this.titulo;
//}
//
//public static void teste() {
//}
////
////public String mostra(String texto1, String texto2) {
////
////	String concatenada = texto1 + " - " + texto2;
////
////	return concatenada;
////}
//
//public String mostra(String... texto) {
//
//	String concatenada = "";
//
//	for (String string : texto) {
//		concatenada += string + " ";
//	}
//
//	return concatenada;
//}
//
//public static void main(String[] args) {
//
////	Filme f = new Filme();
////
////	f.setTitulo("Mais do Mesmo!");
////	
////	teste();
////
////	System.out.println(f.getTitulo());
//
////	Filme f = new Filme();
////
////	Filme filme = new Filme();
////
////	filme.setTitulo("Titanic");
////	f.setTitulo("Titanic");
//
////	f = filme;
//
////	String nome = "Gustavo";
////	String nome2 = "Gustav";
//
////	System.out.println(filme.getTitulo().equals(f.getTitulo()));
////	System.out.println(nome.equals(nome2));
//
//	Filme filme = new Filme();
//	filme.setTitulo("Titanic");
//
//	System.out.println(filme.mostra("Olá", "mundo", "maravilhindo", "deu", "o", "horário!"));
//
//}
