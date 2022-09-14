

package Entidades;

import Interfaz.CalculosFormas;

/**
 *
 * 
 */
public class Circulo implements CalculosFormas {
    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public void area(float PI) {
        System.out.println("ÁREA DEL CÍRCULO: "+(PI*(radio*radio)) );
    }

    @Override
    public void perimetro(float PI) {
        System.out.println("PERÍMETRO DEL CÍRCULO: "+(PI*(radio+radio)) );
    }

  

    
    
    
}
