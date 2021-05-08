package proyectopoo;
import java.io.*;

public class ProyectoPOO 
{
    public static void main(String[] args) 
    {
        
        Persona p1 = new Persona("Luis", "Mora", 200000000, "Luis@gmail.com", "Luis123");
        //escribirEnPersona(p1);
        leerPersonas();
        
        Ejercicio e1 = new EjercicioArriba(5,"Bench Press",15,"",0);
        Rutina r1 = new Rutina("Rutina Superior");
        r1.agregarEjerciciosaRutina(e1);
        escribirRutinasArriba(r1);
        
        p1.agregarEjerciciosPersonalizados(r1);
        p1.imprimirEjerciciosPersonalizados();
        
        
        Ejercicio e2 = new EjercicioMedio("Planck Frontal",10,"",0);
        Rutina r2 = new Rutina("Rutina Abdominal");
        r2.agregarEjerciciosaRutina(e2);
        escribirRutinasMedio(r2);
        
        Ejercicio e3 = new EjercicioAbajo(0,"Sentadilla Copa Sumo",15,"",0);
        Rutina r3 = new Rutina("Rutina Inferior");
        r3.agregarEjerciciosaRutina(e3);
        escribirRutinasAbajo(r3);
       
        //leerPersonas2();
        //loginFrame frame = new loginFrame();
        //frame.show();
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
    
    
    public static void escribirRutinasArriba(Rutina r){//recibe las rutinas que se va a insertar en el archivo    
       try {
            FileOutputStream ficheroSalida = new FileOutputStream("RutinasArriba.bin",true);//cuando esta el true se escribe en el archivo ya existente cuando no lo crea
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
    
    
    public static void escribirRutinasMedio(Rutina r){//recibe la rutina que se va a insertar en el archivo    
       try {
            FileOutputStream ficheroSalida = new FileOutputStream("RutinasMedio.bin",true);//cuando esta el true se escribe en el archivo ya existente cuando no lo crea
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
    
    
    public static void escribirRutinasAbajo(Rutina r){//recibe la rutina que se va a insertar en el archivo    
       try {
            FileOutputStream ficheroSalida = new FileOutputStream("RutinasAbajo.bin",true);//cuando esta el true se escribe en el archivo ya existente cuando no lo crea
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
    
    
    public static void escribirRutinasPersonas(Persona p){//recibe la persona que se va a insertar en el archivo    
       try {
            FileOutputStream ficheroSalida = new FileOutputStream("RutinasPersonas.bin",true);//cuando esta el true se escribe en el archivo ya existente cuando no lo crea
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
    
    
    public static void leerPersonas2(){  
      try {
            FileInputStream ficheroEntrada = new FileInputStream("RutinasPersonas.bin");
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
        
        public static Persona buscarPersona(String correo, String contra){
        try {
            FileInputStream ficheroEntrada = new FileInputStream("Personas.bin");
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);
            
            // se leen dos objetos de la clase Persona
            Object aux = objetoEntrada.readObject();
            while(aux != null)
            {
                Persona p1 = (Persona)aux;
                if(p1.getCorreo().equals(correo) && p1.getContraseña().equals(contra)){
                    return p1;
                }    
                aux = objetoEntrada.readObject();
            }
            
            objetoEntrada.close();//cerrar archivo

        } catch (FileNotFoundException e) {
            System.out.println("¡El fichero no existe!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        };
        return null;
    }
}
