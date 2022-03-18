package german.libro;
import java.util.Scanner;



public class Editorial {
    static String nombreEditorial;
    static int edicion;
    static boolean primeraEdicion=false;

    public static int getEdicion() {
        return edicion;
    }

    public static String getNombreEditorial() {
        return nombreEditorial;
    }

    public static void setEdicion(int edicion) {
        Editorial.edicion = edicion;
    }

    public static void setNombreEditorial(String nombreEditorial) {
        Editorial.nombreEditorial = nombreEditorial;
    }

    
    public int consultarEdiciones(int edicion){
        Scanner leer = new Scanner(System.in);
        if (edicion!=1){
            System.out.println("Estás consultando la edición "+ edicion+ ", Cuál quieres consultar? ");
            int edicionConsultar = leer.nextInt();
            if (edicion==0){
                edicion=1;
            }
            else if(edicion<0){
                edicion=(edicion*-1);
            }
            else{
                System.out.println("Ahora estás consultando la edición "+ edicion);
            }
            
        }
        else{
            System.out.println("Este libro sólo tiene una edición.");
            primeraEdicion=true;
        }
        
        return edicion;
    }
     public static boolean isPrimeraEdicion() {
        return primeraEdicion;
    }
}