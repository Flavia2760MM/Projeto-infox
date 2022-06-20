package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author Flavia
 */
public class ModuloConexao {
    // Metodo responsavel por estabelecer a conexão com o banco de dados

    public static Connection conector() {
        Connection conexao = null;
        // a linha abaixo "chama" o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        //Informações do banco de dados
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "SistemaOS2022";

        //realizando a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            //System.out.println("Funcionou");
            return conexao;
            
        } catch (Exception e) {
            System.out.println(e);
            return null;

        }

    }

}
