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
public class Cafeteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bebida bebida = new Expresso();
        System.out.println(bebida.getDescricao() + " R$ " + bebida.custo());
       
        Bebida bebida2 = new MisturaXXX();
        bebida2 = new Chocolate(bebida2);
        
        bebida2 = new Leite(bebida2);
        
        System.out.println(bebida2.getDescricao() + " R$ " + bebida2.custo());
 
    }
    
}
