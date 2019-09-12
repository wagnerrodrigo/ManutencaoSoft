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
public class Leite extends IngredienteDecorator {
    Bebida bebida;
    
    public Leite(Bebida bebida){
        this.bebida = bebida;
    }
    
    public String getDescricao(){
        return bebida.getDescricao() + ", com leite";
    }
    
    public double custo(){
        return 1.10 + bebida.custo();
    }
}
