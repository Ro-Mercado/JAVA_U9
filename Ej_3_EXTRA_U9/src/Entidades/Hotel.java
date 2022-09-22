

package Entidades;

/**
 *
 * 
 */
public abstract class Hotel extends Alojamiento{
   //Cantidad de Habitaciones, Número de Camas, Cantidad de Pisos, Precio de Habitaciones.
    protected int numHab, numCamas, numPisos;
    protected float precioHab;

    public Hotel() {
    }

    public Hotel(int numHab, int numCamas, int numPisos, float precioHab, String nom, String dire, String localidad, String gerente) {
        super(nom, dire, localidad, gerente);
        this.numHab = numHab;
        this.numCamas = numCamas;
        this.numPisos = numPisos;
        this.precioHab = precioHab;
    }

    public int getNumHab() {
        return numHab;
    }

    public void setNumHab(int numHab) {
        this.numHab = numHab;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public float getPrecioHab() {
        return precioHab;
    }

    public void setPrecioHab(float precioHab) {
        this.precioHab = precioHab;
    }
    
}
