

package Entidades;

/**
 *
 * 
 */
public class Animal {
// tendrá como atributos el nombre, alimento, edad y raza del Animal.
   protected String nom;
   protected String alimento;
   protected int edad;
   protected String raza;

   
    public Animal(String nom, String alimento, int edad, String raza) {
        this.nom = nom;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
   
   public void Alimentarse(){};
    
}
