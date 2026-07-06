/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import data.GestorServicios;
import java.util.ArrayList;
import model.ServicioTuristico;

/**
 * Clase principal de la aplicación. Actúa como el punto de inicio (Main) 
 * encargada de inicializar el gestor de servicios para la dos funciones:
 * 1) Generar los servicios y crear el ArrayList con polimorfos
 * 2) mostrar la informacion por pantalla mediante el metodo mostrarServicios().
 * @author Francisco
 */
public class LlanquihueToursAppS7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       GestorServicios gestor = new GestorServicios();
       ArrayList<ServicioTuristico> servicios = gestor.generarServicios();
       
       gestor.mostrarServicios(servicios);
        
    }
    
}
