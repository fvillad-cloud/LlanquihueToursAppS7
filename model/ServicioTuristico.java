/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *  Esta clase corresponde a una Super Clase o Case Padre y representa un servicio turistico generico 
 * ofrecido por Llanquihue Tours. Define las caracteristicas comunes de cada servicio turistico
 * @author Francisco
 */
public class ServicioTuristico {
    private String nombre;
    private int duracionHoras;
    
    /**
     * 
     * @param nombre, representa el nombre del servicio turistico.
     * @param duracionHoras, representa la duracion en horas de cada servicio turistico. 
     */

    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }
    
    // Setters and Getters...

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }
    
    /**
     * Método que muestra por consola informacion esencial de la clase. Este método es sobreescrito por las clases hijas.
     */
    public void mostrarInformacion(){
        System.out.println("Nombre              : "+nombre);
        System.out.println("Duracion en horas   : "+duracionHoras);
    }
}
