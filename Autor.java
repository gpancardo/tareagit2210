package german.libro;


public class Autor {
    private String nombre;
    private String apellido;
    private int nacimiento;
    private boolean conocido;

    public String getApellido() {
        return apellido;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setConocido(boolean conocido) {
        this.conocido = conocido;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      
    public void noAnonimo(){
        if (conocido==true){
            System.out.println("El autor no es anónimo! ");
            System.out.println("El autor es "+ this.apellido + ", " + this.nombre + ".");
        }
        else{
            System.out.println("El autor es anónimo.");
        }
    }
}
