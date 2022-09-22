

package Entidades;

/**
 *
 * 
 */
public class Residencias extends AlojamientoExtraHotelero{
    private int cantHab;
    private boolean descuentos, campoDeportivo;

    public Residencias() {
    }

    public Residencias(int cantHab, boolean descuentos, boolean campoDeportivo, boolean priv, int superficie, String nom, String dire, String localidad, String gerente) {
        super(priv, superficie, nom, dire, localidad, gerente);
        this.cantHab = cantHab;
        this.descuentos = descuentos;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHab() {
        return cantHab;
    }

    public void setCantHab(int cantHab) {
        this.cantHab = cantHab;
    }

    public boolean isDescuentos() {
        return descuentos;
    }

    public void setDescuentos(boolean descuentos) {
        this.descuentos = descuentos;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }
    
    
}
