package br.com.impacta.prateleiradigital.controle;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import br.com.impacta.prateleiradigital.negocio.Filme;
//import br.com.impacta.prateleiradigital.negocio.FiltroFilme;
import br.com.impacta.prateleiradigital.persistencia.FilmeDAO;

/**
 * Representa o papel do controlador/coordenador para todos os fluxos de negócio relacionados ao filme.  
 */
public class FilmeController {
	
	FilmeDAO filmeDAO = new FilmeDAO();
		
	public int cadastrarfilme(Filme filme) throws SQLException{
			return filmeDAO.insert(filme);
	}
	
	
}