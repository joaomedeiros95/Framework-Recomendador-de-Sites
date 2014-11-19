/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testes;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Pedro
 */
public class ConexaoDB {
    String serverName = "penapiservice.eu5.org";    //caminho do servidor do BD
    String mydatabase = "477510";        //nome do seu banco de dados
    String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
    String username = "477510";        //nome de um usuário de seu BD      
    String password = "projetodetalhado";      //sua senha de acesso
    
    public java.sql.Connection getConnection() {
        try {
            return DriverManager.getConnection(url, username, password);
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}
