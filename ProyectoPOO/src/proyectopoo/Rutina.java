package proyectopoo;
import java.util.LinkedList;

public class Rutina extends Acciones{
    
    private String nombreRutina;
    private LinkedList<Ejercicio> ejerciciosRutina; 

    public Rutina(String nombreRutina) {
        this.nombreRutina = nombreRutina;
        this.ejerciciosRutina = new LinkedList<Ejercicio>();
    }

    public Rutina() {
        this.ejerciciosRutina = new LinkedList<Ejercicio>();
    }
    
    
    
    
    @Override
    public float tiempoTotal() {
        float total = 0;
        for(int x = 0; x < ejerciciosRutina.size(); x++){
            total = total + ejerciciosRutina.get(x).tiempoTotal();
        }
        return total;
    }
    
    @Override
    public void agregarEjerciciosaRutina(Ejercicio ejercicio) {
        ejerciciosRutina.add(ejercicio);
    }
    
    @Override
    public Acciones getEjercicio(int x) {
        return ejerciciosRutina.get(x);
    }
        
    
    
    
    
    
    
    
    /*public void agregarEjerciciosaRutina(Ejercicio ejercicio){
        ejerciciosRutina.add(ejercicio);
    }*/
    
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

    @Override
    public String toString() {
        return "Rutina{" + "nombreRutina=" + nombreRutina + ", ejerciciosRutina=" + ejerciciosRutina + '}';
    }

  
}
