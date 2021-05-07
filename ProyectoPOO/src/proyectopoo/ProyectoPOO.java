package proyectopoo;
import java.io.*;
import java.util.Scanner;


public class ProyectoPOO 
{
    public static void main(String[] args) 
    {
        //File archivo = new File("Personas.txt");se declara el objeto x con ese nombre dentro del directorio de trabajo por lo que no se ocupa un path directo
        //System.out.println(archivo.getAbsolutePath());obtiene el path
        //System.out.println(archivo.exists());se fija si existe
        Persona p1 = new Persona("Kristel","Salas", 208180970,"Kristelsalas@gmail.com","Kristel123");
        //escribirEnPersona(p1);
        //leerPersonas(p1);
        leerotramanera();
      
        loginFrame frame = new loginFrame();
        frame.show();
    }
    
    
    
    
    
    public static void leerotramanera(){
        File f = new File("Personas.txt");
	Scanner s;
	try {
            s = new Scanner(f);
            while (s.hasNextLine()) {
		String linea = s.nextLine();
		Scanner sl = new Scanner(linea);
		//sl.useDelimiter("\\s*,\\s*");
		//System.out.println(sl.next());
		//System.out.println(sl.next());
		//System.out.println(sl.next());
            }
            s.close();
	} catch (FileNotFoundException e) {
            e.printStackTrace();
	}
    
    }
    
    
    
    
    
    
    public static void escribirEnPersona(Persona p){//recibe la persona que se va a insertar en el archivo
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("Personas.txt",true);//con el true escribe al final del documento si el true lo remplaza por uno nuevo 
            pw = new PrintWriter(fichero);
            
            pw.println(p);//la acción de escribir
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != fichero)
              fichero.close();//cierre del archivo
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
    
    public static void leerPersonas(Persona p){  
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         // Apertura del archivo y creacion de BufferedReader 
         archivo = new File ("Personas.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del archivo
         String linea;
         //while((linea=br.readLine())!=null)
            System.out.println(p.getCorreo());
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // Se cierra el archivo
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
    }
    
}
