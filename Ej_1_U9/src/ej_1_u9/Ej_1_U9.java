

package ej_1_u9;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;


public class Ej_1_U9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Animal perro1= new Perro("Stitch", "Carne", 15, "Doberman");
     perro1.Alimentarse();
     Animal perro2= new Perro("Teddy", "Croquetas", 10, "Chihuahua");
     perro2.Alimentarse();
     Animal gato1= new Gato("Pelusa", "Galleta", 15, "Siamés");
     gato1.Alimentarse();
     Animal caballo1= new Caballo("Spark", "Pasto", 25, "Fino");
     caballo1.Alimentarse();
    }

}
