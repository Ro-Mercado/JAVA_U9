

package Entidades;

/**
 *
 * 
 */
public class Gato extends Animal{

    public Gato(String nom, String alimento, int edad, String raza) {
        super(nom, alimento, edad, raza);
    }
      @Override
    public void Alimentarse() {
        System.out.println("El gato se alimenta de "+alimento);
    }
}
