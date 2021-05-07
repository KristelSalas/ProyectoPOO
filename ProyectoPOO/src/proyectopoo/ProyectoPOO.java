package proyectopoo;
import java.io.*;

public class ProyectoPOO 
{
    public static void main(String[] args) 
    {
        
        Persona p1 = new Persona("Kristel", "Salas", 208180970, "Kristel@gmail.com", "Kristel123");
        escribirEnPersona(p1);
        leerPersonas();
        
        Ejercicio e1 = new EjercicioArriba(0,"No se",2,"",2);
        Rutina r1 = new Rutina("No se");
        r1.agregarEjerciciosaRutina(e1);
        //escribirRutinasArriba(r1);
        
        Ejercicio e2 = new EjercicioMedio("No se",2,"",2);
        Rutina r2 = new Rutina("No se");
        r2.agregarEjerciciosaRutina(e2);
        //escribirRutinasMedio(r2);
        
        Ejercicio e3 = new EjercicioAbajo(0,"No se",2,"",2);
        Rutina r3 = new Rutina("No se");
        //r3.agregarEjerciciosaRutina(e3);
        //escribirRutinasMedio(r3);
        
        loginFrame frame = new loginFrame();
        frame.show();
    }
    
    public static void escribirEnPersona(Persona p){//recibe la persona que se va a insertar en el archivo    
       try {
            FileOutputStream ficheroSalida = new FileOutputStream("Personas.bin",true);//cuando esta el true se escribe en el archivo ya existente cuando no lo crea
            ObjectOutputStream objetoSalida = new ObjectOutputStream(ficheroSalida);
            // se escriben los objetos de la clase Persona
            objetoSalida.writeObject(p);//escribir
            objetoSalida.close();//cerrar
            } catch (FileNotFoundException e) {
                System.out.println("¡El fichero no existe!");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
    }
    
    public static void leerPersonas(){  
      try {
            FileInputStream ficheroEntrada = new FileInputStream("Personas.bin");
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);
            // se leen dos objetos de la clase Persona
            Persona p1 = (Persona)objetoEntrada.readObject();//leer
            //Persona p2 = (Persona)objetoEntrada.readObject();//leer
            // se cierra el flujo de objetos objetoEntrada
            objetoEntrada.close();//cerrar archivo
            //System.out.println("DNI\t Nombre");
            System.out.println(p1.toString());
            //System.out.println(p2.toString());
            } catch (FileNotFoundException e) {
            System.out.println("¡El fichero no existe!");
            } catch (IOException e) {
            System.out.println(e.getMessage());
            } catch (Exception e) {
            System.out.println(e.getMessage());
            };
    }
    
    
    public static void escribirRutinasArriba(Rutina r){//recibe la persona que se va a insertar en el archivo    
       try {
            FileOutputStream ficheroSalida = new FileOutputStream("Personas.bin",true);//cuando esta el true se escribe en el archivo ya existente cuando no lo crea
            ObjectOutputStream objetoSalida = new ObjectOutputStream(ficheroSalida);
            // se escriben los objetos de la clase Persona
            objetoSalida.writeObject(r);//escribir
            objetoSalida.close();//cerrar
            } catch (FileNotFoundException e) {
                System.out.println("¡El fichero no existe!");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
    }
    
    
    public static void escribirRutinasMedio(Rutina r){//recibe la persona que se va a insertar en el archivo    
       try {
            FileOutputStream ficheroSalida = new FileOutputStream("Personas.bin",true);//cuando esta el true se escribe en el archivo ya existente cuando no lo crea
            ObjectOutputStream objetoSalida = new ObjectOutputStream(ficheroSalida);
            // se escriben los objetos de la clase Persona
            objetoSalida.writeObject(r);//escribir
            objetoSalida.close();//cerrar
            } catch (FileNotFoundException e) {
                System.out.println("¡El fichero no existe!");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
    }
    
    
    public static void escribirRutinasAbajo(Rutina r){//recibe la persona que se va a insertar en el archivo    
       try {
            FileOutputStream ficheroSalida = new FileOutputStream("Personas.bin",true);//cuando esta el true se escribe en el archivo ya existente cuando no lo crea
            ObjectOutputStream objetoSalida = new ObjectOutputStream(ficheroSalida);
            // se escriben los objetos de la clase Persona
            objetoSalida.writeObject(r);//escribir
            objetoSalida.close();//cerrar
            } catch (FileNotFoundException e) {
                System.out.println("¡El fichero no existe!");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
    }
}
