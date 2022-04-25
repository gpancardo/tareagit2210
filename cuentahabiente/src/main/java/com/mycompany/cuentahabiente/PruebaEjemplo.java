package com.mycompany.cuentahabiente;

public class PruebaEjemplo {
    public static void main(String[] args){

            Cuentahabiente [] usuariosMuestra = new Cuentahabiente[5];
            usuariosMuestra[0]= new Cuentahabiente("MXMX001", "PEREZ JUAN", 100);
            usuariosMuestra[1]= new Cuentahabiente("MXMX002", "GARCIA PEDRO", 40000);
            usuariosMuestra[2]= new Cuentahabiente("MXMX003", "SILVA ANGELICA", 122000);
            usuariosMuestra[3]= new Cuentahabiente("MXMX004", "GOMEZ ROSA", 333000);
            usuariosMuestra[4]= new Cuentahabiente("MXMX005", "GUZMAN FERNANDO", 6);
            
            for (Cuentahabiente cuentahabiente :usuariosMuestra){
                String status = cuentahabiente.evaluarNivelCliente();
                String nombre=cuentahabiente.getNombre();
                System.out.println (nombre + " es " + status);
            }
            
}

}
