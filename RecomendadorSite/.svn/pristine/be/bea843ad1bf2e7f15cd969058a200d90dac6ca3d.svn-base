/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import Dados.ProdutoDAO;
import Dados.UsuarioDAO;
import Dados.VendaDAO;
import Entidades.Produto;
import Entidades.Usuario;
import Entidades.Venda;
import Negócio.Algoritmo1;
import Negócio.ServiçoDeRecomendacao;
import java.util.Date;

/**
 *
 * @author Pedro
 */
public class teste {
    
    public static void main(String args[]){
        
        ProdutoDAO p = new ProdutoDAO();
        p.addProduto(new Produto(1, "produto1", (float) 1));
        p.addProduto(new TV(1, "", (float)1));
        p.addProduto(new TV(2, "", (float)1));
        p.addProduto(new Notebook(3, "", (float) 1));
        p.addProduto(new Livro(4, "", (float) 1));
        
        UsuarioDAO u = new UsuarioDAO();
        u.addUsuario(new Usuario(1,"","","","","",""));
        u.addUsuario(new UsuarioPersonalizado(1,"","","","","",""));
        
        VendaDAO v = new VendaDAO();
        v.addVenda(new Venda(u.getUsuarios().get(0), p.getProdutos(), new Date()));
        v.addVenda(new Venda(u.getUsuarios().get(0), p.getProdutos(), new Date()));
        v.addVenda(new Venda(u.getUsuarios().get(0), p.getProdutos(), new Date()));
        v.addVenda(new Venda(u.getUsuarios().get(0), p.getProdutos(), new Date()));
        
        ServiçoDeRecomendacao.realizar(ServiçoDeRecomendacao.ALGORITMO1, v.getVendas());
    }
    
}
