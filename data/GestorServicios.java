/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.ArrayList;
import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

/**
 * Clase encargada de la creación de servicios turisticos mediante el método generarServicios(), el cual devuelve un ArrayList con polimorfos
 * Ademas, contiene el metodo mostrarServicios(), el cual se encarga de recorrer mediante un bucle for el ArrayList con polimorfos generados
 * previamente y luego imprime la informacion por pantalla
 * @author Francisco
 */
public class GestorServicios {
    
    public ArrayList<ServicioTuristico> generarServicios(){
        ArrayList<ServicioTuristico> servicios = new ArrayList<>();
        
        servicios.add(new RutaGastronomica(3,"Visita a pastelerias artesanales a orillas del lago",3));
        servicios.add(new PaseoLacustre("Catamaran", "Paseo por el Lago Llanquihue", 2));
        servicios.add(new ExcursionCultural("Castillo San Sebastian de la Cruz en Corral", "Visita al sistema de Fuertes en Valdivia", 5) );
        servicios.add(new RutaGastronomica(4,"Gastronomia Alemana en Puerto Varas",3));
        servicios.add(new PaseoLacustre("Lancha", "Vuelta al lago Villarica", 3));
        servicios.add(new ExcursionCultural("Molino de agua siglo XVIII en Puerto Varas", "Visita al molino de agua mas antiguo del sur", 3) );
        
        return servicios;
    }
    
    public void mostrarServicios(ArrayList<ServicioTuristico> servicios){
        System.out.println("==== LISTADO DE SERVICIOS TURISTICOS LLANQUIHUE TOURS ====");
        
        for(ServicioTuristico servicio:servicios){
            System.out.println("------------------------------------------------------");
            if(servicio instanceof RutaGastronomica){
                RutaGastronomica ruta = (RutaGastronomica) servicio;
                System.out.println("Tipo de servicio    : Ruta Gastronomica");
                ruta.mostrarInformacion();
            }else if(servicio instanceof PaseoLacustre paseo){ //Explicacion más abajo...
                System.out.println("Tipo de servicio    : Paseo Lacustre");
                paseo.mostrarInformacion();
            }else{
                ExcursionCultural excursion = (ExcursionCultural) servicio;
                System.out.println("Tipo de servicio    : Excursion Cultural");
                excursion.mostrarInformacion();
            }
            //El IDE me sugirió resumir la linea "PaseoLacustre paseo = (PaseoLacustre) servicio" como solo "paseo" dentro del argumento del if
            //de todas formas en el primer if creé el objeto tal cual como lo vimos en clases. 
        }
    }
    
}
