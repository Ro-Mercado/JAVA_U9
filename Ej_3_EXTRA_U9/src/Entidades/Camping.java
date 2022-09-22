

package Entidades;

/**
 *
 * 
 */
public final class Camping extends AlojamientoExtraHotelero {
    private int maxCarpas, cantBanios;
    private boolean restaurante;

    public Camping() {
    }

    public Camping(int maxCarpas, int cantBanios, boolean restaurante, boolean priv, int superficie, String nom, String dire, String localidad, String gerente) {
        super(priv, superficie, nom, dire, localidad, gerente);
        this.maxCarpas = maxCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }

    public int getMaxCarpas() {
        return maxCarpas;
    }

    public void setMaxCarpas(int maxCarpas) {
        this.maxCarpas = maxCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }
    
}
