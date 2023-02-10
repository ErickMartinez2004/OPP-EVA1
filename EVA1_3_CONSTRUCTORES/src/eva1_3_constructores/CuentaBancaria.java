/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_constructores;

/**
 *
 * @author invitado
 */
public class CuentaBancaria {

    //ATRIBUTOS DE LA CLASE
    private String numcuenta;
    private double saldo;
    private String nombre;

    //constructores
    //default y con argumentos
    public CuentaBancaria() { //constructor default
        numcuenta = "-----";
        saldo = 0;
        nombre = "-----";
    }

    public CuentaBancaria(String nCuenta, double otroSaldo, String cliente) {
        numcuenta = nCuenta;
        saldo = otroSaldo;
        nombre = cliente;
    }

    //comportamiento
    //metodo get y set
    public String getNumCuenta() {
        return numcuenta;
    }

    public void setNumCuenta(String valor) {
        numcuenta = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double valor) {
        saldo = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String hola) {
        nombre = hola;
    }
}
