/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloConexao;

import java.sql.*;
/**
 *
 * @author artur_wmbyu0n
 */
public class Conexao {

    public static Connection conector(){
     java.sql.Connection conexao = null;
     
     String URL = "ec2-34-231-63-30.compute-1.amazonaws.com/";
     String NOME_BANCO = "db3dujmhd08149";
     String USUARIO = "gvmykmndsvapcq";
     String SENHA = "";
     
     try {
         Class.forName("org.postgresql.Driver");
         conexao = DriverManager.getConnection(
            "jdbc:postgresql://" + URL + NOME_BANCO, USUARIO, SENHA);
         return conexao;
         
     } catch(Exception e) {
         return conexao;
     }
    }
}



