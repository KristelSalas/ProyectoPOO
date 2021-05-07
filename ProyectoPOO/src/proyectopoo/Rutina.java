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
    
    public void quitarEjerciciosRutina(String nombre){
        for(Ejercicio x: ejerciciosRutina){
            if(x.getNombreEjercicio() == nombre){
                ejerciciosRutina.remove(x);
            }
        }
    }

    public void setNombreRutina(String nombreRutina) {
        this.nombreRutina = nombreRutina;
    }

    public LinkedList<Ejercicio> getEjerciciosRutina() {
        return ejerciciosRutina;
    }

    public String getNombreRutina() {
        return nombreRutina;
    }
    
    
    
    
}
