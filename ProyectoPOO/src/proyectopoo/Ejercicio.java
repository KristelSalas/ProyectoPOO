package proyectopoo;

public abstract class Ejercicio extends Acciones {
    
    private String nombreEjercicio;
    private int repeticiones;
    private String nombreImagen;
    private float tiempoTardado;

    public Ejercicio(String nombreEjercicio, int repeticiones, String nombreImagen, float tiempoTardado) {
        this.nombreEjercicio = nombreEjercicio;
        this.repeticiones = repeticiones;
        this.nombreImagen = nombreImagen;
        this.tiempoTardado = tiempoTardado;
    }

    
   @Override
    public float tiempoTotal() {
        return tiempoTardado;
    }
    
    
    
    public void setNombreEjercicio(String nombreEjercicio) {
        this.nombreEjercicio = nombreEjercicio;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }


    public void setTiempoTardado(float tiempoTardado) {
        this.tiempoTardado = tiempoTardado;
    }

    public String getNombreEjercicio() {
        return nombreEjercicio;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public String getNombreImagen() {
        return nombreImagen;
    }

}
