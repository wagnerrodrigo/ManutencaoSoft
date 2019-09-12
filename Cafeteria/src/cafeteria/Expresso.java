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
public class Expresso extends Bebida {

   public Expresso(){
       descricao = "Café Expresso";
   }
   
   public double custo(){
       return 3.99;
   }
}
