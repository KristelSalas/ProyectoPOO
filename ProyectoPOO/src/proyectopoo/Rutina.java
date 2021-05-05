package proyectopoo;
import java.util.LinkedList;

public class Rutina {
    
    private String nombreRutina;
    private LinkedList<Ejercicio> ejerciciosRutina; 

    public Rutina(String nombreRutina) {
        this.nombreRutina = nombreRutina;
        this.ejerciciosRutina = new LinkedList<Ejercicio>();
    }
    
    public void agregarEjerciciosaRutina(Ejercicio ejercicio){
        ejerciciosRutina.add(ejercicio);
    }
    
    
}
