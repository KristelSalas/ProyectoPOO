package proyectopoo;

public class EjercicioArriba extends Ejercicio {
    
    private int peso;

    public EjercicioArriba(int peso, String nombreEjercicio, int repeticiones, String nombreImagen, float tiempoTardado) {
        super(nombreEjercicio, repeticiones, nombreImagen, tiempoTardado);
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "EjercicioArriba{" + "peso=" + peso + '}';
    }

    
    
}
