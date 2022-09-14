

package ej_4_u9;

import Entidades.Circulo;
import Entidades.Rectangulo;


public class Ej_4_U9 {

    /**
     * Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
    geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
    dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
    dos métodos para calcular el área, el perímetro y el valor de PI como constante.
    Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
    calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
    resultado final.
    Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
    Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
     */
    public static void main(String[] args) {
        //Constante
        final float PI=(float) Math.PI;
        Circulo c=new Circulo(2);
        Rectangulo r= new Rectangulo(2,4);
        
       c.perimetro(PI);
       c.area(PI);
       System.out.println("----------------");
       r.perimetro(PI);
       r.area(PI);
    }

}
