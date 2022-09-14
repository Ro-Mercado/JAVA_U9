

package Entidades;

/**
 *
 * 
 */
public class Perro extends Animal {

    public Perro(String nom, String alimento, int edad, String raza) {
        super(nom, alimento, edad, raza);
    }
    
@Override
    public void Alimentarse() {
        System.out.println("El perro "+nom+ " se alimenta de "+alimento);
    }
    
    

}
