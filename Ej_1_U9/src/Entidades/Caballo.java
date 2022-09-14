

package Entidades;

/**
 *
 * 
 */
public class Caballo extends Animal{

    public Caballo(String nom, String alimento, int edad, String raza) {
        super(nom, alimento, edad, raza);
    }
  @Override
    public void Alimentarse() {
        System.out.println("El caballo se alimenta de "+alimento);
    }
}
