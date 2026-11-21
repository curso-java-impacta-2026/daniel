package br.com.impacta.prateleiradigital.testes;

import java.sql.SQLException;
import java.util.List;

import br.com.impacta.prateleiradigital.controle.FilmeController;
import br.com.impacta.prateleiradigital.negocio.Filme;

public class TesteCatalogo {
	 public static void main(String[] args) {
		 FilmeController fc = new FilmeController();
		 
	 // A ordem dos argumentos acompanha o construtor da apostila.
//		 Filme filme = new Filme("Matrix", "Wachowski Brothers", 9, 300, 1999, "Ficção", 3000, "http://www.enterthematrix.com");
	 //System.out.println(filme.getTitulo() + " (" + filme.getAno() + ")");

		 try {
			 //ATUALIZA FILME
			 
			 //fc.atualizaFilme(2, filme);
			 
			 //CADASTRAR FILME
//			 fc.cadastrarfilme(filme);

			 //DELETA FILME
			 fc.deletarFilme(3);
			 
			 //PEGAR FILME DE DB
			 List<Filme> filmesMesmo = fc.listaFilmes();
			 
			 filmesMesmo.forEach(f -> System.out.println(f.getTitulo()+" ("+ f.getAno() + ")"));
			 
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 } 
}