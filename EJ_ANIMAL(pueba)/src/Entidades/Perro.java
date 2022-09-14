

package Entidades;

import Interfaces.AccionPerruna;

/**
 *
 * 
 */
public class Perro extends Animal implements AccionPerruna {
    @Override
    public void hacerRuido(){
        System.out.println("Gua Gua");
    }
     @Override
    public void ladrar(int cantVeces) {
         System.out.println("El perro ladró "+cantVeces+"veces..");
    }

    @Override
    public void babear(int ml) {
      
    }
}
