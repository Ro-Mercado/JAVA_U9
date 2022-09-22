

package Entidades;

/**
 *
 * 
 */
public abstract class Alojamiento {
//Los alojamientos se identifican por un nombre, una dirección,una localidad y un gerente encargado del lugar.
    protected String nom, dire, localidad, gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nom, String dire, String localidad, String gerente) {
        this.nom = nom;
        this.dire = dire;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    
    
}
