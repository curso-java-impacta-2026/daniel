package br.com.impacta.prateleiradigital.persistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import br.com.impacta.prateleiradigital.connection.Conexao;
import br.com.impacta.prateleiradigital.negocio.Filme;

/**
 * Representa a classe que realiza o procedimento de mapeamento objeto-relacional da classe Filme 
 */
public class FilmeDAO {

	private final Conexao conexao;
	
	public FilmeDAO() {
		this.conexao = new Conexao();
	}
	
	public int insert(Filme f) throws SQLException {
		String sql = "INSERT INTO tb_filmes (titulo,diretores,nota,duracao,ano,generos,numVotos,url) VALUES(?,?,?,?,?,?,?,?)";
		
		try(Connection con = conexao.getConnection();PreparedStatement ps = con.prepareStatement(sql)){
			
			ps.setString(1, f.getTitulo());
			ps.setString(2, f.getDiretores());
			ps.setDouble(3, f.getNota());
			ps.setInt(4, f.getDuracao());
			
			ps.setInt(5, f.getAno());
			ps.setString(6, f.getGeneros());
			ps.setInt(7, f.getNumVotos());
			if(f.getUrl() == null) ps.setNull(8, Types.VARCHAR); else ps.setString(8, f.getUrl());
			
			return ps.executeUpdate();
			
		}
	}

}