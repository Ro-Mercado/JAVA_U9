

package ej_animal.pueba;

import Entidades.Animal;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;
import java.util.List;


public class EJ_ANIMALPueba {

    /**
     * @param args the command line arguments
     * Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.
     */
    public static void main(String[] args) {
        List<Animal> animales= new ArrayList();
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        
        animales.add(a);
        animales.add(b);
        animales.add(c);
        
        for (Animal aux : animales) {
            if (aux instanceof Gato) {
                Gato object = (Gato) aux;
                object.hacerRuido();
                
                continue;
            }
            if (aux instanceof Perro) {
                Perro object = (Perro) aux;
                object.hacerRuido();
                object.ladrar(2);
                continue;
            }
            if (aux instanceof Animal) {
                Animal object = (Animal) aux;
                object.hacerRuido();
                continue;
            }
        }
    }

}
