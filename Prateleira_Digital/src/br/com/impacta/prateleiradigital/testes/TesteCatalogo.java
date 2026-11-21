package br.com.impacta.prateleiradigital.testes;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import br.com.impacta.prateleiradigital.controle.FilmeController;
import br.com.impacta.prateleiradigital.negocio.Filme;

public class TesteCatalogo {
	
	 public static void main(String[] args) {
		 /*
		  * 1 - Cadastra Filme
		  * 2 - Lista Filme
		  * 3 - Atualiza Filme
		  * 4 - Excluir Filme
		  * 0 - Sair 
		  */
		 // Instanciar FilmeController
		 
		 FilmeController controller = new FilmeController();
		 
		 try(Scanner scan = new Scanner(System.in);){
			while (true) {
				montarTitulo("PRATELEIRA DIGITAL");
				
				System.out.println("1 - Cadastra Filme");
				System.out.println("2 - Lista Filme");
				System.out.println("3 - Atualiza Filme");
				System.out.println("4 - Excluir Filme");
				System.out.println("0 - Sair");
			
				System.out.println("Digite um num.: "); String opc = scan.nextLine().trim();
				
				switch (opc) {
				case "1": {
					montarTitulo("CADASTRAR FILME");
					Filme f = new Filme();
					System.out.println("Digite titulo do filme: "); f.setTitulo(scan.next());
					System.out.println("Digite diretores do filme: "); f.setDiretores(scan.next());
					System.out.println("Digite nota do filme: "); f.setNota(Double.parseDouble(scan.next()));
					System.out.println("Digite duração do filme: "); f.setDuracao(Integer.parseInt(scan.next()));
					System.out.println("Digite ano do filme: "); f.setAno(Integer.parseInt(scan.next()));
					System.out.println("Digite genero do filme: "); f.setGeneros(scan.next());
					System.out.println("Digite n. votos do filme: "); f.setNumVotos(Integer.parseInt(scan.next()));
					System.out.println("Digite url do filme: "); f.setUrl(scan.next());
					
					if (controller.cadastrarFilme(f) == 1) System.out.println("Filme "+f.getTitulo()+" cadastrado!"); else System.out.println("ERRO");
					
					break;
				} case "2": {
					montarTitulo("CATALOGO DE FILMES");
					List<Filme> lista = controller.listaFilmes();
					
					System.out.println(" |  TITULO |  ID  |  DIRETOR  |  NOTA  |  DURAÇÃO  |  ANO  |  GENERO  | N. VOTOS  |  URL ");
				
					lista.forEach((f) -> {
						System.out.print("\n [" +f.getId()+"]");
						System.out.print(" | " +f.getTitulo()+" | ");
						System.out.print(" | " +f.getDiretores()+" | ");
						System.out.print(" | " +f.getNota()+" | ");
						System.out.print(" | " +f.getDuracao()+" | ");
						System.out.print(" | " +f.getAno()+" | ");
						System.out.print(" | " +f.getGeneros()+" | ");
						System.out.print(" | " +f.getNumVotos()+" | ");
						System.out.print(" | " +f.getUrl()+" | ");
						
					});
					
					break;
				} case "3": {
					montarTitulo("ATUALIZAR FILME");
					
					System.out.println("Digite o id do filme a ser modificado: "); int id = Integer.parseInt(scan.next());
					
					
					Filme f = new Filme();
					System.out.println("Digite novo titulo do filme: "); f.setTitulo(scan.next());
					System.out.println("Digite novo diretores do filme: "); f.setDiretores(scan.next());
					System.out.println("Digite nova nota do filme: "); f.setNota(Double.parseDouble(scan.next()));
					System.out.println("Digite nova duração do filme: "); f.setDuracao(Integer.parseInt(scan.next()));
					System.out.println("Digite novo ano do filme: "); f.setAno(Integer.parseInt(scan.next()));
					System.out.println("Digite novo  genero do filme: "); f.setGeneros(scan.next());
					System.out.println("Digite novo n. votos do filme: "); f.setNumVotos(Integer.parseInt(scan.next()));
					System.out.println("Digite nova url do filme: "); f.setUrl(scan.next());
					
					if (controller.atualizaFilme(id, f) == 1) System.out.println("Filme "+f.getTitulo()+" atualizado!"); else System.out.println("ERRO");
							
					break;
				} case "4": {
					montarTitulo("EXCLUIR FILME");
					System.out.println("Digite o id do filme a ser DELETADO: "); int id = Integer.parseInt(scan.next());
					
					if (controller.deletarFilme(id) == 1) System.out.println("Filme DELETADO!"); else System.out.println("ERRO");
					
					break;
				} case "0": {
					montarTitulo("DESEJA MESMO SAIR??");
					System.out.println("Y / N ->: "); String resp = scan.next();
					
					if (resp == "Y") {
						scan.close();
						return;
					}
					
					break;
				}
				default:
					System.out.println("ERRO, R U FUCKING STUPID?");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		 
	 } 
	 
	 static void montarTitulo(String titulo) {
		 System.out.println("\n ==== " + titulo + " ====");
		 System.out.println("|-----------------------|");
	 }
}
