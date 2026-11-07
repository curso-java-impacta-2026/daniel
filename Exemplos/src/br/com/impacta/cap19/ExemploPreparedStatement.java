package br.com.impacta.cap19;

import java.sql.*;

public class ExemploPreparedStatement {

    public static void main(String[] args) {
        
        try {
            Connection cn = DriverManager.getConnection(
            		"jdbc:mysql://localhost:3306/impacta", "root", "impacta1");

            PreparedStatement ps = cn.prepareStatement(
            		"INSERT INTO alunos VALUES (?, ?, ?)");
            
            ps.setInt(1, 5);
            ps.setString(2, "Manuel Nunca");
            ps.setString(3, "(11) 74978-7985");
            int retorno = ps.executeUpdate();
            

            System.out.println("Aluno cadastrado com sucesso.");
            System.out.println("Retorno:" + retorno);

            ps.close();
            cn.close();
            System.out.println("Conexão encerrada.");
            
        } catch (SQLException e) {
            System.out.println("Falha ao realizar a operação.");
            e.printStackTrace();
        }
    }
}