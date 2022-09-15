

package Entidades;

import Interfaz.CalculosFormas;

/**
 *
 * 
 */
public class Rectangulo implements CalculosFormas{
    private float base;
    private float altura;

    public Rectangulo() {
    }

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public void area(float PI) {
        System.out.println("ÁREA DEL RECTÁNGULO: "+(base*altura));
    }

    @Override
    public void perimetro(float PI) {
        System.out.println("PERÍMETRO DEL RECTÁNGULO: "+((base+altura)*2));
    }
    
    

}
  
