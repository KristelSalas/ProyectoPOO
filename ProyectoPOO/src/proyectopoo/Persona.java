package proyectopoo;
import java.util.LinkedList;

public class Persona implements java.io.Serializable{
    
    private String nombre;
    private String apellido;
    private int cedula;
    private String correo;
    private String contraseña;
    private LinkedList<Rutina> rutinasRealizadas;
    private LinkedList<Rutina> rutinaPersonalizada;

    public Persona(String nombre, String apellido, int cedula, String correo, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rutinasRealizadas =  new LinkedList<Rutina>();
        this.rutinaPersonalizada = new LinkedList<Rutina>();
    }

    //hacer gets de las listas o leer los datos de los txt
    
    public void agregarEjerciciosRealizados(Rutina rutinaR){
        rutinasRealizadas.add(rutinaR);
    }
    
    
    public void agregarEjerciciosPersonalizados(Rutina rutinaP){
        rutinaPersonalizada.add(rutinaP);
    }
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre:" + nombre + ", apellido:" + apellido + ", cedula:" + cedula + ", correo:" + correo + ", contrase\u00f1a:" + contraseña + ", rutinasRealizadas:" + rutinasRealizadas + ", rutinaPersonalizada:" + rutinaPersonalizada + '}';
    }

    public LinkedList<Rutina> getRutinasRealizadas() {
        return rutinasRealizadas;
    }

    public LinkedList<Rutina> getRutinaPersonalizada() {
        return rutinaPersonalizada;
    }

    public void setRutinasRealizadas(LinkedList<Rutina> rutinasRealizadas) {
        this.rutinasRealizadas = rutinasRealizadas;
    }

    public void setRutinaPersonalizada(LinkedList<Rutina> rutinaPersonalizada) {
        this.rutinaPersonalizada = rutinaPersonalizada;
    }
    
    
    
}