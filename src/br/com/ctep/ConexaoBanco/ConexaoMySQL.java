package br.com.ctep.ConexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
    public static String status = "Não conectou";

    public ConexaoMySQL(){

    }
    public static Connection getConexaoMySQL(){
        Connection connection = null;
        try{
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            String serverName = "localhost";
            String myDatabase = "mysql";
            String url = "jdbc:mysql://" + serverName + "/" + myDatabase;
            String username = "root";
            String password = "C7mJkN0Y.tjg";
            connection = DriverManager.getConnection(url, username, password);
            if(connection != null)
                status = ("STATUS--->Conectado com sucesso!");
            else
                status = ("STATUS--->Não foi possivel realizar conexão");
            return connection;
        }
        catch (ClassNotFoundException e){
            System.out.println("O diver especificado nao foi encobtrado.");
            return null;
        }
        catch (SQLException e){
            System.out.println("Falha ao conectar no banco.");
            return null;
        }
    }
    public static boolean fecharConexao(){
        try {
            getConexaoMySQL().close();
            return true;
        }
        catch (SQLException e){
            return false;
        }
    }
    public static Connection reiniciarConexao(){
        fecharConexao();
        return getConexaoMySQL();
    }
}
