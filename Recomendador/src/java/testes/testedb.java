/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testes;

import java.sql.Connection;

/**
 *
 * @author Pedro
 */
public class testedb {
    public testedb(){
        
    }
    
    public static void main(String[] args){
        try{
            Connection con = new ConexaoDB().getConnection();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }
}
