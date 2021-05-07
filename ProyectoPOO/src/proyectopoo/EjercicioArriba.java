package proyectopoo;

public class EjercicioArriba extends Ejercicio {
    
    private int peso;
    
    public EjercicioArriba(String nombreEjercicio, int repeticiones, String nombreImagen, int peso, float tiempoTardado) {
        super(nombreEjercicio, repeticiones, nombreImagen, peso, tiempoTardado);
    }

    @Override
    public String toString() {
        return "EjercicioArriba{" + "peso=" + peso + '}';
    }

    
    
}
