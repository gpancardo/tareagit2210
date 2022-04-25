package com.mycompany.cuentahabiente;

public class Cuentahabiente {

    String idCliente;
    String nombre;
    float balance;

    public Cuentahabiente(String idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    public void retirarDinero (float monto){
        balance=(balance-monto);
    }
    public String evaluarNivelCliente(){
        String cliente="Cliente ";
        if (balance<=50000){
            cliente=(cliente+"Regular");
        }
        else{
            cliente=(cliente+"Premium");
        }
        return cliente;
    }   
}
