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
public class Chocolate extends IngredienteDecorator {
    
    public Chocolate(Bebida bebida){
        this.bebida = bebida;
    }
    
    public String getDescricao(){
        return bebida.getDescricao() + ", com Chocolate";
    }
    
    public double custo(){
        return 0.99 + bebida.custo();
    }
}
