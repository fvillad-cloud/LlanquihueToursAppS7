/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Representa un tour del tipo gastronómico, hereda de la clase padre 'ServicioTuristico'.
 * @author Francisco
 */
public class RutaGastronomica extends ServicioTuristico{
    private int numeroDeParadas;

        /**
         * Constructor de la ruta gastronomica 
         * @param numeroDeParadas, representa el numero locales gastronómicos que se visitarán durante el tour
         * @param nombre, representa el nombre de la ruta gastronomica
         * @param duracionHoras, representa la duracion en horas de la ruta gastronomica
         */
    public RutaGastronomica(int numeroDeParadas, String nombre, int duracionHoras) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }
    
    
    /**
     * Sobreescritura del metodo mostrarInformacion()
     */
       
    @Override
    public void mostrarInformacion(){
        System.out.println("Nombre              : "+getNombre());
        System.out.println("Duracion en horas   : "+getDuracionHoras());
        System.out.println("Numero de paradas   : "+numeroDeParadas);
    }
}
