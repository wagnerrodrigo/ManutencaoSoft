/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

/**
 *
 * @author wagner
 */
public abstract class Bebida {
    String descricao = "Bebida Desconhecida";
    
    public String getDescricao(){
        return descricao;
    }
    
    public abstract double custo();
}
