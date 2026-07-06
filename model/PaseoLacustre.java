/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Representa una actividad de navegación en lagos.
 * Hereda de la clase ServicioTuristico.
 * @author Francisco
 */
public class PaseoLacustre extends ServicioTuristico{
    private String tipoEmbarcacion;

    /**
     * 
     * @param tipoEmbarcacion, representa el tipo de vehiculo acuatico que se utilizará para el paseo
     * @param nombre, representa el nombre del paseo lacustre
     * @param duracionHoras, representa la duracion en horas del paseo. 
     */
    public PaseoLacustre(String tipoEmbarcacion, String nombre, int duracionHoras) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }
    
    /**
     * Sobreescritura del metodo mostrarInformacion()
     */
    @Override
    public void mostrarInformacion(){
        System.out.println("Nombre              : "+getNombre());
        System.out.println("Duracion en horas   : "+getDuracionHoras());
        System.out.println("Tipo de embarcacion : "+tipoEmbarcacion);
    }
    
}
