

package Entidades;

/**
 *
 * 
 */
public abstract class AlojamientoExtraHotelero extends Alojamiento{
    protected boolean priv;
    protected int superficie;

    public AlojamientoExtraHotelero() {
    }

    public AlojamientoExtraHotelero(boolean priv, int superficie, String nom, String dire, String localidad, String gerente) {
        super(nom, dire, localidad, gerente);
        this.priv = priv;
        this.superficie = superficie;
    }

    public boolean isPriv() {
        return priv;
    }

    public void setPriv(boolean priv) {
        this.priv = priv;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }
    
    
}
