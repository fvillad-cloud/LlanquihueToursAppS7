/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 * Representa un recorrido enfocado en sitios históricos o patrimoniales.
 * Hereda de la clase ServicioTuristico.
 * @author Francisco
 */
public class ExcursionCultural extends ServicioTuristico{
    private String lugarHistorico;

    /**
     * 
     * @param lugarHistorico, representa el lugar historico o patrimonial a visitar en el tour.
     * @param nombre, representa el nombre de la excursion cultural.
     * @param duracionHoras , representa la duracion en hora de la excursion cultural.
     */
    public ExcursionCultural(String lugarHistorico, String nombre, int duracionHoras) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }
    
    /**
     * Sobreescritura del metodo mostrarInformacion()
     */
    @Override
    public void mostrarInformacion(){
        System.out.println("Nombre              : "+getNombre());
        System.out.println("Duracion en horas   : "+getDuracionHoras());
        System.out.println("Lugar Historico     : "+lugarHistorico);
    }
}
