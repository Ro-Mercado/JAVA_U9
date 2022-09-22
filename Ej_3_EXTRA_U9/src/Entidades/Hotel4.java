

package Entidades;

/**
 *
 * 
 */
public class Hotel4 extends Hotel{
    protected String gim, nomRes;
    protected int capacidadR;//capacidad del restaurante

    public Hotel4() {
    }

    public Hotel4(String gim, String nomRes, int capacidadR, int numHab, int numCamas, int numPisos, float precioHab, String nom, String dire, String localidad, String gerente) {
        super(numHab, numCamas, numPisos, precioHab, nom, dire, localidad, gerente);
        this.gim = gim;
        this.nomRes = nomRes;
        this.capacidadR = capacidadR;
    }

    public String getGim() {
        return gim;
    }

    public void setGim(String gim) {
        this.gim = gim;
    }

    public String getNomRes() {
        return nomRes;
    }

    public void setNomRes(String nomRes) {
        this.nomRes = nomRes;
    }

    public int getCapacidadR() {
        return capacidadR;
    }

    public void setCapacidadR(int capacidadR) {
        this.capacidadR = capacidadR;
    }
    
    
}
