

package Entidades;

/**
 *
 * 
 */
public class Hotel5 extends Hotel4{
    private int cantSalones, cantSuites, cantLimo;

    public Hotel5() {
    }

    public Hotel5(int cantSalones, int cantSuites, int cantLimo, String gim, String nomRes, int capacidadR, int numHab, int numCamas, int numPisos, float precioHab, String nom, String dire, String localidad, String gerente) {
        super(gim, nomRes, capacidadR, numHab, numCamas, numPisos, precioHab, nom, dire, localidad, gerente);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimo = cantLimo;
    }

    public int getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(int cantSalones) {
        this.cantSalones = cantSalones;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimo() {
        return cantLimo;
    }

    public void setCantLimo(int cantLimo) {
        this.cantLimo = cantLimo;
    }
     
}
